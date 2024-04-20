<%@page import="com.entites.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>
This is Page 3 
<br />
Without Bean
</h1> 
<%
Employee emp = new Employee();
emp.setEmpno(1001);
emp.setEname("Pavan");
%>

<h1>Emp No : <%=emp.getEmpno() %></h1>
<h1>Emp Name : <%=emp.getEname() %></h1>
</body>
</html>