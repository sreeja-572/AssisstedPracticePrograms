package javajdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.sql.Statement;

public class ProceduresDemo {
	private static String query;

	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		
		//2. contect to the db  -use class drivermanager and method get connection
		
		String dburl="jdbc:mysql://localhost:3306/animated_movies";
		String username="root";
		String password="root";
		String query="Call allmovies()";
		
		
		Connection conn=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

		
		
		Connection conn1=DriverManager.getConnection(dburl,username,password);
		System.out.println("successfully connected");
		
		
		Statement stmt=conn1.createStatement();
		
		ResultSet rs = stmt.executeQuery(query);
		
		while(rs.next()) {
			System.out.print("Title: "+rs.getString("title")+"\t");
			System.out.print("Title: "+rs.getString("genre")+"\t");
			System.out.print("Title: "+rs.getString("director")+"\t");
			System.out.print("Title: "+rs.getString("release_year")+"\t");

		}
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
	finally {
		conn.close();

	}

}
}
