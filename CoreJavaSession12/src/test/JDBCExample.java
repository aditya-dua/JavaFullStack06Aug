package test;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class JDBCExample {

	public static void main(String[] args) {
		String username=null;

		System.out.println("-------- MySQL JDBC Connection Testing ------------");

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Where is your MySQL JDBC Driver?");
			e.printStackTrace();
			return;
		}

		System.out.println("MySQL JDBC Driver Registered!");
		Connection connection = null;
		
		try {
				connection = DriverManager
						.getConnection("jdbc:mysql://localhost:3306/sys","", "");

		} catch (SQLException e) {
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return;
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		if (connection != null) {
			System.out.println("You made it, take control your database now!");
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("Failed to make connection!");
		}
	}
}
//Using Prepared Statement
// Insert into table query
/*
	String sql = "INSERT INTO cient (clientID, firstName, lastName, phoneNUmber,emailAddress,street,city,state,postcode) VALUES (?, ?, ?, ?,?,?,?,?,?)";

	PreparedStatement statement = conn.prepareStatement(sql);
	statement.setString(1,2);
	statement.setString(2, 'ankur');
	statement.setString(3, 'kakani');
	statement.setString(4,8989);
	statement.setString(5,'xyz@acadgild.com');
	statement.setString(6,'marathali');
	statement.setString(7,'bangalore');
	statement.setString(8,'karnataka');
	statement.setString(9,8989);


	int rowsInserted = statement.executeUpdate();
	if (rowsInserted > 0) {
		System.out.println("A new user was inserted successfully!");
	}   


	// executing Select Statement

	sql = "select firstName,lastName,emailAddress from client";

	Statement statement = connection.createStatement();
	ResultSet result = statement.executeQuery(sql);

	int count = 0;

	while (result.next()){
		String fname = result.getString("firstName");
		String clientID = result.getString("clientID");
		String lname = result.getString("lastName");
		String email = result.getString("emailAddress");

		String output = "User #%d: %s - %s - %s - %s";
		System.out.println(String.format(output, ++count, fname, clientID, lname, email));
	}*/
