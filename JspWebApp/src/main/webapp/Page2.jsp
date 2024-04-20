<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>This is Page 2</h1>
<%
String st = request.getParameter("str");
%>
<h1>Given Value is : <%=st %></h1>
<jsp:include page="Page3.jsp"/>
</body>
</html>