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
<th>Id</th>
<th>FirstName</th>
<th>LastName</th>
<th>Email</th>
</tr>
<c:forEach var="student" items="${student_list}">
<tr>
<td><a href="loadstudent?studentid=${student.id}">${student.id}</a><br/></td>
<td>${student.first_name}<br/></td>
<td>${student.last_name}<br/></td>
<td>${student.email}<br/></td>
<td><a href="deletestudent?studentid=${student.id}">delete</a></td>
</tr>
</c:forEach>
</table> 
</body>
</html>