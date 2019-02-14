package com.awt.demo;
import java.awt.Button;
import java.awt.Frame;  
public class ButtonExample {
  
	public static void main(String[] args) {  
	    Frame f=new Frame("Button Example");  
	    Button b=new Button("Click Here");  
	    b.setBounds(500,1000,800,300);  
	    f.add(b);  
	    f.setSize(400,400);  
	    f.setLayout(null);  
	    f.setVisible(true);   
	}  
	}  


