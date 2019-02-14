package list.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Deletestm {
	 {
		 try 
		 {
			 	Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manage");
				PreparedStatement in=con.prepareStatement("delete from std where sid=?");
				in.setString(1,User.t.getText());
				//in.setString(2,User.t1.getText());
				in.executeUpdate();
				User.l3.setText("you deleted the records");
				User.l3.setBounds(50, 350, 200, 40);
				OptionPanedelete od;
				od=new OptionPanedelete();
				
				con.close();
		 }
		 catch (Exception e) {
				System.out.println(e);
	 }
	 }
}
