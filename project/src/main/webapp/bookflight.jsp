<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="bookflight" method="get">
<input type="text" name="fid" value="${flight.fid}"/>
Firstname :<input type="text"  name="firstname"/><br>
Lastname :<input type="text"  name="lastname"/><br>
Gender :<input type="text"  name="gender"/><br>
Age : :<input type="text"  name="age"/><br>
Phone :<input type="text"  name="phone"/><br>
Email :<input type="text"  name="email"/><br>
<input type="submit" value="submit"/>
</form>
</body>
</html>