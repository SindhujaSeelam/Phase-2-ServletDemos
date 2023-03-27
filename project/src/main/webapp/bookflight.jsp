<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration</title>
</head>
<body background="https://img.freepik.com/free-photo/white-cloud-sky-background_74190-4646.jpg?w=2000">
<form action="bookflight" method="get">
<center>
<h1>Registration</h1>
<h4>Enter details to register</h4>
<input type="hidden" name="fid" value="${fid}"/>
<input type="hidden" name="persons" value="${persons}"/>
<br><br><br><font size="5">Firstname :<input type="text"  name="firstname" required/><br>
<br>Lastname :<input type="text"  name="lastname" required/><br>
<br>Gender :
<select style="width:165px;height:23px" name="gender" required>
<option></option>
<option value="Male">Male</option>
<option value="Female">Female</option>
</select>
<br><br>Age :<input type="number"  size="26"name="age" max="999" onkeypress="if (this.value.length > 999) return false;" required/><br>
<br>Phone :<input type="number"  name="phone" max="9999999999" onkeypress="if(this.value.length==10) return false;" required/><br>
<br>Email :<input type="text"  name="email" required/><br>
<br><br><input type="submit" value="Register"/>
</center>
</form>
</body>
</html>