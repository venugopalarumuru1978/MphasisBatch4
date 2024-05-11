<%@page import="com.entities.Employee"%>
<%@page import="java.util.List"%>
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
	EmpOperations  e_oper = new EmpOperations();
	List<Employee>  emplist = e_oper.ViewAll();
%>

<table width="100%"  border="1">
<tr>
	<th>Emp ID</th>
	<th>Emp Name</th>
	<th>Emp Address</th>
	<th>Emp Location</th>
</tr>
<%
for(Employee e:emplist)
{
%>
<tr>
<td> <%=e.getEmpno() %></td>
<td> <%=e.getEname() %></td>
<td> <%=e.getAdrs().getHouseno() %></td>
<td> <%=e.getAdrs().getLocation() %></td>
</tr>

<%
}
%>
</table>
</body>
</html>