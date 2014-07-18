

import java.io.*;
import org.jdom.*;
import org.jdom.input.*;
import java.util.HashMap;
import java.util.List;
import java.util.Iterator;


public class ManipXmlSortie {
	static org.jdom.Document document;
	static Element racine;
	
	public static void main (String[]args){
		//crée une instance de SAXBuilder
		SAXBuilder sxb = new SAXBuilder();
		
		try {
			//crée un nouveau document  JDOM avec en argument le fichier XML
			//parsing
			document=sxb.build(new File("src/main/resources/UIMA_Sortie/doc0.xmi"));
		} 
		catch (Exception e) {}
		
		//On initialise un nouvel élément racine avec l'élement racine du document 
		
		racine=document.getRootElement();
		afficheAll();
		
	}

	public static void afficheAll(){
		
	    HashMap<String,Integer> organization=new HashMap<String, Integer>();
		List listeOrg=racine.getChildren(); 
		//crée un Iterator pour parcourir la liste
		Iterator i=listeOrg.iterator();
		while(i.hasNext()){
			
			Element courant =(Element) i.next();
			if(courant.getAttributeValue("expandedForm") !=null){
			organization.put(courant.getAttributeValue("expandedForm"),1);
			}
		}
		
		for (String organisation : organization.keySet()){
			System.out.println("organisation "+organisation);
		}
	}
	
}
