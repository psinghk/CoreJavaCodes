package Com.sgs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) throws Exception
	{
//		 final String Db_Driver="com.mysql.jdbc.Driver";
//	     final String Dburl="jdbc:mysql://localhost:3036/sgs";
//		 final String user="root";
//		 final String password="admin";
		 
		Class.forName("com.mysql.jdbc.Driver");
		 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3036/sgs","root","admin");
		 Statement st = con.createStatement();
		 String sql="select * from student_master";
		 ResultSet rs= st.executeQuery(sql);
		 
		  while(rs.next()){
			  System.out.println(rs.getString("name")+"  "+rs.getString("email"));
			  
			  
		  }

	}

}
