package INSERT_OPERATION;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertRecord {

	public static void main(String[] args) throws Exception {


		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Load............");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
		
		
		Statement statement = connection.createStatement();
		
		statement.executeUpdate("Insert into studentdata values(102,'Rekha','Mumbai',90)");
		System.out.println("Data Updated.........");

		

	}

}
