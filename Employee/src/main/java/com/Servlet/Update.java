package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Update")
public class Update extends HttpServlet {       
    public Update() {
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String sid=request.getParameter("id");
		int id=Integer.parseInt(sid);
		String Name=request.getParameter("name");
		String Email=request.getParameter("email");
		String Password=request.getParameter("password");
		
		Emp e=new Emp();
		e.setId(id);
		e.setName(Name);
		e.setEmail(Email);
		e.setPassword(Password);
		
		int status=EmpDao.Update(e);
		if(status>0) {
			response.sendRedirect("View Servlet");
			
		}else {
			out.print("Sorry! Unable to record...");
		}
		out.close();
		
	}
}
		
		

