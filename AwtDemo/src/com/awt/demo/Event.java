package com.awt.demo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public  class Event implements ActionListener,WindowListener {
	Awtpr a=new Awtpr();
	jdbcFile jdbcf=new jdbcFile();

		
@Override
public void windowOpened(WindowEvent e) {
	
	
}
@Override
public void windowClosing(WindowEvent e) {
	System.exit(0);
	}
@Override
public void windowClosed(WindowEvent e) {
}
@Override
public void windowIconified(WindowEvent e) {
	System.out.println("you Iconified");
	
}
@Override
public void windowDeiconified(WindowEvent e) {
	System.out.println("you Iconified");
	
}
@Override
public void windowActivated(WindowEvent e) {
	System.out.println("you Ativated");
}
@Override
public void windowDeactivated(WindowEvent e) {
	System.out.println("you Deactivated");
	
}


public static void addWindowListener() {
	System.exit(0);
	
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	a.getData(); 
}

}