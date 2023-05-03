<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="java.util.List" %>
    <%@ page import="com.JSP.User" %>
    <%@ page import="com.JSP.UserDao" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Table</title>
<h1>List of Person</h1>
</head>
<body>
<form action="Insert.jsp"></form>

<br>
<table border="1">
<tr><td><b>ID</b></td><td><b>NAME</b></td><td><b>EMAIL</b></td><td><b>PASSWORD</td><td><b>OPERATION</td></tr>
<%
List<User> list=UserDao.getAllUser();

for(User u:list){
	out.print("<tr><td>"+u.getId()+"</td><td>"+u.getName()+"</td><td>"+u.getEmail()
	+"</td><td>"+u.getPassword()+"</td><td><a href=UpdateUser.jsp?id="+u.getId()+">Edit</a></td></tr>");
	
}

%>
</table>

</body>
</html>