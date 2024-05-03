<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table width="100%" border="1">
<tr>
<th>Student Name</th>
<th>Student Image</th>
</tr>
<c:forEach  items="${stdlist }" var="std">
<tr>
<td>
${std.stdname }
</td>

<td>
<img src="/MyImgApp/getStudentPhoto/${std.stdid }"  width="50px"  height="50px" />
</td>
</tr>
</c:forEach>
</table>
</body>
</html>