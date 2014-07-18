
import java.util.StringTokenizer;

import org.apache.uima.UimaContext;
import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceAccessException;
import org.apache.uima.resource.ResourceInitializationException;
import org.omg.CORBA.portable.InputStream;


public class orgAnnotator extends JCasAnnotator_ImplBase {
	
	


	private StringMapResource mMap;
	
	public void process(JCas aJCas) throws AnalysisEngineProcessException {
		
		//tokenisation de profil
		String text=aJCas.getDocumentText();
		int pos = 0;
	    int pos2=0;
	    int pos3=0;
	    String token="";
			try {
				mMap=(StringMapResource)getContext().getResourceObject("org");
			} catch (ResourceAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		
		
		
		StringTokenizer tokenizer =new StringTokenizer(text," \t\n\r.<.>/?\";:[{]}\\|=+()!", true);
		String tokPres="";
	    String PresdePres="";
	    while (tokenizer.hasMoreTokens()) {
	     
	   
	    String doubleMot="";
	    String triMot="";
	      
	      if (!(token.equals(" ")||token.equals(","))){ 
	     PresdePres=tokPres;
	     tokPres=token;
	     
	      }
	      
	      token = tokenizer.nextToken();
	      
	      if (!(token.equals(" ")||token.equals(","))){
	         
	          if((token.matches("^[A-Z].*"))){
	         
	         if((tokPres.matches("^[A-Z].*"))){
	         doubleMot=tokPres+" "+token;
	         
	         
	         	if((PresdePres.matches("^[A-Z].*"))){
	         	triMot=PresdePres+" "+doubleMot;
	         	
	         	}
	         }
	          
	      }
	          }
	   
	      String expandedForm = mMap.get(token);
	      String expandedForm2=mMap.get(doubleMot);
	      String expandedForm3=mMap.get(triMot);
	      
	      if ((expandedForm != null)) {
	        // create annotation
	     
	        organisation annot = new organisation(aJCas, pos, pos + token.length(), token);
	        
	        annot.addToIndexes();
	        
	      }
	      
	      if ((expandedForm2 != null)) {
	          // create annotation
	      
	       organisation annot2 = new organisation(aJCas, pos2, pos2 + doubleMot.length(), doubleMot);
	          annot2.addToIndexes();
	        }
	      
	      if ((expandedForm3 != null)) {
	          // create annotation
	      
	       organisation annot3 = new organisation(aJCas, pos2, pos2 + triMot.length(), triMot);
	          annot3.addToIndexes();
	        }
	      
	      // incrememnt pos and go to next token
	      pos += token.length();
	      pos2 += doubleMot.length();
	      pos3 +=triMot.length();
	      
	    }
	  }
}
