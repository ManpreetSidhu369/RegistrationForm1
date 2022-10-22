<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> HomePage </title>
<script>
function validate(){
	
	var email = document.form.email.value;
	var password = document.form.password.value;
	
	if(email== null || email=="")
		{
		alert("Email cannot be Blank");
		return false;
		}
	else if(password == null || password=="")
		{
		alert("Password cannot be Blank");
		return false;
		}
			
}
</script>
</head>
<body style="background-image: url('Login.jpg')">
   
<form name="form" action="LoginServlet" method="post" onsubmit="return validate()" >
 
 <table align ="center" style= "background-color:skyblue ; color:green" >
 <tr><td>
 <h3> Welcome TO MY PRACTICUM PROJECT!</h3> </td></tr>
 <tr>
 <td><h3> PLEASE LOG IN:</h3> </td> </tr>
 <tr>
 <td> Email: </td>
 <td> <input type= "text" name="email"> </td>
 </tr>
 <tr>
 <td> Password: </td>
 <td> <input type= "password" name="password"> </td>
 </tr>
 <tr>
 <td><span style="color:red"><%=(request.getAttribute("errMessage") == null) ? ""
         : request.getAttribute("errMessage")%></span></td>
 </tr>
 <tr><td><input type ="submit" value="LOG IN"></td></tr>
 <tr><td align="center"> For new User, Click on REGISTER <br> <a href ="Register.jsp"> REGISTER </a></td></tr>
  
 </table> 
 </form> 
 
 </body>
</html>