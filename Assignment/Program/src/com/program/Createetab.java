package com.program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Createetab {
	public static void main(String args[]) {
		
		try {
			String url="jdbc:sqlserver://;localhost=1433;DatabaseName=Users;encrypt=false;";
			String username="sa";
			String password="Admin#123";
			
			Connection con = DriverManager.getConnection(url,username,password);
			//create query
			
			String q="create table empl(eid int primary key ,ename varchar(50) not null,ecity varchar(50))";
			
			//Create statement 
			Statement stmt=con.createStatement();
			stmt.executeUpdate(q);
			System.out.println("Table has been created successfully..");
			con.close();
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}


