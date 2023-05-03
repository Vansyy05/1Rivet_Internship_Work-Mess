package com.Servlet;

import java.sql.*;
import java.util.*;

import javax.xml.transform.Result;

public class EmpDao {
	
	
	//Connection Established
		public static Connection getConnection() {
			Connection con=null;
			
				try {
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;DatabaseName=Employees;encrypt=false","sa","Admin#123");
				System.out.println("Connection Created Successfully...");
				
				}catch(Exception e) {
					e.printStackTrace();
					System.out.println("Connection Failed...");
		}
				return con;

		}
		
	//Insert data in Database
	public static int insert(Emp em) {
		int status=0;
		try {
			
			Connection con=EmpDao.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into Emplo(Name,Email,Password) values(?,?,?)");
			ps.setString(1,em.getName());
			ps.setString(2,em.getEmail());
			ps.setString(3,em.getPassword());
			
			status=ps.executeUpdate();
			con.close();
	
		}catch(Exception e) {
			e.printStackTrace();
			}
		return status;
	}
	
	//Select data from database
	public static List<Emp> getAllEmployee() {
		List<Emp> list=new ArrayList<Emp>();
		try {
			Connection con=EmpDao.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from Emplo");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Emp e=new Emp();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setEmail(rs.getString(3));
				e.setPassword(rs.getString(4));
				list.add(e);
				
			}
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	//Get By Id
	public static Emp GetById(int id) {
		Emp em=new Emp();
		try {
		Connection con=EmpDao.getConnection();
		PreparedStatement ps=con.prepareStatement("Select  * from Emplo where id="+id);
		//ps.setInt(1, 0);
		ResultSet rs=ps.executeQuery();
		if(rs.next()) {
			em.setId(rs.getInt(1));
			em.setName(rs.getString(2));
			em.setEmail(rs.getString(3));
			em.setPassword(rs.getString(4));
		}
		con.close();
		
		}catch(Exception e) {
		e.printStackTrace();
	}
		return em;

}
	
	// Update
	public static int Update(Emp em) {
		int status=0;
		
		try {
			Connection con=EmpDao.getConnection();
			PreparedStatement ps=con.prepareStatement("Update Emplo set id=?,name=?,email=?,password=?");
			//ps.setInt(1,em.getId());
			ps.setString(2, em.getName());
			ps.setString(3, em.getEmail());
			ps.setString(4, em.getPassword());
			
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}
}

