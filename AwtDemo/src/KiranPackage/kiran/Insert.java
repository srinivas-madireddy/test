package KiranPackage.kiran;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Insert 
{
	public boolean i;
	
	{
		try {
			 	Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manage");
				PreparedStatement in=con.prepareStatement("insert into emp1 values(?,?,?)");
				in.setString(1,cmpy.t.getText());
				in.setString(2,cmpy.t1.getText());
				in.setString(3,cmpy.t2.getText());
				in.executeUpdate();
				i=true;
				System.out.println("Details inserted");
				con.close();
		 }
		catch (Exception e)
		{
				System.out.println(e);
		}
	
}
}