package compil;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


import javax.swing.JTextArea;



// here there are a problem when we found the second brakets we can't now 
// if we call expression or condition 



public class Syntax {
	
	public static void Syntaxique(JTextArea regles) throws IOException {
		
		ArrayList<String> jetons = new ArrayList<String>();
		
		File fileoutput2  = new File ("C:\\Users\\PC\\Desktop\\JETONS.txt");
		 
					
				 try (Scanner sc = new Scanner(fileoutput2)) {
					while(sc.hasNextLine()) {
						 
						 String linecontainre = sc.nextLine();
						 if(!linecontainre.isEmpty()) {
							 jetons.add(linecontainre);}
						 
						 
					 }
					System.out.print(jetons);
				}
			 
			 
			
			int j= programmealgo(jetons,regles) ;
			if(j!=0) {
				regles.append("\n*****programme ready to run*****");
				
			}
			
		
	}
		 
			
			
	public static boolean nomounon(String mot) {
		for(mot_clé m : mot_clé.values()) {
			  if(m.getnom().equals(mot)) {
				  return false;
			  }
		  }
		 
		   int i=0;
		  
		   int c=0;
		   
		if(numColonne(mot.charAt(0))==1) {
			   while(i<mot.length()&& numColonne(mot.charAt(i))!=0) {
			   if(numColonne(mot.charAt(i))==1) {c++;}
				   i++;
		   }
			   int k = c % 2;
			   if(i==mot.length() && k==0) {
				   return true;
				   
					   
				   }
				   
			   }
		return false;			  		   		   
}
	
			
		
	public static int numColonne(char tc) {
		
		if(tc>='A' && tc<='z')
			return 1;
		if(tc >='0' && tc <='9')
			return 2;
		return 0;
		
		
	}
	

	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
				 public static int programmealgo(ArrayList<String> jetons,JTextArea regles) {
					 int j=0;
					String linecontainer= jetons.get(j);
					
					if(linecontainer.equalsIgnoreCase("programme") ) {
						j++;
						regles.setText("<programme algo>");
						if(nomounon(jetons.get(j))) {
							regles.append("\n<nom>");
							j++;
							if(jetons.get(j).equalsIgnoreCase(";")) {
								j++;
								
							regles.append("\n<corps>");	 
							int k= corps(jetons,j,regles);
							
							if(k!=0) {
								k++;
								
								if(jetons.get(k).equalsIgnoreCase(".")) {
									System.out.print(" programme correct");
									return k;
									
									
								}else {regles.append("\n missing.");
									
									return 0;}
								
							}
							return 0;
							}else { regles.append("\n missing ;");
								
							return 0;}
						}else {regles.append("\n identificateur incorrect");
							
							return 0;}
						
					 }else { regles.setText("\n Mot programme incorrect");
					 return 0;}
				 }
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 public static int corps(ArrayList<String> jetons,int j,JTextArea regles) {
					 String linecontainer= jetons.get(j);
					 if(linecontainer.equalsIgnoreCase("const")) {
						 regles.append("\n<partie definition constante>");
						 j++;
						int k= definitionconst(jetons, j,regles);
						if(k!=0) {
							regles.append("\n<definition constante>");
							k++;
							k = corps(jetons,k,regles);
							return k;
						}else {
							return 0;
						}
					 }else if(linecontainer.equalsIgnoreCase("var")) {
						 regles.append("\n<partie definition variable>");
						 j++;
						int k=  definitionv(jetons, j,regles);
						if(k!=0) {
							regles.append("\n<definition variable>");
							k++;
							k = corps(jetons,k,regles);
							return k;
						}else {
							return 0;
						}
					 
						 
					 }else if(linecontainer.equalsIgnoreCase("debut")) {
						 regles.append("\n<Instrcomp>");
						 
						int k= instrcomp(jetons,j,regles);
						return k;
						
						 
					 }
					 else {return 0;}
					 
				 
				 
						
					
					
					 } 
			 
			 
				 public static int instrcomp(ArrayList<String> jetons,int j,JTextArea regles) {
					 String linecontainer= jetons.get(j); 
					 if(linecontainer.equalsIgnoreCase("debut")) {
						 j++;
						 int k = instruction(jetons,j,regles);
						 if(k!=0) {
							 regles.append("\n<instruction>");
							k++;
							
							
							
							
							 if(jetons.get(k).equalsIgnoreCase("fin")) {
								 
								 return k;
								
							 }else {
								 regles.append("missing fin");
								 return 0;}
						 }else {return 0;}
						 
						 
					 }else { }
					 
					 return 0;
					 
					 
				 }
				 public static int instruction(ArrayList<String> jetons,int j,JTextArea regles) {
					 String linecontainer= jetons.get(j);
					 if(nomounon(linecontainer)) {
						 regles.append("\n<instruction affectation>");
						 j++;
						 int k=instructionaffectation(jetons,j,regles);
						 k++;
						 if(jetons.get(k).contains(";")) {
							 
							 k++;
							 k=instruction(jetons,k,regles);
							 return k;
						 }else {
							 
							 k--;
						 return k;}
						 
					 }else if(linecontainer.contains("si")) {
						 regles.append("\n<instruction si>");
						 j++;
						 int k=instructionsi(jetons,j,regles);
						 k++;
						 if(jetons.get(k).contains(";")) {
							 
							 k++;
							 k=instruction(jetons,k,regles);
							 return k;
						 }else {
							 k--;
						 return k;}
						 
						 
						 
					 }else if(linecontainer.contains("debut")) {
						 j++;
						 int k=instruction(jetons,j,regles);
						 if(k!=0) {
							 k++;
							 if(jetons.get(k).contains("fin")) {
								 return k;
							 }else {return 0;}
						 }
						 return k;
					 }else if (linecontainer.contains("tantque")) {
						 regles.append("\n<instruction tantque>");
						 j++;
						 int k=instructiontantque(jetons,j,regles);
						 k++;
						 if(jetons.get(k).contains(";")) {
							 
							 k++;
							 k=instruction(jetons,k,regles);
							 return k;
						 }else {
							 k--;
						 return k;}
					 }else if(linecontainer.contains("fin")){
						 j--;
						 return j;}
					 else { regles.append("\n mot cle invalid"); }
					return 0;
					 
					 
					
					 
				 }
			 
			 
				 public static int instructionaffectation(ArrayList<String> jetons,int j,JTextArea regles) {
					 String linecontainer= jetons.get(j);
					 if(linecontainer.contains(":=")) {
						 j++;
						 int k=expression(jetons,j,regles);
						 
						 
						 return k;
					 }else {regles.append("\nmissing :=");}
					 return 0;
				 }
				 
