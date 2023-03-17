<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<h1>User List</h1>
<form action="UpdateStudentServlet" method="get">

<input type="hidden" name="studentid" value="${student.id}"/>
<table>
  <tr>
<td>First Name</td>
<td><input name="first_name" value="${student.first_name}"/></td>
  </tr>
   <tr>
<td>Last Name</td>
<td><input name="last_name" value="${student.last_name}"/></td>
  </tr>
   <tr>
<td>Email Id</td>
<td><input name="email" value="${student.email}"/></td>
  </tr>
   
  <tr>
  <td></td>
  <td><input type="submit" value="Add"/></td>
  </tr>
</table>
</form>
<a href="index.html">Back</a>
</body>
</html>