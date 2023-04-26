<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Available flights</title>
</head>
<body background="https://img.freepik.com/free-photo/white-cloud-sky-background_74190-4646.jpg?w=2000">
<center><table><br><br><br><br>
<h1>Available Flights</h1>
<tr>
<th><font size="5" color="darkred">Flight Id  </font></th>
<th><font size="5" color="darkred">Airline</font></th>
<th><font size="5" color="darkred">Source</font></th>
<th><font size="5" color="darkred">Destination</font></th>
<th><font size="5" color="darkred">Date</font></th>
<th><font size="5" color="darkred">Price</font></th>
</tr>
<c:forEach var="flight" items="${flight_list}">
<tr>
<td><font size="5">${flight.fid}</font><br/></td>
<td><font size="5">${flight.airline}</font><br/></td>
<td><font size="5">${flight.source}</font></td>
<td><font size="5">${flight.destination}</font></td>
<td><font size="5">${flight.date}</font></td>
<td><font size="5">${flight.price}</font></td>
<td><a href="userregister?fid=${flight.fid}&persons=${persons}"style="text-decoration:none"><font size="5">Book</a></td>
</tr>
</c:forEach>
</table></center>
<br><br><center><a href="booking.jsp" style="text-decoration:none"><font size="5">Back</a></center>
</body>
</html>