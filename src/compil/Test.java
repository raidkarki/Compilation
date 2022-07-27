package compil;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;





// this is the main: here i call to Lexical when i press on lexical button 
// when press syntax i call to both "lexical and syntax"
// the problems : scrollbar in textareas

@SuppressWarnings("unused")
public class Test {

	public static void main(String[] args) throws IOException {
		
		JFrame f=new JFrame("Compil2022");
		
		
		
		f.setBackground(Color.lightGray);
		f.setSize(1500, 800);
		GridLayout gl=new GridLayout();
		
		
		Font font = new Font("Verdana",Font.TYPE1_FONT, 13);
		
		JPanel panel = new JPanel(gl);
		panel.setBackground(Color.lightGray);
		panel.setBounds(5,5,400,600);
		JTextArea text1 = new JTextArea();
		panel.add(text1);
		text1.setFont(font);
		JScrollPane jsp=new JScrollPane(panel);
		f.add(jsp,BorderLayout.CENTER);
		
		JPanel panel2 = new JPanel();
		panel2.setBounds(0,600,400,50);
		
		
		JButton l=new JButton("Lexique");
		l.setBounds(0,10,40,40);
		
		JButton s=new JButton("Syntaxique");
		s.setBounds(00,40,40,40);
		
		
		
		panel2.add(l);
		panel2.add(s);
		
        
		
		
		JPanel panel3 = new JPanel();
		panel3.setBackground(Color.red);
		panel3.setBounds(410,0,400,30);
		JLabel label = new JLabel("jetons", JLabel.CENTER);
		panel3.add(label);
		JPanel panel4 = new JPanel();
		panel4.setBackground(Color.blue);
		panel4.setBounds(820,0,400,30);
		JLabel label4 = new JLabel("Regles", JLabel.CENTER);
		panel4.add(label4);
		
		
		
		
		JPanel panel6 = new JPanel(gl);
		panel6.setBounds(410,30,400,570);
		
		
		JTextArea jetons = new JTextArea();
		jetons.setEditable(false);
		
		
		panel6.add(jetons);
		
		JPanel panel5 = new JPanel(gl);
		panel5.setBounds(820,30,400,570);
		
		
		JTextArea regles = new JTextArea();
		regles.setEditable(false);
		
		panel5.add(regles);
		
		
		
		
		
		
		
		
		
		
		
		f.add(panel);
		f.add(panel2);
		f.add(panel3);
		f.add(panel6);
		f.add(panel4);
		f.add(panel5);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);
		f.setVisible(true);
		
		l.addActionListener(new ActionListener(){
			
	        public void actionPerformed(ActionEvent e){
	        	String[] textLigne = text1.getText().split("\\s+");
	        	
					
					try {
						Lexical.lexique(textLigne,jetons);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				
					
					
					
	        }
		});
		s.addActionListener(new ActionListener(){
	        public void actionPerformed(ActionEvent e){
	        	String[] textLigne = text1.getText().split("\\s+");
	        	try {
					Lexical.lexique(textLigne,jetons);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
	        	
	        	
	        	
	        	
					try {
						Syntax.Syntaxique(regles);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
					
					
				}
	        	
	        	
	        
		
		});
		
		
		
		
		
		
		
		
		
}
	


	    	 				 

		 
	 
	
	
}
