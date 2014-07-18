

/* First created by JCasGen Wed Jun 18 09:52:01 CEST 2014 */

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Wed Jun 18 09:52:01 CEST 2014
 * @generated */
public class organisation_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (organisation_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = organisation_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new organisation(addr, organisation_Type.this);
  			   organisation_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new organisation(addr, organisation_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = organisation.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("organisation");
 
  /** @generated */
  final Feature casFeat_expandedForm;
  /** @generated */
  final int     casFeatCode_expandedForm;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getExpandedForm(int addr) {
        if (featOkTst && casFeat_expandedForm == null)
      jcas.throwFeatMissing("expandedForm", "organisation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_expandedForm);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setExpandedForm(int addr, String v) {
        if (featOkTst && casFeat_expandedForm == null)
      jcas.throwFeatMissing("expandedForm", "organisation");
    ll_cas.ll_setStringValue(addr, casFeatCode_expandedForm, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public organisation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_expandedForm = jcas.getRequiredFeatureDE(casType, "expandedForm", "uima.cas.String", featOkTst);
    casFeatCode_expandedForm  = (null == casFeat_expandedForm) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_expandedForm).getCode();

  }
}



    