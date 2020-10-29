package demoLogin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Auth {
	
		private static String databaseName = "auth";
		private static String url = "jdbc:mysql://localhost:3306/" + databaseName;
		private static String userName = "root";
		private static String password = "mysql";
		private static String sql = "SELECT * from users WHERE name=? AND password=?";
	public static boolean verify(String user, String pass) {
		 try {
	            
	            Class.forName("com.mysql.jdbc.Driver");
	            Connection connection = DriverManager.getConnection(url, userName, password);
	            PreparedStatement prepareStatement = connection.prepareStatement(sql);
	            prepareStatement.setString(1, user);
	            prepareStatement.setString(2, pass);
	            System.out.println(prepareStatement.toString());
	            ResultSet result = prepareStatement.executeQuery();
	            
	           if(result.next()) {
	        	   return true;
	           }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
		 return false;
	}
}
