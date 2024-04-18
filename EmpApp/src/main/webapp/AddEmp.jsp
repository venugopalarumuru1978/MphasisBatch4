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
if(session.getAttribute("admn")!=null)
{
%>
<jsp:include page="Links1.jsp"/>
<h1>Welcome to Administrator</h1>
<hr />
<form method="post" action="AddEmp">
	<p style="text-align: center;">
		<input type="text" name="txtEname" placeholder="Employee Name" required />
		<br /><br />
		<label>Designation : </label>
		<br />
		<select name="ddlJob">
			<option value="Manager">Manager</option>
			<option value="Developer">Developer</option>
			<option value="Tester">Tester</option>
			<option value="Project Manager">Project Manager</option>
		</select>
		<br /><br />
		<input type="text" name="txtSal" placeholder="Employee Salary" required />
		<br /><br />
		<input type="text" name="txtEmail" placeholder="Employee Email" required />
		<br /><br />
		<input type="text" name="txtPwd" placeholder="Password" required />
		<br /><br />
		<input type="submit"  value="Add Employee" />
	</p>
</form>
<%
}
else
	response.sendRedirect("Login.jsp");
%>
</body>
</html>