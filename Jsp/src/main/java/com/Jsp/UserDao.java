package com.Jsp;

import java.sql.Connection;
import java.sql.DriverManager;

public class UserDao {

	
	//Connection to Database
	public static Connection getConnection() {
		Connection con=null;
		
			try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;DatabaseName=Human;encrypt=false","sa","Admin#123");
			System.out.println("Connection Created Successfully...");
			
			}catch(Exception e) {
				e.printStackTrace();
				System.out.println("Connection Failed...");
	}
			return con;

	}
}
