<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
            <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <style>
    select {
        appearance: none;
        outline: 0;
        background-image: none;
        width: 17em;
        height:3em;
        color: black;
        font-size: 2em;
        cursor: pointer;
        border: 1px solid black;
        border-radius: 3px;
    }
     
    .select {
        position: relative;
        display: block;
        width: 15em;
        height: 200em;
        line-height: 3;
        overflow: hidden;
        border-radius: .25em;
        padding-bottom: 10px;
    }
    .my-button{
    border-radius: 5px;
    border: 1px solid #000;
    padding: 10px 20px;
    background: yellow;
    font-size: 2em;
    cursor: pointer;
}
.tab {
            display: inline-block;
            margin-left: 40px;
        }
     
    </style>
</head>
<body>
<form action="allocateteachers">
<center>
<br><br><br><br><br>
<font size=6>Select Class<span class="tab"></span><span class="tab"></span><span class="tab"></span><span class="tab"></span><span class="tab"></span><span class="tab"></span><span class="tab"></span><span class="tab"></span>
Select Teacher</font><br>
<select name="classid">
<c:forEach var="list" items="${list}">
<option name="classid" value="${list.id}">${list.id}</option>
</c:forEach>
</select>
<select name="teacher">
<c:forEach var="list" items="${teacherslist}">
<option name="teacher" value="${list.firstname}${list.lastname}">${list.firstname}${list.lastname}</option>
</c:forEach>
</select><br><br><br>
<input class="my-button"type="submit" value="allocate"/>
</center>
</form>
<br><br><br>
<a href="adminmainpage.jsp" style="text-decoration:none"><font size=5>Back</font></
</body>
</html>