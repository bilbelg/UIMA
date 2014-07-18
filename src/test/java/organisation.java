


/* First created by JCasGen Wed Jun 18 09:52:01 CEST 2014 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Jun 18 09:52:01 CEST 2014
 * XML source: /home/bilel/uima TESTS/uimaDico/OrgType.xml
 * @generated */
public class organisation extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(organisation.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected organisation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public organisation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public organisation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public organisation(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: expandedForm

  /** getter for expandedForm - gets 
   * @generated
   * @return value of the feature 
   */
  public String getExpandedForm() {
    if (organisation_Type.featOkTst && ((organisation_Type)jcasType).casFeat_expandedForm == null)
      jcasType.jcas.throwFeatMissing("expandedForm", "organisation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((organisation_Type)jcasType).casFeatCode_expandedForm);}
    
  /** setter for expandedForm - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setExpandedForm(String v) {
    if (organisation_Type.featOkTst && ((organisation_Type)jcasType).casFeat_expandedForm == null)
      jcasType.jcas.throwFeatMissing("expandedForm", "organisation");
    jcasType.ll_cas.ll_setStringValue(addr, ((organisation_Type)jcasType).casFeatCode_expandedForm, v);}    


    /** constructor taking all parameters */
 
  public organisation(JCas jcas,int Start,int end,String expandedForm){
	  super(jcas,Start,end);
	  setExpandedForm(expandedForm);
  }
}