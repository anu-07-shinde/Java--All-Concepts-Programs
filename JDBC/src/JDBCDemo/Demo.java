package JDBCDemo;

import java.sql.Connection;
import java.sql.DriverManager;

public class Demo {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver is loaded");
		
		Connection cc = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		
		System.out.println("Connection successfully established.....");
	}

}
