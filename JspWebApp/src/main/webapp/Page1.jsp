<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Page 1</h1>
<jsp:forward page="Page2.jsp">
<jsp:param value="This is JSP Action Tag" name="str"/>
</jsp:forward>
</body>
</html>