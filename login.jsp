<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
<div class="container">
<h1>Login your Account</h1>
<form action="LoginServlet" method="post">
	<label for="username">Username:</label>
	<input type="text" id="username" name="username" required><br>
	<label for="password">Password:</label>
	<input type="password" id="password" name="password" required><br>
	<button type="submit" >Login</button>
	
</form>
<p><a href="index.html">Back to Home</a>
<%
String error=request.getParameter("error");
if(error!=null && error.equals("1")){%>
	<p style="color:red;">Inavalid Username and Password.</p>
	<p style="color:red;">Please try again.</p>
<%}%>

<%
String rs=request.getParameter("registration");
if(rs!=null && rs.equals("success")){%>
	<p style="color:Black;">Registration is successful.</p>
<%}%>
</div>
</body>
</html>