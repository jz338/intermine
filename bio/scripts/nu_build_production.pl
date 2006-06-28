#!/usr/bin/perl

# Run the FlyMine production build and dump the database occasionally
# Targets are listed at the end of the script
# The database to dump will be found by reading the properties from $HOME/flymine.properties

use strict;
use warnings;

use Expect;
use Getopt::Std;
use Cwd;

my @ant_command = ("ant");

# All mines should have a project xml in their root directory in addition to the conf file.
my $proj_file_name = "project.xml";
# Gets appened to the end of the supplied mine name so the script can look for
# the right configuration file.
my $conf_file_name = "build.conf";

my $dump_file_prefix;
my $dump_host;

sub usage
{
  die <<'EOF';
usage:
  $0 [-v] [-l | -r] [-V version_number] dump_host dump_file_prefix 
or
  $0 [-v] [-l | -r] [-V version_number] dump_host dump_file_prefix 

flags:
 -v is passed to ant
 -l attempt to restart by reading the last dump file
 -r attempt to restart just after the last dump point _without_ loading a dump
 -V set the release number to pass to ant (as -Drelease=release_number)

example:
  $0 gollum /tmp/production_dump
EOF
}

my $verbose = 0;
my $load_last = 0;
my $restart = 0;
my $release;

my %opts = ();

getopts('vrlV:', \%opts);

if ($opts{v}) {
  $verbose = 1;
}

if ($opts{l}) {
  $load_last = 1;
}

if ($opts{r}) {
  $restart = 1;
}

if ($opts{V}) {
  $release=$opts{V};
  push @ant_command, "-Drelease=$release"
}

if (@ARGV == 2) {
  $dump_host = $ARGV[0];
  $dump_file_prefix = $ARGV[1];
} else {
  usage;
}

my $mine_properties = getMinePropsFile();
print STDOUT "$mine_properties\n";

#
#
# Look for the config file for the build process
# TODO: perhaps the functionality of the conf file should be merged into the project.xml file for each mine.
print STDOUT "\$conf_file_name = $conf_file_name\n";
my $conf_file = findFile($conf_file_name);
#
# Look for the project file
print STDOUT "\$proj_file_name = $proj_file_name\n";
my $proj_file = findFile($proj_file_name);

sub findFile {
  
  my $file_name = shift;
  
  if ($file_name eq undef) {
    die "Subroutine findFile() requires a file name in order to work!";  
  }
  
  if (-e $file_name) {
    if (-r $file_name) {
      return $file_name;
    } else {
      die "Cannot read from file: $file_name\n";
    }
  } else {
    die "Cannot find file named: $file_name\n";
  }  
}

sub getMinePropsFile {
  
  #perl -e '$a="/sfwuierf/wefjiweofj/wefjiweuof"; if ($a =~ m:.*/(.*):) { print "$1\n";}'
  
  my $mine_prps = $ENV{HOME};
  
    if (getcwd() =~ m:.*/(.*): ) {
      
      $mine_prps .= "/$1.properties";
    
      if (! -e $mine_prps) {
        die "Unable to find file $mine_prps";
     }
      if (! -r $mine_prps) {
        die "Unable to read file $mine_prps";
     }
      return $mine_prps;
    }
    else {
      die "Can't resolve the current mine dir\n";
    }
}





my $log_file = "pbuild.log";

open LOG, ">>$log_file" or die "can't open $log_file: $!\n";
my $old_handle = select(LOG);
$| = 1; # autoflush
select $old_handle;

if (defined $release) {
  $mine_properties .= ".$release";
}
my @dump_command = qw[pg_dump -c];
my @psql_command = qw[psql -q];

sub log_message
{
  my $message = shift;
  my $verbose = shift;

  if (defined $message) {
    print LOG "$message\n";
    if (defined $verbose && $verbose) {
      print STDERR "$message\n";
    }
  } else {
    print LOG "\n";
  }
}

sub log_and_print
{
  log_message shift, 1;
}

# run a command and exit the script if it returns a non-zero
sub run_and_check_status
{
  my $command_name = $_[0];

  log_and_print `date`, "\n\n";
  log_and_print "starting command: @_\n";

  open F, "@_ |" or die "can't run @_: $?\n";

  while (<F>) {
    chomp;
    log_message "  [$command_name] $_";
  }

  log_and_print `date`, "\n\n";
  log_and_print "finished\n\n";

  close F;

  if ($? != 0) {
    log_and_print "failed with exit code $?: @_\n";
    print STDERR "check log: $log_file\n";
    exit $?;
  }
}

# gets a value from a properties file
# usages: get_prop_val prop_name file_name
sub get_prop_val
{
  my $key = shift;
  my $file = shift;

  open F, "$file" or die "cannot open $file: $!\n";

  my $ret_val;

  while (my $line = <F>) {
    if ($line =~ /$key=(.*)/) {
      $ret_val = $1;
    }
  }

  close F;

  return $ret_val;
}

sub dump_db
{
  my $db = shift;
  my $user = shift;
  my $pass = shift;
  my $host = shift;
  my $port = shift;
  my $out_file = shift;

  my @params = ('-U', $user, '-h', $host, '-W', '-f', $out_file, $db);

  if (defined $port) {
    unshift @params, "-p", $port;
  }

  log_and_print `date`, "\n\n";
  log_and_print "\ndumping: @dump_command @params\n";

  my $exp = new Expect;

  $exp->raw_pty(1);
  $exp->spawn("ssh", $dump_host, "@dump_command @params; echo __DUMP_FINISHED__")
    or die "Cannot spawn @dump_command @params: $!\n";

  $exp->expect(10, 'Password: ');
  $exp->send("$pass\n");
  $exp->expect(9999999, '__DUMP_FINISHED__\n');
  $exp->soft_close();
  log_and_print `date`, "\n\n";
  log_and_print "finished dump\n\n";
}

