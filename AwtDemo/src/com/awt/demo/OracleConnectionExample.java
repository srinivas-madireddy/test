package com.awt.demo;

import java.sql.Connection;
import java.sql.DriverManager;

public class OracleConnectionExample {
	
	 public static Connection getConnection(){  
	        Connection con=null;  
	        try{  
	            Class.forName("oracle.jdbc.driver.OracleDriver");  
	            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manage");  
	        }catch(Exception e){System.out.println(e);}  
	        return con;  
	    }  
}
