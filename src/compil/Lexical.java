package compil;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;



//replace text file with arraylists




import javax.swing.JTextArea;
@SuppressWarnings("unused")
public class Lexical {
	
	public static void lexique(String[] file,JTextArea jetons) throws IOException {
	
	
	File fileoutput1  = new File ("C:\\Users\\PC\\Desktop\\JETONS.txt");
	File fileoutput2  = new File ("C:\\Users\\PC\\Desktop\\JETONS2.txt");
	jetons.setText("********* List des jetons ********");

	if(!fileoutput2.exists()) {
		try {
			fileoutput2.createNewFile();
				}
		catch(IOException e)
		{e.printStackTrace();}
	
	}
	if(!fileoutput1.exists()) {
		try {
			fileoutput1.createNewFile();
				}
		catch(IOException e)
		{e.printStackTrace();}
	
	}	
	


		
		 try (
		BufferedWriter bufferwriter = new BufferedWriter(new FileWriter(fileoutput1));
				
				) {
			
			    
			    
			    
			    for (int i = 0; i < file.length; i++) {
			    	
			    	bufferwriter.write(file[i]);
			    	bufferwriter.newLine();
			    	}
			    
			   bufferwriter.close();
	        	}
				 

                 catch (IOException e) {e.printStackTrace();}
		 
		 
		 
		 
		 
		 
		 
		 
		 try(
				 BufferedWriter bufferwriter = new BufferedWriter(new FileWriter(fileoutput2));
				 Scanner scc = new Scanner(fileoutput1)){
			 
			 while(scc.hasNextLine()) {
			 String linecontainre2 = scc.nextLine();
			 
			 if(linecontainre2.contains(";")) {
				 while(linecontainre2.contains(";")) {
				 var index =linecontainre2.indexOf(";");
				 var len = linecontainre2.length();
				 if(index==0) {String fpart= linecontainre2.substring(0, index+1);
				 linecontainre2= linecontainre2.substring(index+1, len);
				 bufferwriter.write(fpart);
				 bufferwriter.newLine();
			    	
				}
				 else {
					 String fpart= linecontainre2.substring(0, index);
					 linecontainre2= linecontainre2.substring(index, len);
					 bufferwriter.write(fpart);
				    	bufferwriter.newLine();
					
 
				 }
				  }
				    bufferwriter.write(linecontainre2);
			    	bufferwriter.newLine();
			 }
			 else {
				    bufferwriter.write(linecontainre2);
			    	bufferwriter.newLine();
	
			 }}
			 
		 }catch (IOException e) {e.printStackTrace();}
		 
		 
		 
		 
		 
		 try(
				 BufferedWriter bufferwriter = new BufferedWriter(new FileWriter(fileoutput1));
				 Scanner sccc = new Scanner(fileoutput2)){
			 
			 while(sccc.hasNextLine()) {
			 String linecontainre2 = sccc.nextLine();
			 
			 if(linecontainre2.contains(".")) {
				 while(linecontainre2.contains(".")) {
				 var index =linecontainre2.indexOf(".");
				 var len = linecontainre2.length();
				 if(index==0) {String fpart= linecontainre2.substring(0, index+1);
				 linecontainre2= linecontainre2.substring(index+1, len);
				 bufferwriter.write(fpart);
			    	bufferwriter.newLine();
				}
				 else {
					 String fpart= linecontainre2.substring(0, index);
					 linecontainre2= linecontainre2.substring(index, len);
					    bufferwriter.write(fpart);
				    	bufferwriter.newLine();
					
 
				 }
				  }
				    bufferwriter.write(linecontainre2);
				    bufferwriter.newLine();
			    	
			 }
			 else {
				    bufferwriter.write(linecontainre2);
			    	bufferwriter.newLine();
				 
				 
			    	
			 }}
			 
			 
		 }catch (IOException e) {e.printStackTrace();}
		 try(
				 BufferedWriter bufferwriter = new BufferedWriter(new FileWriter(fileoutput2));
				 Scanner sccc = new Scanner(fileoutput1)){
			 
			 while(sccc.hasNextLine()) {
			 String linecontainre2 = sccc.nextLine();
			 
			 if(linecontainre2.contains(":=")) {
				 while(linecontainre2.contains(":=")) {
				 var index =linecontainre2.indexOf(":=");
				 var len = linecontainre2.length();
				 if(index==0) {String fpart= linecontainre2.substring(0, index+2);
				 linecontainre2= linecontainre2.substring(index+2, len);
				 bufferwriter.write(fpart);
			    	bufferwriter.newLine();
				}
				 else {
					 String fpart= linecontainre2.substring(0, index);
					 linecontainre2= linecontainre2.substring(index, len);
					 bufferwriter.write(fpart);
				    	bufferwriter.newLine();
					
 
				 }
				  }
				    bufferwriter.write(linecontainre2);
			    	bufferwriter.newLine();
			 }
			 else {
				    bufferwriter.write(linecontainre2);
			    	bufferwriter.newLine();
				 
				 
			    	
			 }}
			 
			 
		 }catch (IOException e) {e.printStackTrace();}
		 try(
				 BufferedWriter bufferwriter = new BufferedWriter(new FileWriter(fileoutput1));
				 Scanner sccc = new Scanner(fileoutput2)){
			 
			 while(sccc.hasNextLine()) {
			 String linecontainre2 = sccc.nextLine();
			 
			 if(linecontainre2.contains("<>")) {
				 while(linecontainre2.contains("<>")) {
				 var index =linecontainre2.indexOf("<>");
				 var len = linecontainre2.length();
				 if(index==0) {String fpart= linecontainre2.substring(0, index+2);
				 linecontainre2= linecontainre2.substring(index+2, len);
				 bufferwriter.write(fpart);
			    	bufferwriter.newLine();
				}
				 else {
					 String fpart= linecontainre2.substring(0, index);
					 linecontainre2= linecontainre2.substring(index, len);
					    bufferwriter.write(fpart);
				    	bufferwriter.newLine();
					
 
				 }
				  }
				    bufferwriter.write(linecontainre2);
				    bufferwriter.newLine();
			    	
			 }
			 else {
				    bufferwriter.write(linecontainre2);
			    	bufferwriter.newLine();
				 
				 
			    	
			 }}
			 
			 
		 }catch (IOException e) {e.printStackTrace();}
		 
		 
		 try(
				 BufferedWriter bufferwriter = new BufferedWriter(new FileWriter(fileoutput2));
				 Scanner sccc = new Scanner(fileoutput1)){
			 
			 while(sccc.hasNextLine()) {
			 String linecontainre2 = sccc.nextLine();
			 
			 if(linecontainre2.contains(">=")) {
				 while(linecontainre2.contains(">=")) {
				 var index =linecontainre2.indexOf(">=");
				 var len = linecontainre2.length();
				 if(index==0) {String fpart= linecontainre2.substring(0, index+2);
				 linecontainre2= linecontainre2.substring(index+2, len);
				 bufferwriter.write(fpart);
			    	bufferwriter.newLine();
				}
				 else {
					 String fpart= linecontainre2.substring(0, index);
					 linecontainre2= linecontainre2.substring(index, len);
					    bufferwriter.write(fpart);
				    	bufferwriter.newLine();
					
 
				 }
				  }
				    bufferwriter.write(linecontainre2);
				    bufferwriter.newLine();
			    	
			 }
			 else {
				    bufferwriter.write(linecontainre2);
			    	bufferwriter.newLine();
				 
				 
			    	
			 }}
			 
			 
		 }catch (IOException e) {e.printStackTrace();}
		 
		 try(
				 BufferedWriter bufferwriter = new BufferedWriter(new FileWriter(fileoutput1));
				 Scanner sccc = new Scanner(fileoutput2)){
			 
			 while(sccc.hasNextLine()) {
			 String linecontainre2 = sccc.nextLine();
			 
			 if(linecontainre2.contains("<=")) {
				 while(linecontainre2.contains("<=")) {
				 var index =linecontainre2.indexOf("<=");
				 var len = linecontainre2.length();
				 if(index==0) {String fpart= linecontainre2.substring(0, index+2);
				 linecontainre2= linecontainre2.substring(index+2, len);
				 bufferwriter.write(fpart);
			    	bufferwriter.newLine();
				}
				 else {
					 String fpart= linecontainre2.substring(0, index);
					 linecontainre2= linecontainre2.substring(index, len);
					    bufferwriter.write(fpart);
				    	bufferwriter.newLine();
					
 
				 }
				  }
				    bufferwriter.write(linecontainre2);
				    bufferwriter.newLine();
			    	
			 }
			 else {
				    bufferwriter.write(linecontainre2);
			    	bufferwriter.newLine();
				 
				 
			    	
			 }}
			 
			 
		 }catch (IOException e) {e.printStackTrace();}
		 
		 
		 
		 
		 try(
				 BufferedWriter bufferwriter = new BufferedWriter(new FileWriter(fileoutput2));
				 Scanner sccc = new Scanner(fileoutput1)){
			 
			 while(sccc.hasNextLine()) {
			 String linecontainre2 = sccc.nextLine();
			 
			 if(linecontainre2.contains("=")&&linecontainre2.indexOf(":")!=0&&linecontainre2.indexOf(">")!=0&&linecontainre2.indexOf("<")!=0) {
				 while(linecontainre2.contains("=")) {
				 int index =linecontainre2.indexOf("=");
				 
				 var len = linecontainre2.length();
				 if(index==0  ) {String fpart= linecontainre2.substring(0, index+1);
				 linecontainre2= linecontainre2.substring(index+1, len);
				 bufferwriter.write(fpart);
			    	bufferwriter.newLine();
				}
				 else  {
					 String fpart= linecontainre2.substring(0, index);
					 linecontainre2= linecontainre2.substring(index, len);
					 bufferwriter.write(fpart);
				    	bufferwriter.newLine();
					
 
				 }
				  }
				    bufferwriter.write(linecontainre2);
			    	bufferwriter.newLine();
			 }
			 else {
				    bufferwriter.write(linecontainre2);
			    	bufferwriter.newLine();
				 
				 
			    	
			 }}
			 
			 
		 }catch (IOException e) {e.printStackTrace();}
		 try(
				 BufferedWriter bufferwriter = new BufferedWriter(new FileWriter(fileoutput1));
				 Scanner sccc = new Scanner(fileoutput2)){
			 
			 while(sccc.hasNextLine()) {
			 String linecontainre2 = sccc.nextLine();
			 
			 if(linecontainre2.contains(",")) {
				 while(linecontainre2.contains(",")) {
				 var index =linecontainre2.indexOf(",");
				 var len = linecontainre2.length();
				 if(index==0) {String fpart= linecontainre2.substring(0, index+1);
				 linecontainre2= linecontainre2.substring(index+1, len);
				 bufferwriter.write(fpart);
			    	bufferwriter.newLine();
				}
				 else {
					 String fpart= linecontainre2.substring(0, index);
					 linecontainre2= linecontainre2.substring(index, len);
					 bufferwriter.write(fpart);
				    	bufferwriter.newLine();
					
 
				 }
				  }
				    bufferwriter.write(linecontainre2);
			    	bufferwriter.newLine();
			 }
			 else {
				    bufferwriter.write(linecontainre2);
			    	bufferwriter.newLine();
				 
				 
			    	
			 }}
			 
			 
		 }catch (IOException e) {e.printStackTrace();}
		 try(
				 BufferedWriter bufferwriter = new BufferedWriter(new FileWriter(fileoutput2));
				 Scanner sccc = new Scanner(fileoutput1)){
			 
			 while(sccc.hasNextLine()) {
			 String linecontainre2 = sccc.nextLine();
			 
			 if(linecontainre2.contains(":")&&linecontainre2.indexOf("=")!=1) {
				 while(linecontainre2.contains(":")) {
				 var index =linecontainre2.indexOf(":");
				 var len = linecontainre2.length();
				 if(index==0) {String fpart= linecontainre2.substring(0, index+1);
				 linecontainre2= linecontainre2.substring(index+1, len);
				 bufferwriter.write(fpart);
			    	bufferwriter.newLine();
				}
				 else {
					 String fpart= linecontainre2.substring(0, index);
					 linecontainre2= linecontainre2.substring(index, len);
					 bufferwriter.write(fpart);
				    	bufferwriter.newLine();
					
 
				 }
				  }
				    bufferwriter.write(linecontainre2);
			    	bufferwriter.newLine();
			 }
			 else {
				    bufferwriter.write(linecontainre2);
			    	bufferwriter.newLine();
				 
				 
			    	
			 }}
			 
			 
		 }catch (IOException e) {e.printStackTrace();}
		 try(
				 BufferedWriter bufferwriter = new BufferedWriter(new FileWriter(fileoutput1));
				 Scanner sccc = new Scanner(fileoutput2)){
			 
			 while(sccc.hasNextLine()) {
			 String linecontainre2 = sccc.nextLine();
			 
			 if(linecontainre2.contains("+")) {
				 while(linecontainre2.contains("+")) {
				 var index =linecontainre2.indexOf("+");
				 var len = linecontainre2.length();
				 if(index==0) {String fpart= linecontainre2.substring(0, index+1);
				 linecontainre2= linecontainre2.substring(index+1, len);
				 bufferwriter.write(fpart);
			    	bufferwriter.newLine();
				}
				 else {
					 String fpart= linecontainre2.substring(0, index);
					 linecontainre2= linecontainre2.substring(index, len);
					 bufferwriter.write(fpart);
				    	bufferwriter.newLine();
					
 
				 }
				  }
				    bufferwriter.write(linecontainre2);
			    	bufferwriter.newLine();
			 }
			 else {
				    bufferwriter.write(linecontainre2);
			    	bufferwriter.newLine();
				 
				 
			    	
			 }}
			 
			 
		 }catch (IOException e) {e.printStackTrace();}
		 try(
				 BufferedWriter bufferwriter = new BufferedWriter(new FileWriter(fileoutput2));
				 Scanner sccc = new Scanner(fileoutput1)){
			 
			 while(sccc.hasNextLine()) {
			 String linecontainre2 = sccc.nextLine();
			 
			 if(linecontainre2.contains("-")) {
				 while(linecontainre2.contains("-")) {
				 var index =linecontainre2.indexOf("-");
				 var len = linecontainre2.length();
				 if(index==0) {String fpart= linecontainre2.substring(0, index+1);
				 linecontainre2= linecontainre2.substring(index+1, len);
				 bufferwriter.write(fpart);
			    	bufferwriter.newLine();
				}
				 else {
					 String fpart= linecontainre2.substring(0, index);
					 linecontainre2= linecontainre2.substring(index, len);
					 bufferwriter.write(fpart);
				    	bufferwriter.newLine();
					
 
				 }
				  }
				    bufferwriter.write(linecontainre2);
			    	bufferwriter.newLine();
			 }
			 else {
				    bufferwriter.write(linecontainre2);
			    	bufferwriter.newLine();
				 
				 
			    	
			 }}
			 
			 
		 }catch (IOException e) {e.printStackTrace();}
		 
		 try(
				 BufferedWriter bufferwriter = new BufferedWriter(new FileWriter(fileoutput1));
				 Scanner sccc = new Scanner(fileoutput2)){
			 
			 while(sccc.hasNextLine()) {
			 String linecontainre2 = sccc.nextLine();
			 
			 if(linecontainre2.contains("*")) {
				 while(linecontainre2.contains("*")) {
				 var index =linecontainre2.indexOf("*");
				 var len = linecontainre2.length();
				 if(index==0) {String fpart= linecontainre2.substring(0, index+1);
				 linecontainre2= linecontainre2.substring(index+1, len);
				 bufferwriter.write(fpart);
			    	bufferwriter.newLine();
				}
				 else {
					 String fpart= linecontainre2.substring(0, index);
					 linecontainre2= linecontainre2.substring(index, len);
					 bufferwriter.write(fpart);
				    	bufferwriter.newLine();
					
 
				 }
				  }
				    bufferwriter.write(linecontainre2);
			    	bufferwriter.newLine();
			 }
			 else {
				    bufferwriter.write(linecontainre2);
			    	bufferwriter.newLine();
				 
				 
			    	
			 }}
			 
			 
		 }catch (IOException e) {e.printStackTrace();}
		 try(
				 BufferedWriter bufferwriter = new BufferedWriter(new FileWriter(fileoutput2));
				 Scanner sccc = new Scanner(fileoutput1)){
			 
			 while(sccc.hasNextLine()) {
			 String linecontainre2 = sccc.nextLine();
			 
			 if(linecontainre2.contains("(")) {
				 while(linecontainre2.contains("(")) {
				 var index =linecontainre2.indexOf("(");
				 var len = linecontainre2.length();
				 if(index==0) {String fpart= linecontainre2.substring(0, index+1);
				 linecontainre2= linecontainre2.substring(index+1, len);
				 bufferwriter.write(fpart);
			    	bufferwriter.newLine();
				}
				 else {
					 String fpart= linecontainre2.substring(0, index);
					 linecontainre2= linecontainre2.substring(index, len);
					 bufferwriter.write(fpart);
				    	bufferwriter.newLine();
					
 
				 }
				  }
				    bufferwriter.write(linecontainre2);
			    	bufferwriter.newLine();
			 }
			 else {
				    bufferwriter.write(linecontainre2);
			    	bufferwriter.newLine();
				 
				 
			    	
			 }}
			 
			 
		 }catch (IOException e) {e.printStackTrace();}
		 try(
				 BufferedWriter bufferwriter = new BufferedWriter(new FileWriter(fileoutput1));
				 Scanner sccc = new Scanner(fileoutput2)){
			 
			 while(sccc.hasNextLine()) {
			 String linecontainre2 = sccc.nextLine();
			 
			 if(linecontainre2.contains(")")) {
				 while(linecontainre2.contains(")")) {
				 var index =linecontainre2.indexOf(")");
				 var len = linecontainre2.length();
				 if(index==0) {String fpart= linecontainre2.substring(0, index+1);
				 linecontainre2= linecontainre2.substring(index+1, len);
				 bufferwriter.write(fpart);
			    	bufferwriter.newLine();
				}
				 else {
					 String fpart= linecontainre2.substring(0, index);
					 linecontainre2= linecontainre2.substring(index, len);
					 bufferwriter.write(fpart);
				    	bufferwriter.newLine();
					
 
				 }
				  }
				    bufferwriter.write(linecontainre2);
			    	bufferwriter.newLine();
			 }
			 else {
				    bufferwriter.write(linecontainre2);
			    	bufferwriter.newLine();
				 
				 
			    	
			 }}
			 
			 
		 }catch (IOException e) {e.printStackTrace();}
		 
		 
		 
		 
		 try(
				 BufferedWriter bufferwriter = new BufferedWriter(new FileWriter(fileoutput2));
				 Scanner sccc = new Scanner(fileoutput1)){
			 
			 while(sccc.hasNextLine()) {
			 String linecontainre2 = sccc.nextLine();
			 
			 if(linecontainre2.contains("<")&&linecontainre2.indexOf("=")!=1&&linecontainre2.indexOf(">")!=1) {
				 while(linecontainre2.contains("<")) {
				 var index =linecontainre2.indexOf("<");
				 var len = linecontainre2.length();
				 if(index==0) {String fpart= linecontainre2.substring(0, index+1);
				 linecontainre2= linecontainre2.substring(index+1, len);
				 bufferwriter.write(fpart);
			    	bufferwriter.newLine();
				}
				 else {
					 String fpart= linecontainre2.substring(0, index);
					 linecontainre2= linecontainre2.substring(index, len);
					 bufferwriter.write(fpart);
				    	bufferwriter.newLine();
				}
				  }
				    bufferwriter.write(linecontainre2);
			    	bufferwriter.newLine();
			 }
			 else {
				    bufferwriter.write(linecontainre2);
			    	bufferwriter.newLine();
				 
				 
			    	
			 }}
			 
			 
		 }catch (IOException e) {e.printStackTrace();}
		 
		 try(
				 BufferedWriter bufferwriter = new BufferedWriter(new FileWriter(fileoutput1));
				 Scanner sccc = new Scanner(fileoutput2)){
			 
			 while(sccc.hasNextLine()) {
			 String linecontainre2 = sccc.nextLine();
			 
			 if(linecontainre2.contains(">")&&linecontainre2.indexOf("=")!=1&&linecontainre2.indexOf("<")!=0) {
				 while(linecontainre2.contains(">")) {
				 var index =linecontainre2.indexOf(">");
				 var len = linecontainre2.length();
				 if(index==0) {String fpart= linecontainre2.substring(0, index+1);
				 linecontainre2= linecontainre2.substring(index+1, len);
				 bufferwriter.write(fpart);
			    	bufferwriter.newLine();
				}
				 else {
					 String fpart= linecontainre2.substring(0, index);
					 linecontainre2= linecontainre2.substring(index, len);
					 bufferwriter.write(fpart);
				    	bufferwriter.newLine();
				}
				  }
				    bufferwriter.write(linecontainre2);
			    	bufferwriter.newLine();
			 }
			 else {
				    bufferwriter.write(linecontainre2);
			    	bufferwriter.newLine();
				 
				 
			    	
			 }}
			 
			 
		 }catch (IOException e) {e.printStackTrace();} 
		 try(
				 
				 Scanner sccc = new Scanner(fileoutput1)){
			 while(sccc.hasNextLine()) {
				 String linecontainre2 = sccc.nextLine();
				 
				 if(linecontainre2.contains(";")) {jetons.append("\n"+linecontainre2+"     separateur");
					}
				 else if(linecontainre2.isEmpty()) {
					 
				 }
				 else if(linecontainre2.contains("programme")) {jetons.append("\n"+linecontainre2+"     mot");
					 
			    	}
				 
				 else if(Constant.constant(linecontainre2)) {jetons.append("\n"+linecontainre2+"     constant");
					
			    	}
				 else if(linecontainre2.contains("debut")||linecontainre2.contains("fin")||linecontainre2.contains("tantque")||linecontainre2.contains("si")||linecontainre2.contains("alors")||linecontainre2.contains("sinon")||linecontainre2.contains("faire")|| linecontainre2.contains("ou") ||linecontainre2.contains("non")  || linecontainre2.contains("sinon") ||linecontainre2.contains("entier")|| linecontainre2.contains("reel")||linecontainre2.contains("sinon")||linecontainre2.contains("var")|| linecontainre2.contains("const")) { jetons.append("\n"+linecontainre2+"     mot cle");
			    	}
				 else if(linecontainre2.contains(">")||linecontainre2.contains("<")||linecontainre2.contains(">=")||linecontainre2.contains("<=")||linecontainre2.contains("=")||linecontainre2.contains("<>") ) { jetons.append("\n"+linecontainre2+"     operateur logique");
			    	}
				 else if(Syntax.nomounon(linecontainre2)) { jetons.append("\n"+linecontainre2+"     identificateur");
			    	}
				 else if(linecontainre2.contains(":")) { jetons.append("\n"+linecontainre2+"     deux point");
			    	}
				 else if(linecontainre2.contains(".")) { jetons.append("\n"+linecontainre2+"     point");
			    	}
				 else if(linecontainre2.contains("+")) { jetons.append("\n"+linecontainre2+"     OP-Addition");
			    	}
				 else {jetons.append("\n"+linecontainre2+"     mal declaree");
				 }
				 
				 
				 
				 
				 
			 }
			 
		 }catch (IOException e) {e.printStackTrace();}
		 
	              
                            
}			 
    

	
	
}

