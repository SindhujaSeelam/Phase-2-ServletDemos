<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Teachers list</title>
<style>
        .tab {
            display: inline-block;
            margin-left: 40px;
        }
    </style></head>
<body>
<center><h1>Teachers Detailed Information</h1>
<table>
<tr>
<th><font size="5" color="darkred">Firstname<span class="tab"></span>
</font></th>
<th><font size="5" color="darkred">Lastname<span class="tab"></span>
</font></th>
<th><font size="5" color="darkred">Age<span class="tab"></span>
</font></th>
<th><font size="5" color="darkred">Gender</font></th>

</tr>
<c:forEach var="teacher" items="${teacherslist}">
<tr>
<td><font size="5">${teacher.firstname}</font><br/></td>
<td><font size="5">${teacher.lastname}</font><br/></td>
<td><font size="5">${teacher.age}</font><br/></td>
<td><font size="5">${teacher.gender}</font><br/></td>

</tr>
</c:forEach>
</table>
<br><br><br>
<a href="adminmainpage.jsp" style="text-decoration:none"><font size=5>Back</font></a>
</body>
</html>