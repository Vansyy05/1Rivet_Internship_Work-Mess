package com.program;

import java.sql.DriverManager;

import java.sql.Connection;

public class ConnectionToDb{
	
	static Connection con;	
	public static Connection Getconnection() {
		
			//Creating Connection
			String url="jdbc:sqlserver://;localhost=1433;DatabaseName=Users;encrypt=false;";
			String username="sa";
			String password="Admin#123";
			
			try {
				
			con=DriverManager.getConnection(url,username,password);
			System.out.println("Connection Created...");
			
			}catch(Exception e) {
				System.out.println("Connection Failed...");
			e.printStackTrace();
		}
		return con;
	}


	}


