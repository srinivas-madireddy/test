package KiranPackage.kiran;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Update {
	 public boolean i;
	 {
		 try {
			 	Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manage");
				PreparedStatement in=con.prepareStatement("update emp1 set sal=? where eid=?");
				in.setString(2,cmpy.t.getText());
				in.setString(1,cmpy.t2.getText());
				//in.setString(3,cmpy.t2.getText());
				in.executeUpdate();
				i=true;
				con.close();
		 }catch (Exception e) {
			 e.getStackTrace();
				System.out.println(e);
	 }
}
}
