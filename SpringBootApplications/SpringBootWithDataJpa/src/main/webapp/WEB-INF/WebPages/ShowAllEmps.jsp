<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page isELIgnored="false" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" ></script>

</head>
<body class="bg-info">
<div class="container-fluid">
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

<table class="table table-success table-striped">
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
</div>
</body>
</html>