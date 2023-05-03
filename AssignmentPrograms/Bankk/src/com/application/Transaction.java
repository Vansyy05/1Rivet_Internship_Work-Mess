package com.application;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Transaction {
	public static void main(String[] args) {
		try {
			//Create Connnection
		String url="jdbc:sqlserver://;localhost=1433;DatabaseName=Customer;encrypt=false;";
		String username="sa";
		String password="Admin#123";
		
		Connection con = DriverManager.getConnection(url,username,password);
		con.getAutoCommit();
		
		PreparedStatement ps=con.prepareStatement("insert into customer values(?,?,?)");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
		while(true){  
			System.out.println("enter id");  
			String s1=br.readLine();  
			int id=Integer.parseInt(s1);  
			  
			System.out.println("enter name");  
			String name=br.readLine();  
			  
			System.out.println("enter salary");  
			String s3=br.readLine();  
			int salary=Integer.parseInt(s3);  
			  
			ps.setInt(1,id);  
			ps.setString(2,name);  
			ps.setInt(3,salary);  
			ps.executeUpdate();  
			  
			System.out.println("commit/rollback");  
			String answer=br.readLine();  
			if(answer.equals("commit")){  
			con.commit();  
			}  
			if(answer.equals("rollback")){  
			con.rollback();  
			
			System.out.println("Want to add more records y/n");  
			String ans=br.readLine();  
			if(ans.equals("n")){  
			break;  
			}  
			  
			}  
			con.commit();  
			System.out.println("record successfully saved");  
			  
			con.close();
			
		}
		}catch(Exception e) {
			System.out.println(e);
		
	}
	}
}
