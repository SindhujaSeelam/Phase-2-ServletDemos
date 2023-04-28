<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin options</title>
<style>
.button {

  background-color:blue ; /* Green */
  border-radius: 8px;  
  border: none;
  color: white;
  width:250px;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
}
</style>
</head>
<body>
<center><h1>Welcome To Admin Portal</h1>
<a href="classesservlet" style="text-decoration:none"><font size="6"><button class="button">Classes</button></a><br>
<a href="teachersservlet" style="text-decoration:none"><font size="6"><button class="button">Teachers</button></font></a><br>
<a href="studentsservlet" style="text-decoration:none"><font size="6"><button class="button">Students</button></font></a><br>
<a href="subjectsservlet" style="text-decoration:none"><font size="6"><button class="button">Subjects</button></a><br>
<a href="teachersallocationdisplayservlet" style="text-decoration:none"><font size="6"><button class="button">Teachers Allocation</button></a><br>
<a href="subjectallocationdisplayservlet" style="text-decoration:none"><font size="6"><button class="button">Subjects Allocation</button></a><br><br></center>
<a href="home.html" style="text-decoration:none"><font size="4" color="black">Logout</font></a>
</body></html>