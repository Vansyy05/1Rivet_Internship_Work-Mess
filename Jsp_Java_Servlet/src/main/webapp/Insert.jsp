<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="com.JSP.User" %>
    <%@ page import="com.JSP.UserDao" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert</title>

</head>
<body>

<%

String Name=request.getParameter("name");
String Email=request.getParameter("email");
String Password=request.getParameter("password");

User u=new User();

u.setName(Name);
u.setEmail(Email);
u.setPassword(Password);

int status=UserDao.insert(u);
out.print("<br>");
if(status>0) {
	out.print("Insert Successfull..");
	request.getRequestDispatcher("Table.jsp").include(request,response);
}else {
	out.println("Sorry! Your data is not inserted!!");
}
out.close();

%>

</body>
</html>