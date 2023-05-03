<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@ page import="hibernate_student.Student"%>
<%@page import="hibernate_student.Student_Dao"%>

<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Edit</title>
</head>
<body>
<%
		Student sd = new Student();
		String id = request.getParameter("id");
		int Id = Integer.parseInt(id);
		sd = Student_Dao.getById(Id);
		int i = sd.getId();
		String name = sd.getName();
		String email = sd.getEmail();
%>
	<form action="Server?action=update" method="post">

		<table>
			<tr>
				<td><b>Id</td>
				<td><input type='text' name='id' value="<%=id%>" readonly></td>
			</tr>
			<tr>
				<td><b>Name</td>
				<td><input type='text' name='name' value="<%=name%>" /></td>
			</tr>
			<tr>
				<td><b>Email</td>
				<td><input type='email' name='email' value="<%=email%>" /></td>
			</tr>

			<tr>
				<td><br>
				<input type="submit" name="Submit"></td>
			</tr>

		</table>
	</form>
</body>
</html>