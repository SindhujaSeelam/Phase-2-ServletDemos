<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
        .tab {
            display: inline-block;
            margin-left: 40px;
        }
    </style>
</head>
<body>
<center><h1>Students Information</h1></center>
<table>
<tr>
<th><font size="5" color="darkred"><span class="tab"></span>
<span class="tab"></span>
<span class="tab"></span>
<span class="tab"></span>
<span class="tab"></span>
<span class="tab"></span>
<span class="tab"></span>
<span class="tab"></span>
<span class="tab"></span>
<span class="tab"></span>

<span class="tab"></span>Firstname<span class="tab"></span></font></th>
<th><font size="5" color="darkred">Lastname<span class="tab"></span></font></th>
<th><font size="5" color="darkred">Age<span class="tab"></span></font></th>
<th><font size="5" color="darkred">Gender</font></th>

</tr>
<c:forEach var="student" items="${list}">
<tr>
<td><font size="5"><span class="tab"></span>
<span class="tab"></span>
<span class="tab"></span>
<span class="tab"></span>
<span class="tab"></span>
<span class="tab"></span>
<span class="tab"></span>
<span class="tab"></span>
<span class="tab"></span>
<span class="tab"></span>
<span class="tab"></span>${student.firstname}<span class="tab"></span>
</font><br/></td>
<td><font size="5">${student.lastname}<span class="tab"></span>
</font><br/></td>
<td><font size="5">${student.age}<span class="tab"></span>
</font><br/></td>
<td><font size="5">${student.gender}</font><br/></td>

</tr>
</c:forEach>
</table>
<br><br><br>
<center><a href="adminmainpage.jsp" style="text-decoration:none"><font size=5>Back</font></a></center>
</body>
</html>