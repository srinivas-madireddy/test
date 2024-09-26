package com.awt.demo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Awtpr extends Frame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2519360601810007213L;
	public static Button b,b1,b2,b3,b4,b5;
	public static  TextField t,t1,t2,t3,t4;
	 
	public static Label l,l2,l3;
	

	//@SuppressWarnings("unused")
	public static void main(String[] args) {
		Frame f=new Frame();
		//f.setLayout(new FlowLayout());
		
		f.add(new Label("Button test"));
		l=new Label("columns names");
		
		t=new TextField(" ");
		b=new Button("read data");
		l.setBounds(30, 50, 100, 30);
		b.setBounds(50,400,70,30);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PreparedStatement sql = null;
				try {
					sql = jdbcFile.getConn().prepareStatement("select  (?) from (?) where (?)  ");
					sql.setString(1,t.getText());
					sql.setString(2,t2.getText());
					sql.setString(3,t3.getText());
				} catch (SQLException e2) {
					e2.printStackTrace();
				}
			int a = 0;
			try {
				a = sql.executeUpdate();
				
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			System.out.println(a);
			}
		});
		t.setBounds(200, 50, 100, 30);
		t.setEditable(true);
		f.add(l);		
		f.add(t);
		f.add(b);
		/*b1=new Button("alter data");
		t1=new TextField("enter your note t1");
		b1.setBounds(150,400,70,30);
		t1.setBounds(200, 150, 100, 30);
		t1.setEditable(true);
		f.add(t1);
		f.add(b1);*/
		b2=new Button("Update tabel");
		t2=new TextField("");
		l2=new Label("tabels name");
		t2.setEditable(true);
		l2.setBounds(30, 150, 100, 30);
		t2.setBounds(200, 150, 100, 30);
		b2.setBounds(130,400,80,30);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PreparedStatement sql = null;
				try {
					sql = jdbcFile.getConn().prepareStatement("update  (?) from (?) where (?)  ");
					sql.setString(1,t.getText());
					sql.setString(2,t2.getText());
					sql.setString(3,t3.getText());
				} catch (SQLException e2) {
					e2.printStackTrace();
				}
			int a = 0;
			try {
				a = sql.executeUpdate();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			System.out.println(a);
			}
		});
		f.add(l2);
		f.add(t2);
		f.add(b2);
		b3=new Button("delete element");
		t3=new TextField("");
		l3=new Label("condition");
		l3.setBounds(30, 250, 100, 30);
		b3.setBounds(220,400,90,30);
		t3.setBounds(200, 250, 100, 30);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PreparedStatement sql = null;
				try {
					sql = jdbcFile.getConn().prepareStatement("delete (?) from  (?) where (?) ");
					sql.setString(1,t.getText());
					sql.setString(2,t2.getText());
					sql.setString(3,t3.getText());
				} catch (SQLException e2) {
					e2.printStackTrace();
				}
				int a = 0;
				try {
					a = sql.executeUpdate();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				System.out.println(a);
			}
		});
		f.add(b3);
		b4=new Button("exit");
		b4.setBounds(320,400,70,30);
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
				
			}
		});
		f.add(b4);
		
		b5=new Button("hi");
		b5.setBounds(400, 400, 50, 30);
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("you hit wrong button boom");
				
			}
		});
		f.add(b5);
		f.setTitle("Button test");
		f.setSize(600,600);
		f.setVisible(true);
		Event e=new Event();
		f.addWindowListener(e);
		
		//jdbcFile jdbcf;
		new Event();
	}


	public void getData() {
		// TODO Auto-generated method stub
		
	}

}
