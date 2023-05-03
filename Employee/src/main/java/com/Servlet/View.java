package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/View")
public class View extends HttpServlet {
       
    public View() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, 
	IOException {
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	
	
	
	out.print("<h1>Employee List</h1>");
	
	List<Emp> list=EmpDao.getAllEmployee();
	
	out.print("<table border=1 width=100%");
	out.print("<tr><th>Id</th><th>Name</th><th>Email</th><th>Password</th><th>Opeartion</th>");
	
	
	for(Emp e:list) {
		out.print("<tr><td>"+e.getId()+"</td><td>"+e.getName()+"</td><td>"+e.getEmail()
		+"</td><td>"+e.getPassword()+"</td><td><a href='Update'id="+e.getId()+"'>Edit</a></td></tr>");
		
		
	}
	out.print("</table>");
	out.print("<br> ");
	out.print("<a href='index.html'><b>ADD EMLOYEE</a>");
	out.close();
	
	
	}

}

