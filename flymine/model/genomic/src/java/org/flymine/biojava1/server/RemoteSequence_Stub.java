// Stub class generated by rmic, do not edit.
// Contents subject to change without notice.

package org.flymine.biojava1.server;

public final class RemoteSequence_Stub
    extends java.rmi.server.RemoteStub
    implements org.flymine.biojava1.server.IRemoteSequence, java.rmi.Remote
{
    private static final long serialVersionUID = 2;
    
    private static java.lang.reflect.Method $method_addChangeListener_0;
    private static java.lang.reflect.Method $method_addChangeListener_1;
    private static java.lang.reflect.Method $method_containsFeature_2;
    private static java.lang.reflect.Method $method_countFeatures_3;
    private static java.lang.reflect.Method $method_createFeature_4;
    private static java.lang.reflect.Method $method_edit_5;
    private static java.lang.reflect.Method $method_features_6;
    private static java.lang.reflect.Method $method_filter_7;
    private static java.lang.reflect.Method $method_filter_8;
    private static java.lang.reflect.Method $method_getAlphabet_9;
    private static java.lang.reflect.Method $method_getAnnotation_10;
    private static java.lang.reflect.Method $method_getName_11;
    private static java.lang.reflect.Method $method_getSchema_12;
    private static java.lang.reflect.Method $method_getURN_13;
    private static java.lang.reflect.Method $method_isUnchanging_14;
    private static java.lang.reflect.Method $method_iterator_15;
    private static java.lang.reflect.Method $method_length_16;
    private static java.lang.reflect.Method $method_removeChangeListener_17;
    private static java.lang.reflect.Method $method_removeChangeListener_18;
    private static java.lang.reflect.Method $method_removeFeature_19;
    private static java.lang.reflect.Method $method_selectWorkingChromosome_20;
    private static java.lang.reflect.Method $method_seqString_21;
    private static java.lang.reflect.Method $method_subList_22;
    private static java.lang.reflect.Method $method_subStr_23;
    private static java.lang.reflect.Method $method_symbolAt_24;
    private static java.lang.reflect.Method $method_toList_25;
    
    static {
	try {
	    $method_addChangeListener_0 = org.flymine.biojava1.server.IRemoteSequence.class.getMethod("addChangeListener", new java.lang.Class[] {org.biojava.utils.ChangeListener.class});
	    $method_addChangeListener_1 = org.flymine.biojava1.server.IRemoteSequence.class.getMethod("addChangeListener", new java.lang.Class[] {org.biojava.utils.ChangeListener.class, org.biojava.utils.ChangeType.class});
	    $method_containsFeature_2 = org.flymine.biojava1.server.IRemoteSequence.class.getMethod("containsFeature", new java.lang.Class[] {org.biojava.bio.seq.Feature.class});
	    $method_countFeatures_3 = org.flymine.biojava1.server.IRemoteSequence.class.getMethod("countFeatures", new java.lang.Class[] {});
	    $method_createFeature_4 = org.flymine.biojava1.server.IRemoteSequence.class.getMethod("createFeature", new java.lang.Class[] {org.biojava.bio.seq.Feature.Template.class});
	    $method_edit_5 = org.flymine.biojava1.server.IRemoteSequence.class.getMethod("edit", new java.lang.Class[] {org.biojava.bio.symbol.Edit.class});
	    $method_features_6 = org.flymine.biojava1.server.IRemoteSequence.class.getMethod("features", new java.lang.Class[] {});
	    $method_filter_7 = org.flymine.biojava1.server.IRemoteSequence.class.getMethod("filter", new java.lang.Class[] {org.biojava.bio.seq.FeatureFilter.class});
	    $method_filter_8 = org.flymine.biojava1.server.IRemoteSequence.class.getMethod("filter", new java.lang.Class[] {org.biojava.bio.seq.FeatureFilter.class, boolean.class});
	    $method_getAlphabet_9 = org.flymine.biojava1.server.IRemoteSequence.class.getMethod("getAlphabet", new java.lang.Class[] {});
	    $method_getAnnotation_10 = org.flymine.biojava1.server.IRemoteSequence.class.getMethod("getAnnotation", new java.lang.Class[] {});
	    $method_getName_11 = org.flymine.biojava1.server.IRemoteSequence.class.getMethod("getName", new java.lang.Class[] {});
	    $method_getSchema_12 = org.flymine.biojava1.server.IRemoteSequence.class.getMethod("getSchema", new java.lang.Class[] {});
	    $method_getURN_13 = org.flymine.biojava1.server.IRemoteSequence.class.getMethod("getURN", new java.lang.Class[] {});
	    $method_isUnchanging_14 = org.flymine.biojava1.server.IRemoteSequence.class.getMethod("isUnchanging", new java.lang.Class[] {org.biojava.utils.ChangeType.class});
	    $method_iterator_15 = org.flymine.biojava1.server.IRemoteSequence.class.getMethod("iterator", new java.lang.Class[] {});
	    $method_length_16 = org.flymine.biojava1.server.IRemoteSequence.class.getMethod("length", new java.lang.Class[] {});
	    $method_removeChangeListener_17 = org.flymine.biojava1.server.IRemoteSequence.class.getMethod("removeChangeListener", new java.lang.Class[] {org.biojava.utils.ChangeListener.class});
	    $method_removeChangeListener_18 = org.flymine.biojava1.server.IRemoteSequence.class.getMethod("removeChangeListener", new java.lang.Class[] {org.biojava.utils.ChangeListener.class, org.biojava.utils.ChangeType.class});
	    $method_removeFeature_19 = org.flymine.biojava1.server.IRemoteSequence.class.getMethod("removeFeature", new java.lang.Class[] {org.biojava.bio.seq.Feature.class});
	    $method_selectWorkingChromosome_20 = org.flymine.biojava1.server.IRemoteSequence.class.getMethod("selectWorkingChromosome", new java.lang.Class[] {java.lang.String.class, java.lang.String.class});
	    $method_seqString_21 = org.flymine.biojava1.server.IRemoteSequence.class.getMethod("seqString", new java.lang.Class[] {});
	    $method_subList_22 = org.flymine.biojava1.server.IRemoteSequence.class.getMethod("subList", new java.lang.Class[] {int.class, int.class});
	    $method_subStr_23 = org.flymine.biojava1.server.IRemoteSequence.class.getMethod("subStr", new java.lang.Class[] {int.class, int.class});
	    $method_symbolAt_24 = org.flymine.biojava1.server.IRemoteSequence.class.getMethod("symbolAt", new java.lang.Class[] {int.class});
	    $method_toList_25 = org.flymine.biojava1.server.IRemoteSequence.class.getMethod("toList", new java.lang.Class[] {});
	} catch (java.lang.NoSuchMethodException e) {
	    throw new java.lang.NoSuchMethodError(
		"stub class initialization failed");
	}
    }
    
    // constructors
    public RemoteSequence_Stub(java.rmi.server.RemoteRef ref) {
	super(ref);
    }
    
    // methods from remote interfaces
    
    // implementation of addChangeListener(ChangeListener)
    public void addChangeListener(org.biojava.utils.ChangeListener $param_ChangeListener_1)
	throws java.rmi.RemoteException
    {
	try {
	    ref.invoke(this, $method_addChangeListener_0, new java.lang.Object[] {$param_ChangeListener_1}, 4622283046328122326L);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of addChangeListener(ChangeListener, ChangeType)
    public void addChangeListener(org.biojava.utils.ChangeListener $param_ChangeListener_1, org.biojava.utils.ChangeType $param_ChangeType_2)
	throws java.rmi.RemoteException
    {
	try {
	    ref.invoke(this, $method_addChangeListener_1, new java.lang.Object[] {$param_ChangeListener_1, $param_ChangeType_2}, -6749474226002871975L);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of containsFeature(Feature)
    public boolean containsFeature(org.biojava.bio.seq.Feature $param_Feature_1)
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_containsFeature_2, new java.lang.Object[] {$param_Feature_1}, -596027085678865938L);
	    return ((java.lang.Boolean) $result).booleanValue();
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of countFeatures()
    public int countFeatures()
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_countFeatures_3, null, -7137768465573897652L);
	    return ((java.lang.Integer) $result).intValue();
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of createFeature(Feature.Template)
    public org.biojava.bio.seq.Feature createFeature(org.biojava.bio.seq.Feature.Template $param_Feature$Template_1)
	throws java.rmi.RemoteException, org.biojava.bio.BioException, org.biojava.utils.ChangeVetoException
    {
	try {
	    Object $result = ref.invoke(this, $method_createFeature_4, new java.lang.Object[] {$param_Feature$Template_1}, -506450401696550598L);
	    return ((org.biojava.bio.seq.Feature) $result);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (org.biojava.bio.BioException e) {
	    throw e;
	} catch (org.biojava.utils.ChangeVetoException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of edit(Edit)
    public void edit(org.biojava.bio.symbol.Edit $param_Edit_1)
	throws java.lang.IndexOutOfBoundsException, java.rmi.RemoteException, org.biojava.bio.symbol.IllegalAlphabetException, org.biojava.utils.ChangeVetoException
    {
	try {
	    ref.invoke(this, $method_edit_5, new java.lang.Object[] {$param_Edit_1}, 3930128086024343378L);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (org.biojava.bio.symbol.IllegalAlphabetException e) {
	    throw e;
	} catch (org.biojava.utils.ChangeVetoException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of features()
    public java.util.Iterator features()
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_features_6, null, -2150456902545832194L);
	    return ((java.util.Iterator) $result);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of filter(FeatureFilter)
    public org.biojava.bio.seq.FeatureHolder filter(org.biojava.bio.seq.FeatureFilter $param_FeatureFilter_1)
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_filter_7, new java.lang.Object[] {$param_FeatureFilter_1}, -262723127978013526L);
	    return ((org.biojava.bio.seq.FeatureHolder) $result);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of filter(FeatureFilter, boolean)
    public org.biojava.bio.seq.FeatureHolder filter(org.biojava.bio.seq.FeatureFilter $param_FeatureFilter_1, boolean $param_boolean_2)
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_filter_8, new java.lang.Object[] {$param_FeatureFilter_1, new java.lang.Boolean($param_boolean_2)}, -208616416690097527L);
	    return ((org.biojava.bio.seq.FeatureHolder) $result);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of getAlphabet()
    public org.biojava.bio.symbol.Alphabet getAlphabet()
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_getAlphabet_9, null, 1377040887689800320L);
	    return ((org.biojava.bio.symbol.Alphabet) $result);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of getAnnotation()
    public org.biojava.bio.Annotation getAnnotation()
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_getAnnotation_10, null, -4635244781211867745L);
	    return ((org.biojava.bio.Annotation) $result);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of getName()
    public java.lang.String getName()
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_getName_11, null, 6317137956467216454L);
	    return ((java.lang.String) $result);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of getSchema()
    public org.biojava.bio.seq.FeatureFilter getSchema()
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_getSchema_12, null, -4262084888610107095L);
	    return ((org.biojava.bio.seq.FeatureFilter) $result);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of getURN()
    public java.lang.String getURN()
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_getURN_13, null, -1537201851216605633L);
	    return ((java.lang.String) $result);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of isUnchanging(ChangeType)
    public boolean isUnchanging(org.biojava.utils.ChangeType $param_ChangeType_1)
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_isUnchanging_14, new java.lang.Object[] {$param_ChangeType_1}, -491059091557723298L);
	    return ((java.lang.Boolean) $result).booleanValue();
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of iterator()
    public java.util.Iterator iterator()
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_iterator_15, null, -8129405733403011693L);
	    return ((java.util.Iterator) $result);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of length()
    public int length()
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_length_16, null, 5906054872755334325L);
	    return ((java.lang.Integer) $result).intValue();
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of removeChangeListener(ChangeListener)
    public void removeChangeListener(org.biojava.utils.ChangeListener $param_ChangeListener_1)
	throws java.rmi.RemoteException
    {
	try {
	    ref.invoke(this, $method_removeChangeListener_17, new java.lang.Object[] {$param_ChangeListener_1}, 4813215107442168912L);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of removeChangeListener(ChangeListener, ChangeType)
    public void removeChangeListener(org.biojava.utils.ChangeListener $param_ChangeListener_1, org.biojava.utils.ChangeType $param_ChangeType_2)
	throws java.rmi.RemoteException
    {
	try {
	    ref.invoke(this, $method_removeChangeListener_18, new java.lang.Object[] {$param_ChangeListener_1, $param_ChangeType_2}, -5368548745736160969L);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of removeFeature(Feature)
    public void removeFeature(org.biojava.bio.seq.Feature $param_Feature_1)
	throws java.rmi.RemoteException, org.biojava.bio.BioException, org.biojava.utils.ChangeVetoException
    {
	try {
	    ref.invoke(this, $method_removeFeature_19, new java.lang.Object[] {$param_Feature_1}, 4004844693526326845L);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (org.biojava.bio.BioException e) {
	    throw e;
	} catch (org.biojava.utils.ChangeVetoException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of selectWorkingChromosome(String, String)
    public void selectWorkingChromosome(java.lang.String $param_String_1, java.lang.String $param_String_2)
	throws java.rmi.RemoteException
    {
	try {
	    ref.invoke(this, $method_selectWorkingChromosome_20, new java.lang.Object[] {$param_String_1, $param_String_2}, -7553834824256718136L);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of seqString()
    public java.lang.String seqString()
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_seqString_21, null, -5088262187751766100L);
	    return ((java.lang.String) $result);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of subList(int, int)
    public org.biojava.bio.symbol.SymbolList subList(int $param_int_1, int $param_int_2)
	throws java.lang.IndexOutOfBoundsException, java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_subList_22, new java.lang.Object[] {new java.lang.Integer($param_int_1), new java.lang.Integer($param_int_2)}, 1414298343221969864L);
	    return ((org.biojava.bio.symbol.SymbolList) $result);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of subStr(int, int)
    public java.lang.String subStr(int $param_int_1, int $param_int_2)
	throws java.lang.IndexOutOfBoundsException, java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_subStr_23, new java.lang.Object[] {new java.lang.Integer($param_int_1), new java.lang.Integer($param_int_2)}, -8061103141049632796L);
	    return ((java.lang.String) $result);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of symbolAt(int)
    public org.biojava.bio.symbol.Symbol symbolAt(int $param_int_1)
	throws java.lang.IndexOutOfBoundsException, java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_symbolAt_24, new java.lang.Object[] {new java.lang.Integer($param_int_1)}, 3753606556086382945L);
	    return ((org.biojava.bio.symbol.Symbol) $result);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of toList()
    public java.util.List toList()
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_toList_25, null, -2377305561547639623L);
	    return ((java.util.List) $result);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
}
