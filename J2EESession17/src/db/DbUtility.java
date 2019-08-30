package db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DbUtility {

	public static ResultSet executeQuery(Connection con,String query){

		ResultSet rs = null;
		try {
			Statement stmt = con.createStatement();

			rs = stmt.executeQuery(query);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return rs;	
	}
	
	public static int executeUpdate(Connection con,String query){

		int updated=0;
		try {
			Statement stmt = con.createStatement();

			updated = stmt.executeUpdate(query);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return updated;	
	}
	
	
	
	public static int[] executeBatch(Connection con,String query[]){

		int updated[] = null;
	
		try {
			Statement stmt = con.createStatement();

			for (int i = 0; i < query.length; i++) {
				stmt.addBatch(query[i]);
				
				if(i%10==0 || i == query.length){
					updated = stmt.executeBatch();
					System.out.println("BATCH FILE UPDATED!");
				}
			}
			
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return updated;	
	}

	public static void printEntireRS(ResultSet rs){
		String strB;
		ResultSetMetaData rsmd;
		try {
			rsmd = rs.getMetaData();
			for(int i=1;i<=rsmd.getColumnCount();i++){
				System.out.print(rsmd.getColumnName(i)+" ");
			}
			System.out.println();
			while(rs.next()){
				strB = "";
				for(int i=1;i<=rsmd.getColumnCount();i++){
					strB=strB+" "+(rs.getString(i));
				}
				System.out.println(strB);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
