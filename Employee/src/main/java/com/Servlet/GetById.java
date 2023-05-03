package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GetById")
public class GetById extends HttpServlet {
    public GetById() {
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.print("<form action=GetById method=get>");
		out.print("<table>");
		out.print("<h1>Enter ID<h1>");
		out.print("<tr><td></td><input type='text' name='id'</tr>");
		out.print("<br>");
		out.print("<br>");
		out.print("<input type=SUBMIT value=Submit>");
		out.print("</table>");
		out.print("</form>");
		Emp e1=new Emp();
		String sid=request.getParameter("id");
		int id=Integer.parseInt(sid);
		Emp e=EmpDao.GetById(id);
		out.print("<table border=1 width=100%>");
		out.print("<tr><td>Id</td><td>Name</td><td>Email</td><td>Password</td>");
		out.print("<tr><td>"+e.getId()+"</td><td>"+e.getName()+"</td><td>"+e.getEmail()
		+"</td><td>"+e.getPassword()+"</td>");
		out.print("</table>");
		out.close();
	}
	}

