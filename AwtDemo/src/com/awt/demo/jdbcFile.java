package com.awt.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class jdbcFile 
{
	@SuppressWarnings("unused")
	public static Connection getConn() 
	{
		Connection con=null;
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manage");
			 
			 PreparedStatement sql=null;
		}
		catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		}
		catch (SQLException e)
		{
			
			e.printStackTrace();
		}
		return con;  
		
	}
	

	Awtpr a=new Awtpr();	

public void ReadData() throws SQLException


{
PreparedStatement sql = null;
try {
	sql = jdbcFile.getConn().prepareStatement("select (?) from (?) where (?)");
	 sql.setString(1, Awtpr.t.getText());
	 sql.setString(2, Awtpr.t2.getText());
	 sql.setString(3, Awtpr.t3.getText());
} catch (SQLException e2) {
	// TODO Auto-generated catch block
	e2.printStackTrace();
}
	
}

public void UpdateData() throws SQLException
{
PreparedStatement sql = null;
try {
	sql = jdbcFile.getConn().prepareStatement("update  (?) from (?) where (?)  ");
	sql.setString(1,Awtpr.t.getText());
	sql.setString(2,Awtpr.t2.getText());
	sql.setString(3,Awtpr.t3.getText());
} catch (SQLException e2) {
	// TODO Auto-generated catch block
	e2.printStackTrace();
}
}

}
	

	
	