package com.application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Insert{
	public static void main(String args[]) {
		
		try {
			//Create Connnection
		String url="jdbc:sqlserver://;localhost=1433;DatabaseName=EMPLOYEE;encrypt=false;";
		String username="sa";
		String password="Admin#123";
		
		Connection con = DriverManager.getConnection(url,username,password);
		
		String query="insert into empl(eid,Fname,Age,City) values (?,?,?,?)";
		
		//Get preparedStatement object
		PreparedStatement pstmt=con.prepareStatement(query);
		
		//Set the value in query
		
		pstmt.setInt(1,100);
		pstmt.setString(2,"hello" );
		pstmt.setInt(3, 12);
		pstmt.setString(4, "valsad");

		
		pstmt.executeUpdate();
		
	
		System.out.println("Inserted...");
		
		con.close();
		
		
		
		}catch(Exception e) {
			
			e.printStackTrace();
		}
	}
}
