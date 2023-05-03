package com.application;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Update {
	public static void main(String args[]) {
		
		try {
			//Create Connnection
		String url="jdbc:sqlserver://;localhost=1433;DatabaseName=EMPLOYEE;encrypt=false;";
		String username="sa";
		String password="Admin#123";
		
		Connection con = DriverManager.getConnection(url,username,password);
		
		String query="update empl set FName='"+"Riya"+"' where eid="+100;
		
		//Get preparedStatement object
		PreparedStatement pstmt=con.prepareStatement(query);
		pstmt.executeUpdate();
		
		System.out.println("Updated...");
		
		
		con.close();
		
		
		
		}catch(Exception e) {
			
			e.printStackTrace();
		}
	}
}
