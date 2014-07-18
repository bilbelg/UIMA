

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import org.apache.uima.resource.DataResource;
import org.apache.uima.resource.ResourceInitializationException;
import org.apache.uima.resource.SharedResourceObject;

public class StringMapRessource_impl implements StringMapResource, SharedResourceObject{
	
	private Map <String, String> mMap= new HashMap<String ,String>();

	public void load(DataResource aData) throws ResourceInitializationException {
		// TODO Auto-generated method stub
		
		InputStream inStr = null;
		
		try {
			//open input stream to data
			inStr = aData.getInputStream();
			//read each line
			BufferedReader reader = new BufferedReader(new InputStreamReader(inStr));
			String line;
			while((line=reader.readLine()) != null){
				// the first tab on each line separates key from values
				//keys cannot contain whitespace
				
				int tabPos =line.indexOf('\t');
				String Key= line.substring(0,tabPos);
				String val=line.substring(tabPos+1);
				mMap.put(Key, val);
				
				
			}
			
		} catch (IOException e) {
		throw new ResourceInitializationException(e);
		}
		finally{
			if(inStr !=null){
				try {
					inStr.close();
				} catch (IOException e) {
					
				}
			}
		}
		
	}
	
	//recuperer la liste des key de mMap
	public String get(String aKey) {
		return (String)mMap.get(aKey);
		
	}
	
	
}
