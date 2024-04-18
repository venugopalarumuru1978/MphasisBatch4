<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
<html>
<body>
<h2>Hello World!</h2>
<%
String str = request.getParameter("uname");
String str2 = request.getParameter("uid");
%>

<h2>User Id : <%=str2 %></h2>
<h2>User Name : <%=str %></h2>

<hr />

<c:set var="income" scope="session" value="${4000*4}"/>  
<p>Your income is : <c:out value="${income}"/></p>  
<c:choose>  
    <c:when test="${income <= 1000}">  
       Income is not good.
    </c:when>  
    <c:when test="${income > 10000}">  
        Income is very good.  
    </c:when>  
    <c:otherwise>  
       Income is undetermined...  
    </c:otherwise>  
</c:choose>
</body>
</html>
