<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Airline list</title>
</head>
<body background="https://img.freepik.com/free-vector/white-abstract-background_23-2148806276.jpg">
<center>
<table>
<tr>
<th><font size="5" color="darkred">Airline</font></th>
</tr>
<c:forEach var="airline" items="${airlinelist}">
<tr>
<td><font size="5">${airline.airline}</font><br/></td>
</tr>
</c:forEach>
</table>

<br><a href="adminoptions.jsp" style="text-decoration:none"><font size="4">Back</font></a>
</center>
</body>
</html>