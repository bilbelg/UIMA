

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class TraitProfil {
	
	public static void main(String[]args){
		
		String file="src/main/resources/input/profil2.txt";
		 String sortie="";
			try {
				InputStream ips=new FileInputStream(file);
				InputStreamReader ipsr=new InputStreamReader(ips);
				BufferedReader br=new BufferedReader(ipsr);
				String ligne;
				String chaine="";
	
				while((ligne=br.readLine())!=null){
					
					if(!ligne.matches("(^$)|(^\\s*$)")){
		
						if(ligne.matches("(^\\s*)((.*)\\s*)")){
							
							ligne=ligne.replaceAll("^\\s*","");
							ligne=ligne.replaceAll("\\s+$","");
							
						}
						chaine+=ligne+"\n";
					
					}
					
				}
				sortie=chaine;
				
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
			
			//creation de fichier sortie
			
			try{
				FileWriter fw=new FileWriter("src/main/resources/output/Sort.txt");
				BufferedWriter bw=new BufferedWriter(fw);
				PrintWriter fichierSortie=new PrintWriter(bw);
				fichierSortie.println(sortie);
				fichierSortie.close();
				
			}
			catch(Exception e){
				System.out.println(e.toString());
			}
			
			
	}

}
