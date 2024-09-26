package KiranPackage.kiran;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class delete{
	public Boolean i; 
	{
		
		 try 
		 {
			 	Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manage");
				PreparedStatement in=con.prepareStatement("delete from emp1 where eid=?");
				in.setString(1,cmpy.t.getText());
				//in.setString(2,cmpy.t1.getText());
				in.executeUpdate();
				i=true;
				System.out.println("Delete");
				con.close();
		 }
		 catch (Exception e) {
				System.out.println(e);
	 }
	 }
}

