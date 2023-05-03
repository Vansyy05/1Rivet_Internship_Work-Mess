package com.JSP;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
	
	//Connection Established
			public static Connection getConnection() {
				Connection con = null;
				
					try {
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
					con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;DatabaseName=EmpUser;encrypt=false","sa","Admin#123");
					System.out.println("Connection Created Successfully...");
					
					}catch(Exception e) {
						e.printStackTrace();
						System.out.println("Connection Failed...");
			}
					return con;

			}
			
			//Insert data in Database
			public static int insert(User u) {
				int status=0;
				try {
					
					Connection con=UserDao.getConnection();
					PreparedStatement ps=con.prepareStatement("insert into EmployeeUser(Name,Email,Password) values(?,?,?)");
					ps.setString(1,u.getName());
					ps.setString(2,u.getEmail());
					ps.setString(3,u.getPassword());
					
					status=ps.executeUpdate();
					
					con.close();
				}catch(Exception e) {
					e.printStackTrace();
					}
				return status;
			}
			
			//Select All data from database
			public static List<User> getAllUser() {
				List<User> list=new ArrayList<User>();
				try {
					Connection con=UserDao.getConnection();
					PreparedStatement ps=con.prepareStatement("select * from EmployeeUser");
					ResultSet rs=ps.executeQuery();
					while(rs.next()) {
						User u=new User();
						u.setId(rs.getInt(1));
						u.setName(rs.getString(2));
						u.setEmail(rs.getString(3));
						u.setPassword(rs.getString(4));
						list.add(u);
						
					}
					
					con.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
				return list;
			}
			
			// Update
			public static int Update(User u) {
				int status=0;
				
				try {
					Connection con=UserDao.getConnection();
					PreparedStatement ps=con.prepareStatement("Update EmployeeUser set Name='"+u.getName()+"'Email='"+u.getEmail()+"' Password='"+u.getPassword()+"' where Id="+u.getId());
//					ps.setString(2, u.getName());
//					ps.setString(3, u.getEmail());
//					ps.setString(4, u.getPassword());
//					
					status=ps.executeUpdate();
				con.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
				return status;
			}
		
			
		// Get By Id
			public static User getUserById(int id){  
			User u=new User();  
      
		try{  
        Connection con=UserDao.getConnection();  
        PreparedStatement ps=con.prepareStatement("select * from EmployeeUser where id=?");  
        ps.setInt(1,id);  
        ResultSet rs=ps.executeQuery();  
        if(rs.next()){  
            u.setId(rs.getInt(1));  
            u.setName(rs.getString(2));  
            u.setPassword(rs.getString(3));  
            u.setEmail(rs.getString(4));  
        }  
         con.close();
    }catch(Exception ex){
    	ex.printStackTrace();}  
      
    return u;  
}  
}
		

