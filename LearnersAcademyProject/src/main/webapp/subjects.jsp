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
<center><h1>List of Subjects</h1></center>
<table>
<c:forEach var="subject" items="${list}">
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
<span class="tab"></span>
<span class="tab"></span>
<span class="tab"></span>
<span class="tab"></span>

<span class="tab"></span>${subject.name}</font><br/></td>
</tr>
</c:forEach>
</table>
<br><br><br>
<a href="adminmainpage.jsp" style="text-decoration:none"><font size=5>Back</font></a>
</body>
</html>