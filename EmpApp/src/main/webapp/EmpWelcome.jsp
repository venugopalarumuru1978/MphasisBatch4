<%@page import="com.entities.Employee"%>
<%@page import="com.operations.EmpOperations"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	if(session.getAttribute("eno")!=null)
	{
	String ename = (String)session.getAttribute("ename");
	Integer eno = (Integer)session.getAttribute("eno");
	EmpOperations  emp_oper = new EmpOperations();
	Employee e = emp_oper.SearchEmployee(eno);
%>
<jsp:include page="Links2.jsp"/>
<h1>Welcome To : <%=ename %></h1>
<hr />
<table width="100%"  border="1">
<tr>
	<th>Emp ID</th>
	<th>Emp Name</th>
	<th>Emp Job</th>
	<th>Emp Salary</th>
	<th>Emp Email</th>
	<th>Emp Password</th>
</tr>
<tr>
		<td><%=e.getEmpno() %> </td>
		<td><%=e.getEname() %> </td>
		<td><%=e.getJob() %> </td>
		<td><%=e.getSalary() %> </td>
		<td><%=e.getEmail() %> </td>
		<td><%=e.getPswd() %> </td>
</tr>
</table>
<%
}
	else
	{
		response.sendRedirect("Login.jsp");
	}
%>
</body>
</html>