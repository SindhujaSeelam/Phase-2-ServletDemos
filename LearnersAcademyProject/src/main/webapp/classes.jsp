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
<span class="tab"></span>

Class<span class="tab"></span></font></th>
<th><font size="5" color="darkred">Subject<span class="tab"></span></font></th>
<th><font size="5" color="darkred">Teacher<span class="tab"></span></font></th>
<th><font size="5" color="darkred">Time<span class="tab"></span></font></th>
<th><font size="5" color="darkred">Students list</font></th>
</tr>
<c:forEach var="sclass" items="${classeslist}">
<tr>
<td><font size="5">
<span class="tab"></span>
<span class="tab"></span>
<span class="tab"></span>
<span class="tab"></span>
<span class="tab"></span>
<span class="tab"></span>
<span class="tab"></span>
<span class="tab"></span>
<span class="tab"></span>
<span class="tab"></span>
<span class="tab"></span>${sclass.id}<span class="tab"></span></font><br/></td>
<td><font size="5">${sclass.subject}<span class="tab"></span></font><br/></td>
<td><font size="5">${sclass.teacher}<span class="tab"></span></font><br/></td>
<td><font size="5">${sclass.time}</font><br/></td>
<td><font size="5"><a href="studentsservlet">click</a></font><br/></td>
</tr>
</c:forEach>
</table>
<br><br><br>
<center><a href="adminmainpage.jsp" style="text-decoration:none"><font size=5>Back</font></a></center>
</body>
</html>