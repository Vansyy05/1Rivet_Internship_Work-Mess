<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
     <%@ page import="com.JSP.User" %>
    <%@ page import="com.JSP.UserDao" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update User</title>

</head>
<body>
<form action="Table.jsp"></form>
<br>

<h1>Edit Detail</h1>
</head>
<body>

<% 

int id=Integer.parseInt(request.getParameter("id"));
User u=new User();

u=UserDao.getUserById(id);

String  name=u.getName();
String  email=u.getEmail();
String  password=u.getPassword();
%>
<form action ="EditUser.jsp" method="post">
<table>
<tr><td>Id</td><td><input type='text' name='Id' value="<%=id %>" readonly></td></tr>
<tr><td>Name</td><td><input type='text' name='name' value="<%=name %>"/></td></tr>
<tr><td>Email</td><td><input type='email' name='email' value="<%=email%>"/></td></tr>
<tr><td>Password</td><td><input type='password' name='password' value="<%=password %>"/></td></tr>
<tr><td><br><input type="submit" name="submit"></td></tr>
</table>
</form>
</body>
</html>



