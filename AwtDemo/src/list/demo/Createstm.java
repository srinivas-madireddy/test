package list.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Createstm {
	{
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manage");
		String sql="create table tur"
				+ "("
				+ "tid varchar(3),"
				+ "tname varchar(15),"
				+ "fee varchar(10));";
		Statement s=con.createStatement();
		//String sql="create table tur(tid varchar(3),tname varchar(15),fee varchar(10));";
		ResultSet r=s.executeQuery(sql);
		//s.executeUpdate();
		System.out.println( r +"table std tabel is created");
		con.close();
	} catch (Exception e) {
				System.out.println(e);
	}
	
}
}