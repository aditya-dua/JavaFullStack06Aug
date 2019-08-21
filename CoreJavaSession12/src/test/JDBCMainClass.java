package test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import db.DBConnection;

public class JDBCMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. Create Connection
		// 2. We create the statement from Connection
		// 3. We execute the query.....
		// 4. Executed query will return us the ResultSet
		// 5. Iterate over the ResultSet
		String query="select * from category;";
		Statement stmt;
		Connection con = DBConnection.getDBInstance();
		
		if(con==null){
			System.out.println("Failed to gte the connection");
		}else {
			System.out.println("Connection Successfull");
			try {
				stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(query);
				
				if(rs != null){
					while (rs.next()) {
						System.out.print (rs.getInt(1)+" ");
						System.out.print(rs.getString("categoryName")+" ");
						System.out.print(rs.getString("categoryDescription")+" ");

						System.out.println(rs.getString(4)+" ");
					}
				}
				
				/*ResultSetMetaData rsmd = rs.getMetaData();
				
				System.out.println(rsmd.getColumnCount());
				for(int i=1;i<=rsmd.getColumnCount();i++){
					System.out.println(rsmd.getColumnName(i)+rsmd.getColumnTypeName(i));
				}
				System.out.println(rsmd.getTableName(1));*/
				
				
				
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}
	}

}
