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
<table width="100%" border="1">
<tr>
<th>Emp Number</th>
<th>Emp Name</th>
<th>Emp Address</th>
<th>Emp Location</th>
</tr>
<c:forEach var = "e" items="${emplist }">
<tr>
<td>${e.empno }</td>
<td>${e.ename }</td>
<td>${e.adrs.houseno }</td>
<td>${e.adrs.location }</td>
</tr>
</c:forEach>
</table>
</body>
</html>