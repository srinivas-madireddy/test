package statusdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Insertstm 
{
	public boolean i;
	
	{
		try {
			 	Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manage");
				PreparedStatement in=con.prepareStatement("insert into std values(?,?,?)");
				in.setString(1,User.t.getText());
				in.setString(2,User.t1.getText());
				in.setString(3,User.t2.getText());
				in.executeUpdate();
				i=true;
				System.out.println("details inserted");
				con.close();
		 }
		catch (Exception e)
		{
				System.out.println(e);
		}
	
}
}