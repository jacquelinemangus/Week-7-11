package projects.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import projects.exception.*;

public class DbConnection {
private static String SCHEMA = "projects";
private static String USER = "projects";
private static String PASSWORD = "projects";
private static String HOST = "localhost";
private static int PORT = 3306;
	
	public static Connection getConnection() {
		String uri = 
				String.format("jdbc:mysql://%s:%d/%s?user=%s&password=%s&useSSL=false" , 
				HOST, PORT, SCHEMA, USER, PASSWORD);
	System.out.println("Connecting with uri=" + uri );
	try {
	Connection conn = DriverManager.getConnection(uri);
	System.out.println("Connection was successful!");
	return conn;
	} catch (SQLException e) {
		System.out.println("There was an error connecting!");
		throw new DbException(e);
	}
	}
}

	
	
//2.	In the DbConnection class, create a method named getConnection(). 
	// It should be public and static and should return a java.sql.Connection object. 
//In the getConnection() method:
	
	//a.	Create a String variable named uri that contains the MySQL connection URI.
//	b.	Call DriverManager to obtain a connection. Pass the connection string (URI) to
	//DriverManager.getConnection().
	
//	c.	Surround the call to DriverManager.getConnection() with a try/catch block.
	//The catch block should catch SQLException.
	
//	d.	Print a message to the console (System.out.println) if the connection is successful.
	
//	e.	Print an error message to the console if the connection fails.
	//Throw a DbException if the connection fails.
