<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Source and destination list</title>
</head>
<body background="https://img.freepik.com/free-vector/white-abstract-background_23-2148806276.jpg">
<center>
<table>
<tr>
<th><font size="5" color="darkred">Source</th>
<th><font size="5" color="darkred">Destination</th>
</tr>
<c:forEach var="sd" items="${sdlist}">
<tr>
<td><font size="5">${sd.source}</font><br/></td>
<td><font size="5">${sd.destination}</font><br/></td>
</tr>
</c:forEach>
</table>

<br><a href="adminoptions.jsp" style="text-decoration:none"><font size="4">Back</font></a>
</center>
</body>
</html>