package javajdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
public class inseryquerydemo {
	public static void main(String[] args) throws ClassNotFoundException,SQLException
	{
		
		String query="INSERT INTO movies VALUES('title','genre','director','release_year')";
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//2. contect to the db  -use class drivermanager and method get connection
		
		String dburl="jdbc:mysql://localhost:3306/animated_movies";
		String username="root";
		String password="root";
		
		
		Connection conn=DriverManager.getConnection(dburl,username,password);
		System.out.println("Successfully connected to database");
		
		
		//preparedstatement -->used for executing insert query with parameter
		
		String Title="new movie";
		String Genre="comedy";
		String Director="director123";
		String release_year="1999";
		
		
		PreparedStatement ps=conn.prepareStatement("insert into movies values(?,?,?,?)");
		
		ps.setString(1,Title);
		
		ps.setString(2, Genre);
		
		ps.setString(3,Director);
		
		ps.setString(4,release_year);
		
		ps.executeUpdate();
		
		System.out.println("database connected success");
		conn.close();
		
		
		
		
		
		
		
		
		
		
	}

}
