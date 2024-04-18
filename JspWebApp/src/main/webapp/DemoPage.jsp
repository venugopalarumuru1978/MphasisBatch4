<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
    <%@ page isELIgnored="false" %>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>
	<c:out value="${'Hello World'}" />
	<br />
	<c:set var="salary"  value="${20001}" />
	Salary is : <c:out value="${salary }" />
	
	<br />
	<c:if test="${salary>20000 }">
		<c:out  value="${'Salary is above equals 20000' }" />
	</c:if>

	<c:if test="${salary<20000 }">
		<c:out  value="${'Salary is less than 20000' }" />
	</c:if>
	
	<c:if test="${salary==20000 }">
		<c:out  value="${'Salary is equals 20000' }" />
	</c:if>
	<c:remove var="salary" />
	<br />
	Salary is : <c:out value="${salary }" />
	<hr />
	
	<c:forEach var="n"  begin="1" end="10">
	<c:out  value="${n}" />
	</c:forEach>
</h2>

<%
	List<String> lst1 = new ArrayList<String>();
	lst1.add("pavani");
	lst1.add("murali");
	lst1.add("varun");
	
	pageContext.setAttribute("listinfo", lst1);
%>

<c:forEach var="s"  items="${listinfo}">
<h2>
<c:out value="${s }"/>
</h2>
</c:forEach>

<hr />
<c:url value="index.jsp" var="urlmap">
<c:param name="uname" value="pavan" />
<c:param name="uid" value="1001" />
</c:url>

<c:out value="${urlmap }" />
<c:redirect url="${urlmap }"/>
</body>
</html>