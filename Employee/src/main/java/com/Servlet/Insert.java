package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/insert")
public class Insert extends HttpServlet {
	
    public Insert() {
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, 
	IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		
		String Name=request.getParameter("name");
		String Email=request.getParameter("email");
		String Password=request.getParameter("password");
		
		Emp e=new Emp();
		e.setName(Name);
		e.setEmail(Email);
		e.setPassword(Password);
		
		int status=EmpDao.insert(e);
		if(status>0) {
			out.print("Insert Successfull..");
		}else {
			out.println("Sorry! Your data is not inserted!!");
		}
		out.close();
	}

}
