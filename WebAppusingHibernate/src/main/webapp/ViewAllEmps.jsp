<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<%@ page import="com.entities.Employee" %>
<%@ page import="com.operations.EmpOperations" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
EmpOperations  emp_oper = new EmpOperations(); 
List<Employee> emplist = emp_oper.ViewAll();
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
</tr>

<%
for(Employee e : emplist)
{
%>
	<tr>
		<td><%=e.getEmpno() %> </td>
		<td><%=e.getEname() %> </td>
		<td><%=e.getJob() %> </td>
		<td><%=e.getSalary() %> </td>
		<td><%=e.getEmail() %> </td>
		<td><%=e.getPswd() %> </td>
	</tr>
<%
}
%>


</table>

</body>
</html>