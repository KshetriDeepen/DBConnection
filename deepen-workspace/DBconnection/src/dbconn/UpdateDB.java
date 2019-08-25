package dbconn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDB {

public static void main(String[] args) throws Exception {
		
		String dbURL = "jdbc:mysql://localhost:3306/dbconnection";
		String username = "root";
		String password = "djhonseena";
		 
		try {
		 
		    Connection conn = DriverManager.getConnection(dbURL, username, password);
		 
		    String sql = " Update example Set remarks='Pending' Where id=1";
		    
		    Statement statement = conn.createStatement();
		    int rowsInserted = statement.executeUpdate(sql);
		    
		    if (rowsInserted > 0) {
		        System.out.println("A information was updated!");
		    }   
		        conn.close();
		               
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}

	}	

}

