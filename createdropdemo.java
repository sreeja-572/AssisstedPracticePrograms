package javajdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.Statement;

public class createdropdemo {
	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//2. contect to the db  -use class drivermanager and method get connection
		
		String dburl="jdbc:mysql://localhost:3306/animated_movies";
		String username="root";
		String password="root";
		
		String query="create database demo_database";
		String query1="drop database demo_database";
		
		
		Connection conn=DriverManager.getConnection(dburl,username,password);
		
		Statement stmt=conn.createStatement();
		
		stmt.executeUpdate(query);
		
		System.out.println("new database is created success");
		
		stmt.executeUpdate(query1);
		
		System.out.println("database is dropped Successfully");

		
	}
}
