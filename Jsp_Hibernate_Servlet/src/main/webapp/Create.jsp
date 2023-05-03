<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>IndexPage</title>
<h1>Student Detail</h1>
</head>
<body>
<tr><td><a  href="ViewAll.jsp" role="button">Home</a></td></tr>

<form action="Server?action=save" method="post">

<table>

<tr><td><b>NAME:</td><td><input type="text" name="name"></td></tr>
<tr><td><b>EMAIL:</td><td><input type="email" name="email"></td></tr>
<tr><td><input type="submit" value="Submit"/></td></tr>


</table>
</form>
</body>
</html>