				 public static int instructionsi(ArrayList<String> jetons,int j,JTextArea regles) {
					 
					 int k=condition(jetons,j,regles);
					 if(k!=0) {
						 
						
						 if(jetons.get(k).contains("alors")) {
							 k++;
							 k=instruction(jetons,k,regles);
							 if(k!=0) {
								 
								 
								 k++;
								 if(jetons.get(k).contains("sinon")) {
									 k++;
									 k = instruction(jetons,k,regles);
									 if(k!=0) {
										 
									 return k;}else {return 0;}
									 
								 }else {k--;
									 return k;}
							 }
							 return k;
						 }else {regles.append("\n mot cle alors incorrect");}
					 }
					 return 0;
					 
				 }
				 
				 
				 
				 public static int condition(ArrayList<String> jetons,int j,JTextArea regles) {
					String linecontainer= jetons.get(j);
					 
					 if(linecontainer.contains("(")) {
						     j++; 
							 int k=condition(jetons,j,regles);
							
							
								 if(jetons.get(k).equalsIgnoreCase(")")) {
									 k++;
									 if(operateurlogique(jetons,k)) {
										 k++;
										 k=expression(jetons,k,regles);
										 k++;
										 if(operateurlogique(jetons,k)) {
											 k++;
											 k=condition(jetons,k,regles);
											 return k; 
										 }else {
											 return k;
										 }
										 
									 }else if(jetons.get(k).equalsIgnoreCase("ou")||jetons.get(k).equalsIgnoreCase("et")) {
										 k++;
										 k=condition(jetons,k,regles);
										 return k;}
									 else  {
										 return k;
									 }
									 
							     }
								 
							 else if(jetons.get(k).equalsIgnoreCase("ou")||jetons.get(k).equalsIgnoreCase("et")){
								 k++;
								 k=condition(jetons,k,regles);
								 return k;}
						 }
					 
					 
					 
					 
					 
					 
					 
					 
					 else if(linecontainer.contains("non")) {
						 j++;
						int k=condition(jetons,j,regles);
						 if(k!=0) {
							 
							
								 return k;
							 }
						 }
					 
					 
					 
					 else if (nomounon(linecontainer)) {
							 int k=expression(jetons,j,regles);
							 k++;
		
							  if(operateurlogique(jetons,k)) {
								 k++;
								 k=expression(jetons,k,regles);
								 
									 k++;
									 if(jetons.get(k).equalsIgnoreCase("ou")||jetons.get(k).equalsIgnoreCase("et")) {
										 k++;
										 k=condition(jetons,k,regles);
										 return k;
									 }
									 else if(operateurlogique(jetons,k)){
										 k++;
										 k=expression(jetons,k,regles);
										 return k;}
									 else {
										 return k;
									 }
								 
								 
							 }
							 else { return k;}
							 
						 }
					return 0;
					 }
						
						 
					
					 
				 public static int instructiontantque(ArrayList<String> jetons,int j,JTextArea regles) {
					 int k=condition(jetons,j,regles);
					 if(k!=0) {
						 
						
						 if(jetons.get(k).equalsIgnoreCase("faire")) {
							 k++;
							 k=instruction(jetons,k,regles);
							 return k;
						 } else {regles.append("mot cle faire incorrect");}
						 
					 }return 0;
				 }		 
					 
					 
				 
			 
				
				 
				 
				 
				 public static int definitionconst(ArrayList<String> jetons,int j,JTextArea regles) {
					 String linecontainer= jetons.get(j);
						if(nomounon(linecontainer) ) {
							 j++;
							 if(jetons.get(j).equalsIgnoreCase("=")) {
								 j++;
								 if(Constant.constant(jetons.get(j))||nomounon(jetons.get(j)) ) {
									 j++;
									 if(j<jetons.size()&&jetons.get(j).equalsIgnoreCase(";")) {
										 j++;
										 if(j<jetons.size() && nomounon(jetons.get(j))) {
											 
											int k= definitionconst(jetons,j,regles);
											
											return k;
										 }
										 else { 
										 j--;
											return j;
											 }
									 
								 } else{regles.append("\n missing ;");} 
							 }else{regles.append("\n constante incorrecte");}
							
						 }else{regles.append("\n missing =");}
						
					 }else{regles.append("\n identificateur incorrect");}
						 
					 
						return 0;
				 }
				 
				 
				
				 
				
						
			 
