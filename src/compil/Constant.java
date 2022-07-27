package compil;

public class Constant {
	public static boolean constant(String mot) {
		for(mot_clé m : mot_clé.values()) {
			  if(m.getnom().equals(mot)) {
				  return false;
			  }
		  }
		 
		   int i=0;//la position dans la chaine
		  
		   
		  
		   
		if(numColonne(mot.charAt(0))==1) {
			   while(i<mot.length()&& numColonne(mot.charAt(i))!=0) {
				   
				 i++;  	  
				   
		   }
			   int b = i % 2;
			   if(i==mot.length() && b!=0 ) {
				   return true;
			   }else {
				   return false;
			   }
		   
		   }
		   else {
			   return false;
		   }


			
	   
			
			
			
		}
	public static int numColonne(char tc) {
		
		
		if(tc >='0' && tc <='9')
			return 1;
		
		return 0;
		
		
	}
	

	}
