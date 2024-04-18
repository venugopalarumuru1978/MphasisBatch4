<%@page import="java.util.List"%>
<%@page import="com.operations.EmpOperations"%>
<%@page import="com.entities.*"%>
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
<%
if(session.getAttribute("admn")!=null)
{
EmpOperations  emp_oper = new EmpOperations(); 
List<Employee> emplist = emp_oper.ViewAll();
pageContext.setAttribute("emplist", emplist);
//Employee emp = emplist.get(0);
//out.print(emp.getEname());
%>
<jsp:include page="Links1.jsp"/>
<h1>Welcome to Administrator</h1>
<hr />
<table width="100%"  border="1">
<tr>
	<th>Emp ID</th>
	<th>Emp Name</th>
	<th>Emp Job</th>
	<th>Emp Salary</th>
	<th>Emp Email</th>
	<th>Emp Password</th>
	<th>Operations</th>
</tr>

<c:forEach var="emp" items="${emplist }">
<tr>
<td>
<c:out value="${emp.empno }" />
</td>
<td>
<c:out value="${emp.ename }" />
</td>
<td>
<c:out value="${emp.job }" />
</td>
<td>
<c:out value="${emp.salary }" />
</td>
<td>
<c:out value="${emp.email }" />
</td>
<td>
<c:out value="${emp.pswd }" />
</td>
<td>
<c:url value="DelEmp" var="deleteemp">
<c:param name="eno" value="${emp.empno }"/>
</c:url>
<a href="${deleteemp }">Delete</a>
</td>
</tr>
</c:forEach>
</table>
<%
}
else
	response.sendRedirect("Login.jsp");
%>
</body>
</html>