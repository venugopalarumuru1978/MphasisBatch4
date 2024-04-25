<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page  isELIgnored="false" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>This is Second Page</h1>
<p style="text-align:center">
<a href="pg1">Page - 1</a>
&nbsp;&nbsp;&nbsp;&nbsp;
<a href="pg2">Page - 2</a>
</p>
<hr />
<h1>${lst }</h1>

<c:forEach var="s" items="${lst }">
	<p>${s }</p>
</c:forEach>
</body>
</html>