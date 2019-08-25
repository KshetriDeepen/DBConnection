package dbconn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectDB {

public static void main(String[] args) throws Exception {
		
		String dbURL = "jdbc:mysql://localhost:3306/dbconnection";
		String username = "root";
		String password = "djhonseena";
		 
		try {
		 
		    Connection conn = DriverManager.getConnection(dbURL, username, password);
		 
		    String sql = "Select * from example";
		    
		    Statement statement = conn.createStatement();
		    ResultSet result = statement.executeQuery(sql);
		    
		    while (result.next()) {
		    	
		    	String name = result.getString(2);
		    	
		    	System.out.println(name);
		    }
		        conn.close();
		               
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}

	}	

}
