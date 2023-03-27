<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Flight List</title>
</head>
<body background="https://img.freepik.com/free-vector/white-abstract-background_23-2148806276.jpg">
<center>
<table>
<tr>
<th><font size="5" color="darkred">Flight Id</font></th>
<th><font size="5" color="darkred">Airline</font></th>
<th><font size="5" color="darkred">Source</font></th>
<th><font size="5" color="darkred">Destination</font></th>
<th><font size="5" color="darkred">Date</font></th>
<th><font size="5" color="darkred">Price</font></th>
</tr>
<c:forEach var="flight" items="${flightlist}">
<tr>
<td><font size="5">${flight.fid}</font><br/></td>
<td><font size="5">${flight.airline}</font><br/></td>
<td><font size="5">${flight.source}</font></td>
<td><font size="5">${flight.destination}</font></td>
<td><font size="5">${flight.date}</font></td>
<td><font size="5">${flight.price}</font></td>
</tr>
</c:forEach>
</table> 

<br><a href="adminoptions.jsp" style="text-decoration:none"><font size="4">Back</font></a>
</center>
</body>
</html>