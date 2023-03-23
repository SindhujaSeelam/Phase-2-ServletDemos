<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<tr>
<th>Flight Id</th>
<th>Airline</th>
<th>Source</th>
<th>Destination</th>
<th>Date</th>
<th>Price</th>
</tr>
<c:forEach var="flight" items="${flight_list}">
<tr>
<td>${flight.fid}<br/></td>
<td>${flight.airline}<br/></td>
<td>${flight.source}</td>
<td>${flight.destination}</td>
<td>${flight.date}</td>
<td>${flight.price}</td>
<td><a href="bookflight.jsp?fid=${flight.fid}">book</a></td>
</tr>
</c:forEach>
</table> 
<a href="home.html">Back</a>
</body>
</html>