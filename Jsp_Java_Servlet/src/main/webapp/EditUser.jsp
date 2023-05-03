<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="com.JSP.User" %>
    <%@ page import="com.JSP.UserDao" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit User</title>

</head>
<body>

<%
int sid=Integer.parseInt(request.getParameter("id"));   

String Name=request.getParameter("name");
String Email=request.getParameter("email");
String Password=request.getParameter("password");

User u=new User();
u.setId(sid);
u.setName(Name);
u.setEmail(Email);
u.setPassword(Password);

int status=UserDao.Update(u);


if(status>0) {
	out.print("Record Successfully Changed!!!");
	
}else {
	out.print("Sorry! Unable to record...");
}
out.close();

%>


</body>

</html>