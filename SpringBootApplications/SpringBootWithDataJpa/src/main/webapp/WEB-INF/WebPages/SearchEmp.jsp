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
<h1 style="text-align: center">Search Employee</h1>
<form method="POST" action="semp">
<p style="text-align: center">
	Employee Number :  <input type="text"  name="txtEmpno" />
	<input type="submit"  value="Search" />
</p>
</form>

<c:if test="${not empty emp }">
<table width="100%" border="1">
<tr>
<th>Employee Number</th>
<th>Employee Name</th>
<th>Employee Job</th>
<th>Employee Salary</th>
</tr>
<tr>
<td>${emp.empno }</td>
<td>${emp.ename }</td>
<td>${emp.job }</td>
<td>${emp.salary }</td>
</tr>
</table>
</c:if>

<h2 style="text-align: center;color:red">${msg }</h2>
</body>
</html>