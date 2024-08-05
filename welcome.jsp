<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="jakarta.servlet.http.HttpSession" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index</title>
<link rel="stylesheet" href="index.css">
</head>
<body>
 <%
        
        HttpSession session1 = request.getSession(false);

       
        if (session1 != null && session1.getAttribute("username") != null) {
          
            String username = (String) session1.getAttribute("username");
    %>
<div class="container">
<h1>Welcome, <%%>!</h1>
<p>We are delighted to have you on our platform.</p>
<h3>Explore, learn, and connect with like-minded individuals.</h3>
<p>Feel free to stay as long as you like and when you're ready,</p>
<p>you can logout securely.</p>
<div class="links">
<a href="logout.jsp">Logout</a>
</div>
</div>
 <%
        } else {
           
            response.sendRedirect("login.jsp");
        }
    %>
</body>
</html>
