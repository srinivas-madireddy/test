package list.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Updatestm {
	 
	 {
		 try {
			 	Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manage");
				PreparedStatement in=con.prepareStatement("update std set sal=? where sid=?");
				in.setString(1,User.t2.getText());
				in.setString(2,User.t.getText());
				//in.setString(3,User.t2.getText());
				in.executeUpdate();
				User.l3.setText("you updated the records");
				User.l3.setBounds(50, 350, 200, 40);
				User.l3.getBaseline(200, 40);
				OptionPaneupdate ou=new OptionPaneupdate();
				con.close();
		 }catch (Exception e) {
			 e.getStackTrace();
				System.out.println(e);
	 }
}
}
