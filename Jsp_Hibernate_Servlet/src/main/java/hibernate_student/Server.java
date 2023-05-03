package hibernate_student;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/Server")
public class Server extends HttpServlet {
		public Server() {
        super();
        
    }	
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			doPost(req, resp);
		}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String action=request.getParameter("action");
		System.out.println(action);
		
		
			switch(action){
			
		case "save":
			
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		
		Student sd=new Student();
		sd.setName(name);
		sd.setEmail(email);
		Student_Dao.stdsave(sd);
		out.print("Inserted...");
		
		request.getRequestDispatcher("ViewAll.jsp").include(request,response);
		break;
		
		case "viewAll":
			
			int ids=Integer.parseInt(request.getParameter("id"));
			Student std=new Student(); 
			out.print("<table border=1 width=100%>");
			out.print("<tr><th>Id</th><th>Name</th><th>Email</th>");
			out.print("<tr><td>"+std.getId()+"</td><td>"+std.getName()
			+"<tr><td>"+std.getEmail()+"</td>"+std.getId()
			+"'></td></tr>");
			
			out.print("</table>");
			
			break;
			
		case "update":
		
			String id=request.getParameter("id");
			int sid=Integer.parseInt(id);
			String Name=request.getParameter("name");
			String Email=request.getParameter("email");
			
			Student st=new Student();
			st.setId(sid);
			st.setName(Name);
			st.setEmail(Email);
			Student_Dao.stdupdate(st);
			out.print("Updated...");
		request.getRequestDispatcher("ViewAll.jsp").include(request, response);
		break;
		
		case "delete":
			
			int id2=Integer.parseInt(request.getParameter("id"));
			Student s=new Student();
			s=Student_Dao.getById(id2);
			Student_Dao.stddelete(s);
			out.print("Deleted..");
			response.sendRedirect("ViewAll.jsp");
			break;
			
		case "getById":
			
			int i=Integer.parseInt(request.getParameter("id"));
			s=Student_Dao.getById(i);
			request.setAttribute("s", s);
			
			request.getRequestDispatcher("GetById.jsp").forward(request, response);
			break;
	}
		
		}
		
}