				 public static int definitionv(ArrayList<String> jetons,int j,JTextArea regles) {
					 String linecontainer= jetons.get(j);
						if(nomounon(linecontainer)) {
							j++;
							if(jetons.get(j).equalsIgnoreCase(",")) {
								j++;
								 int k=definitionv(jetons,j,regles);
								 return k;
								
								}
							else if(jetons.get(j).equalsIgnoreCase(":")) {
								j++;
								if(jetons.get(j).equalsIgnoreCase("entier")||jetons.get(j).equalsIgnoreCase("reel")) {
									j++;
									if(jetons.get(j).equalsIgnoreCase(";")) {
										j++;
										if(nomounon(jetons.get(j))) {
											int k= definitionv(jetons,j,regles);
											return k;
										}else {
										j--;
											 return j;
										}
									}else {
										 regles.append("\n missing ;");
									 }
									
								}else {
									 regles.append("\n type incorrect ");
								 }
								
							}
							
						 }else {
							 regles.append("\n identificateur incorrect");
						 }
						 return 0;
					 }
				 
				 
				 
				  public static int expression(ArrayList<String> jetons,int j,JTextArea regles) {
						


						 String linecontainer= jetons.get(j);
						 if(nomounon(linecontainer)||Constant.constant(linecontainer)) {
							     
							    	 
							    	j++;
							    	 if(operateurarithmitique(jetons,j)) {
							    	    
							    	    j++;
								      int  k=expression(jetons,j,regles);
								        if(k!=0) {
								        	
								        	return k;
								        			
								        }
								      			        	
								        
							       }
							        
							    
							   
							      
							      
						 j--;   	     
						 return j;
					   }
					 
						 else if(jetons.get(j).equalsIgnoreCase("(")) {
							         j++;
							    	
							    	int k=expression(jetons,j,regles);
							    	 if(k!=0) {
							    		  k++;
							    		 if(k<jetons.size()&&jetons.get(k).equalsIgnoreCase(")") ) {
							    			 k++;
							    			 if(operateurarithmitique(jetons,k)) {  k++;
								    			 k=expression(jetons,k,regles);
								    			return k;}
							    			 else  {k--;
							    				    return k;
							    			 }
							    			
							    			
							    			 
							    			 
							    		 }else if(operateurarithmitique(jetons,k)) {
							    			 k++;
							    			k=expression(jetons,k,regles);
							    		return k;
							    			 
							    		 }else {return 0;}
							    		 
							    		 
							    		 
							    	 }
							    	 
							    		 
							    	 
					           }else {return 0;}
						
						return 0;
				}
					
					
					
				     public static boolean operateurarithmitique(ArrayList<String> jetons,int j){
						 String linecontainer= jetons.get(j);
						 
						 if(linecontainer.equalsIgnoreCase("*")||linecontainer.equalsIgnoreCase("+")||linecontainer.equalsIgnoreCase("-")) {
							 return true;
						 }
						 
						 else {return false;} 
					 }
					
					public static boolean operateurlogique(ArrayList<String> jetons,int j){
						 String linecontainer= jetons.get(j);
						 
						 if(linecontainer.equalsIgnoreCase("<")||linecontainer.equalsIgnoreCase(">")||linecontainer.equalsIgnoreCase("<=")||linecontainer.equalsIgnoreCase("=")||linecontainer.equalsIgnoreCase("<>")||linecontainer.equalsIgnoreCase(">=")) {
							 return true;
						 }
						 
						 else {
							 return false;} 
					 }
				
				 
}
				 