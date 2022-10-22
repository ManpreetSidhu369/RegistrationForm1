<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body style="background-image: url('intro.jpg')">
<h1 align ="center" style= "color:Green"> Welcome!!! You have Successfully Logged In</h1>
<h3 align="center" style= "color:green">Please Fill the below TextBoxes</h3>
<form name="form" action="IntroServlet" method="post"  align="center">
 <h3 style= "color:green">Introduction :</h3>
 
 <textarea rows="4" cols="50" name="Introduction" placeholder="Introduce yourself here..."></textarea>
 
 <h3 style= "color:green">Hobbies :</h3>
 <textarea rows="4" cols="50" name="Hobbies" placeholder="Write Your hobbies..."></textarea>
 <p><%=(request.getAttribute("errMessage") == null) ? ""
         : request.getAttribute("errMessage")%></p>
        
 <input type="Submit" name = "submit"   value="SUBMIT">
</form>
</body>
</html>