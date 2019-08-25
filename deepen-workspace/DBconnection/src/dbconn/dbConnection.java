package dbconn;

import java.sql.*;

public class dbConnection {

	public static void main(String[] args) throws Exception {
		
		String dbURL = "jdbc:mysql://localhost:3306/dbconnection";
		String username = "root";
		String password = "djhonseena";
		 
		try {
		 
		    Connection conn = DriverManager.getConnection(dbURL, username, password);
		 
		    String sql = "INSERT INTO example (id, name, remarks) VALUES (5, 'Bhawana','Pending')";
		    
		    Statement statement = conn.createStatement();
		    int rowsInserted = statement.executeUpdate(sql);
		    
		    if (rowsInserted > 0) {
		        System.out.println("A new user was inserted successfully!");
		    }   
		        conn.close();
		               
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}

	}	

}
