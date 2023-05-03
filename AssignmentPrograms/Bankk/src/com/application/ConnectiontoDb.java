package com.application;

import java.sql.DriverManager;
import java.sql.Connection;

public class ConnectiontoDb{
	
	static Connection con;	
	public static Connection Getconnection() {
		
			//Creating Connection
			String url="jdbc:sqlserver://;localhost=1433;DatabaseName=EMPLOYEE;encrypt=false;";
			String username="sa";
			String password="Admin#123";
			
			try {
				
			con=DriverManager.getConnection(url,username,password);
			System.out.println("Connection Created Successfully...");
			
			}catch(Exception e) {
				e.printStackTrace();
				System.out.println("Connection Failed...");
		}
		return con;
	}


	}



