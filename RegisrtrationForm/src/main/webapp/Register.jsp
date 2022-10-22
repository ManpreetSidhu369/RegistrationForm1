<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
<script type="text/javascript">


function validateForm() {

	var FirstName = document.forms["myForm"]["FirstName"].value;
	if (FirstName == "") {
	  alert("FirstName must be filled out");

	  return false;
	}

  var LastName = document.forms["myForm"]["LastName"].value;
   if(LastName == "")
 {
 alert("LastName cannot be Blank");
 return false;
 }
 var Email = document.forms["myForm"]["Email"].value;
 if( Email == "")
{
alert("Email cannot be Blank");
return false;
}
 var Password = document.forms["myForm"]["Password"].value;
 if(Password.length < 6)
{
alert("Password must be at least 6 characters long.");
return false;
}
	
 var ConfPassword = document.forms["myForm"]["ConfPassword"].value;
 if(Password != ConfPassword)
 {
 alert("Confirm Password should match the Password");
 return false;
 }

}
</script>
</head>
<body style="background-image: url('Registration.jpg')">
 
<form name="myForm" action="RegisterServlet" method="post" onsubmit= "return validateForm()">
<table align = "center" style= "background-color:skyblue ; color:green">
<tr><td><h2> REGISTER AS A NEW USER   !!!!!!!</h2></td></tr>
<tr>
<td> First Name: <br><input type="text" name = "FirstName"> </td>
</tr>
<tr>
<td> Last Name:<br> <input type="text" name = "LastName"> </td>
</tr>
<tr>
<td> Email: <br> <input type="email" name = "Email"> </td>
</tr>
<tr>
<td> Password:<br> <input type="Password" name = "Password"> </td>
</tr>
<tr>
<td>  Retype-Password:<br> <input type="password" name = "ConfPassword"> </td>
</tr>
<tr>
         <td><%=(request.getAttribute("errMessage") == null) ? ""
         : request.getAttribute("errMessage")%></td>
         </tr>
<tr>
<td> <br> <input type="Submit" name = "submit"   value="Register"> </td>
</tr>

</table>

</form>

</body>
</html>