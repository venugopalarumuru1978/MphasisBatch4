<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page isELIgnored="false" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<hr />
<p style="text-align: center">
	<a href="newemp">New Employee</a>
	&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
	<a href="empall">All Employees</a>
	&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
	<a href="search">Search Employee</a>	
	&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
	<a href="empjob">Search Employee Based On Job</a>	
</p>
<hr />
<h1 style="text-align: center">All Employees Information</h1>

<table width="100%" border="1">
<tr>
<th>Emp Number</th>
<th>Emp Name</th>
<th>Emp Job</th>
<th>Emp Salary</th>
<th>Operations</th>
</tr>
<c:forEach var = "e" items="${emplist }">
<tr>
<td>${e.empno }</td>
<td>${e.ename }</td>
<td>${e.job }</td>
<td>${e.salary }</td>
<td>
<a href="delemp/${e.empno }">Delete</a>
&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;
<a href="#">Update</a>
</td>
</tr>
</c:forEach>
</table>

</body>
</html>