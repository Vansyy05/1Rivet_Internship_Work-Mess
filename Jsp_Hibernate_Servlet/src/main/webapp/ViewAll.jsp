<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page import="hibernate_student.Student"%>
<%@ page import="hibernate_student.Student_Dao"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ViewAll</title>
<h1>All User Detail</h1>
</head>
<body>
<table border="1">
			<tr>
				<td><b>ID</b></td>
				<td><b>NAME</b></td>
				<td><b>EMAIL</b></td>
				<td><b>OPERATION</b></td>
			</tr>
			<%
			List<Student> list = Student_Dao.getAllStudent();
			for (Student std1 : list) {
				%>
				<tr>
				<td><a href="Server?action=getById&id=<%= std1.getId() %>"><%= std1.getId() %></a></td>
				<td><%= std1.getName() %></td>
				<td><%= std1.getEmail() %></td>
				<td><a href="Server?action=delete&id=<%= std1.getId() %>">Delete</a>
				</tr>
			<%}%>
		</table>
<a href="Create.jsp" role="button">Add New User</a></td></tr>
<a href="EditById.jsp" role="button">Edit</a></td></tr>

		
</body>
</html>