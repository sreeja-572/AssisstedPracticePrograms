package javajdbcdemo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.sql.Statement;
public class selectquerydemo{
	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		
		//1.load the db driver //it is mandatory
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//2. contect to the db  -use class drivermanager and method get connection
		
		String dburl="jdbc:mysql://localhost:3306/animated_movies";
		String username="root";
		String password="root";
		
		
		Connection conn=DriverManager.getConnection(dburl,username,password);
		System.out.println("Successfully connected to database");
		
		//String query="select *from movies";
		String query="INSERT INTO movies VALUES('t','g','d','1999')";
		//send query to the db
		
		Statement stmt=conn.createStatement();
		stmt.execute(query);
		
		ResultSet rs=stmt.executeQuery(query);
		
		while(rs.next()) {
			System.out.print("Title: "+rs.getString("title")+"\t");
			System.out.print("Title: "+rs.getString("genre")+"\t");
			System.out.print("Title: "+rs.getString("director")+"\t");
			System.out.print("Title: "+rs.getString("release_year")+"\t");

		}
	}
}
