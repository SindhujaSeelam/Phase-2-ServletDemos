<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <meta charset="UTF-8">
   <meta http-equiv="X-UA-Compatible" content="IE=edge">
   <meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Payment page</title>
</head>
<body background="https://img.freepik.com/free-vector/white-abstract-background_23-2148806276.jpg">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<center>
<h1>Payment Page</h1>
<h2>Flight Details</h2>
<font size="5">Airline :${flight.airline}<br>
<font size="5">Source:${flight.source}<br>
<font size="5">Destination:${flight.destination}<br>
<font size="5">Date:${flight.date}<br>
<font size="5">Price for one ticket:${flight.price}</font><br>
<font size="5">Total price:${persons*flight.price}</font>
<h2>Enter details for payment</h2>
<form action="displaydetails" method="get">
<br><font size="5">Bank account Number:<input type="text"  required/>
<br>
<br><font size="5">Card Holder Name :<input type="text" required/><br>
<br><font size="5">cvv:<input type="number" size="3" maxlength="3" onkeypress="if(this.value.length==3) return false;"required/><br>
<input type="hidden" name="pid"value="${pid}"/>
<input type="hidden" name="fid" value="${fid}"/><br>
<input type="hidden" name="persons" value="${persons}"/><br>
<input style="width:150px"type="submit" value="Click to pay"/>
</form>
</center>
</body>
</html>