sub load_db
{
  my $db = shift;
  my $user = shift;
  my $pass = shift;
  my $host = shift;
  my $port = shift;
  my $in_file = shift;

  my @params = ('-U', $user, '-h', $host, '-f', $in_file, $db);

  if (defined $port) {
    unshift @params, "-p", $port;
  }

  log_and_print `date`, "\n\n";
  log_and_print "\nloading: @psql_command @params\n";

  my $exp = new Expect;

  $exp->raw_pty(1);
  $exp->spawn("ssh", $dump_host, "@psql_command @params; echo __LOAD_FINISHED__")
    or die "Cannot spawn @psql_command @params: $!\n";

  $exp->expect(10, 'Password: ');
  $exp->send("$pass\n");
  $exp->expect(9999999, '__LOAD_FINISHED__\n');
  $exp->soft_close();



  log_and_print `date`, "\n\n";
  log_and_print "finished load - now analysing\n\n";

  run_and_check_status @ant_command, "analyse-db-production";

  log_and_print `date`, "\n\n";
  log_and_print "finished analysing\n\n";
}

sub get_actions
{
  my @actions = ();

  open CONF_FILE, "$conf_file"
    or die "cannot open $conf_file: $!\n";

  while (defined (my $line = <CONF_FILE>)) {
    if ($line =~ m{
                   ^\s*\#
                   |
                   ^\s*$
                 }x) {
      next;
    }

    my ($action_type, @args) = split " ", $line;

    $action_type =~ s/:$//;

    push @actions, {type => $action_type, args => [@args]};
  }

  close CONF_FILE;

  return @actions;
}

# find the last existing dump file
sub get_restart_dump_suffix
{
  my ($dump_file_prefix, @actions) = @_;

  my %remote_suffixes = ();

  open REMOTE, qq{ssh $dump_host "ls -1 $dump_file_prefix.*"|};

  while (my $line = <REMOTE>) {
    chomp $line;
    if ($line =~ /$dump_file_prefix.(.*)/) {
      $remote_suffixes{$1} = 1;
    }
  }

  my $restart_dump_suffix = undef;

  for my $action (@actions) {
    my $action_type = $action->{type};
    my @action_args = @{$action->{args}};

    if ($action_type eq 'dump') {
      if (exists $remote_suffixes{$action_args[0]}) {
        $restart_dump_suffix = $action_args[0];
      }
    }
  }

  return $restart_dump_suffix;
}

my $prod_host = get_prop_val "db.production.datasource.serverName", $mine_properties;
my $prod_db = get_prop_val "db.production.datasource.databaseName", $mine_properties;
my $prod_user = get_prop_val "db.production.datasource.user", $mine_properties;
my $prod_pass = get_prop_val "db.production.datasource.password", $mine_properties;
my $prod_port;

if ($prod_host =~ /(.+):(\d+)/) {
  $prod_host = $1;
  $prod_port = $2;
}

log_message "read properties:";
log_message "  prod_host: $prod_host";
log_message "  prod_port: " . (defined($prod_port) ? $prod_port : "default");
log_message "  prod_db: $prod_db";
log_message "  prod_user: $prod_user";
log_message "  prod_pass: $prod_pass";
log_message;

my @actions = get_actions();

my $restart_dump_suffix = undef;

if ($load_last || $restart) {
  $restart_dump_suffix = get_restart_dump_suffix($dump_file_prefix, @actions);

  if (defined $restart_dump_suffix) {
    my $dump_file_name = "$dump_file_prefix.$restart_dump_suffix";

    if ($load_last) {
      log_and_print "\nrestarting from $dump_file_name\n";
      load_db $prod_db, $prod_user, $prod_pass, $prod_host, $prod_port, $dump_file_name;
    } else {
      log_and_print "\nrestarting build at stage: $restart_dump_suffix - NOT loading dump\n";
    }
  } else {
    warn "no dump file found with prefix $dump_file_prefix\n";
  }
}

my $seen_start_action = 0;

if ((!$load_last && !$restart) || !defined $restart_dump_suffix) {
  # always start at the beginning of the command list if we aren't restarting
  $seen_start_action = 1;
}

for my $action (@actions) {
  my $action_type = $action->{type};
  my @action_args = @{$action->{args}};

  if ($seen_start_action) {
    if ($action_type eq 'run') {
      if ($verbose) {
        run_and_check_status @ant_command, "-v", @action_args;
      } else {
        run_and_check_status @ant_command, @action_args;
      }
    } else {
      if ($action_type eq 'dump') {
        if (@action_args != 1) {
          die "dump: needs one parameter at: $action: @action_args\n";
        }
        dump_db $prod_db, $prod_user, $prod_pass, $prod_host, $prod_port,
                "$dump_file_prefix.$action_args[0]";
      } else {
        die qq{unknown action "$action_type"\n};
      }
    }
  } else {
    if ($action_type eq 'dump' && $action_args[0] eq $restart_dump_suffix) {
      $seen_start_action = 1;
    }
  }
}

