package com.awt.demo;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test extends Frame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5908313012577630614L;
	TextField tf1,tf2,tf3;
	Button b1,b2,b3;
	
		Test(){
			//create components  
			tf1=new TextField();  
			tf1.setBounds(50,50,30,20);  
			b1=new Button("click me");  
			b1.setBounds(10,120,80,30);  
			  
			//register listener  
			b1.addActionListener(this);//passing current instance  
			  
			//add components and set size, layout and visibility  
			add(b1);
			add(tf1);  
			  
			tf2=new TextField();  
			tf2.setBounds(100,50,30,20);  
			b2=new Button("click me");  
			b2.setBounds(100,120,80,30);  
			  
			//register listener  
			b2.addActionListener(this);//passing current instance  
			  
			//add components and set size, layout and visibility  
			add(b2);add(tf2);  
			  
			tf3=new TextField();  
			tf3.setBounds(150,50,30,20);  
			b3=new Button("click me");  
			b3.setBounds(200,120,80,30);  
			  
			//register listener  
			b3  .addActionListener(this);//passing current instance  
			  
			//add components and set size, layout and visibility  
			add(b3);add(tf3);  
			setSize(600,600);  
			setLayout(null);  
			setVisible(true);  
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			tf1.setText("Add Test value");
			
		}
		
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		
		new Test();
		//System.out.println(OracleConn.getConn().toString());
	}
	}
