<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page import="hibernate_student.Student"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>GetById</title>
<h1>Enter your Id:</h1>
</head>
<body>
<tr><td><a class="btn-btn-primary" href="ViewAll.jsp" role="button">Home</a></td></tr>

<%
Student student = (Student)request.getAttribute("s");
%>
		<table border=1 width=100%>
			<tr>
				<td>Id</td>
				<td>Name</td>
				<td>Email</td>
			</tr>
			<tr>
			<td><%= student.getId() %></td>
			<td><%= student.getName() %></td>
			<td><%= student.getEmail() %></td>
			</tr>
			
		</table>
</body>
</html>