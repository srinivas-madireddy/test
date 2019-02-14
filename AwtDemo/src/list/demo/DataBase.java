package list.demo;
import java.sql.*;
public class DataBase  {
	
	
//	 void Createstm() 
//	 {	
//			try {
//				Class.forName("oracle.jdbc.driver.OracleDriver");
//				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manage");
//				Statement s=con.createStatement();
//				String sql="create table std(sid varchar(3),sname varchar(15),sal varchar(10));";
//				ResultSet r=s.executeQuery(sql);
//				System.out.println(r.getRow()+"table std tabel is created");
//				con.close();
//			} catch (Exception e) {
//						System.out.println(e);
//			}
//			
//		}
//	 void insertstm() 
//	 {
//		 try {
//			 	Class.forName("oracle.jdbc.driver.OracleDriver");
//				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manage");
//				PreparedStatement in=con.prepareStatement("insert into std values(?,?,?)");
//				in.setString(1,User.t.getText());
//				in.setString(2,User.t1.getText());
//				in.setString(3,User.t2.getText());
//				in.executeUpdate();
//				System.out.println("details inserted");
//				con.close();
//		 }
//		catch (Exception e)
//		{
//				System.out.println(e);
//		}
//
//}
	 void updatestm() 
 {	
		 try {
 

	 	Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manage");
				PreparedStatement in=con.prepareStatement("update std set sal=? where sid=?");
		in.setString(1,User.t.getText());
				in.setString(2,User.t1.getText());
				//in.setString(3,User.t2.getText());
				in.executeUpdate();
				con.close();
		 }catch (Exception e) {
			 e.getStackTrace();
				System.out.println(e);
	 }
}
//	 void deletestm() 
//	 {
//		 try 
//		 {
//			 	Class.forName("oracle.jdbc.driver.OracleDriver");
//				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manage");
//				PreparedStatement in=con.prepareStatement("delete from std where sid=?");
//				in.setString(1,User.t.getText());
//				//in.setString(2,User.t1.getText());
//				in.executeUpdate();
//				con.close();
//		 }
//		 catch (Exception e) {
//				System.out.println(e);
//	 }
//	 }
}
