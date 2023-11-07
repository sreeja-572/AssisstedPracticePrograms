package javajdbcdemo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class transactiondemo {
	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//2. contect to the db  -use class drivermanager and method get connection
		
		String dburl="jdbc:mysql://localhost:3306/animated_movies";
		String username="root";
		String password="root";
		
		
		Connection conn=DriverManager.getConnection(dburl,username,password);
		System.out.println("Successfully connected to database");
		
		String q1="insert into movies values('movie10','animation','director_ani',2023)";
		String q2="update movies set director='mohit' where title='movie10'";
		String q3="delete from movies where title='now movie'";
		
		boolean flag=false;
		
		conn.setAutoCommit(false);
		Statement stmt=conn.createStatement();

		stmt.addBatch(q1);
		stmt.addBatch(q2);
		stmt.addBatch(q3);
		
		int [] result=stmt.executeBatch();
		
		for(int i=0;i<result.length;i++) {
			System.out.println(i);
			if(result[i]==0) {
				flag=true;
				break;
			}
	
		}
		if(flag==false)
		{
			conn.commit();
			System.out.println("transaction successful");
		}
		else {
			conn.rollback();
			System.out.println("transaction successful");

		}
		conn.close();
		
}
}