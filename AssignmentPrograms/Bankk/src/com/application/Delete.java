package com.application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Delete {
	public static void main(String args[]) {
		
		try {
			//Create Connnection
		String url="jdbc:sqlserver://;localhost=1433;DatabaseName=EMPLOYEE;encrypt=false;";
		String username="sa";
		String password="Admin#123";
		
		Connection con = DriverManager.getConnection(url,username,password);
		
		String query="Delete from empl where eid=100";
		
		//Get preparedStatement object
		PreparedStatement pstmt=con.prepareStatement(query);
		//pstmt.setInt(0, 0);
		pstmt.executeUpdate();
		
		System.out.println("Deleted...");
		con.close();
		}catch(Exception e) {
			
			e.printStackTrace();
		}
	}
}


