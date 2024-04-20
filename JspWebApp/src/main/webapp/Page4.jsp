<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:useBean id="em" class="com.entites.Employee" scope="session" />
    
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
With Bean
</h1>
<%
em.setEmpno(1002);
em.setEname("Lokesh");
%>
<h1>Emp No : <%=em.getEmpno() %></h1>
<h1>Emp Name : <%=em.getEname() %></h1>
</body>
</html>