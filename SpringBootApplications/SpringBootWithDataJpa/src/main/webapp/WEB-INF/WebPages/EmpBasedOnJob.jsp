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

<h1 style="text-align: center">Search Employees Based On Job</h1>
<form method="POST" action="sempjob">
<p style="text-align: center">
	Employee Job :  <input type="text"  name="txtJob" />
	<input type="submit"  value="Search" />
</p>
</form>

<c:if test="${not empty empjoblist }">

<table width="100%" border="1">
<tr>
<th>Emp Number</th>
<th>Emp Name</th>
<th>Emp Job</th>
<th>Emp Salary</th>
</tr>
<c:forEach var = "e" items="${empjoblist }">
<tr>
<td>${e.empno }</td>
<td>${e.ename }</td>
<td>${e.job }</td>
<td>${e.salary }</td>
</tr>
</c:forEach>
</table>
</c:if>
<c:if test="${empjoblist==null }">
<h2 style="text-align: center;color:red">${msg }</h2>
</c:if>
</body>
</html>