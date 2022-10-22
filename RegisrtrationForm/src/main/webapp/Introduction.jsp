<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-image: url('Display.jpg')">
<h1 align="center" style= "color:green"> Below are your Introduction & Hobbies
</h1><br>

 <h3 align="center"> Introduction :<%=request.getAttribute("Introduction") %></h3><br>
<h3 align="center"> Hobbies:<%=request.getAttribute("Hobbies") %></h3><br>

<div style="text-align: center"><a href="LogoutServlet"><h3>Logout</h3></a></div>

</body>
</html>