<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
        <%@ taglib prefix="frm" uri="http://www.springframework.org/tags/form" %>
    <%@ page isELIgnored="false" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="text-align: center">Employee Register</h1>

	<frm:form  method="post"  action="empprocess"  modelAttribute="emp">
<p style="text-align: center">
		<frm:input path="empno"  type="text" placeholder="Employee Number"  />
		<br /><br />
		<frm:input path="ename"  type="text" placeholder="Employee Name" />
		<br /><br />
		<frm:select path="job" placeholder="Job">
			<frm:option value="Manager">Manager</frm:option>
			<frm:option value="Developer">Developer</frm:option>
			<frm:option value="Tester">Tester</frm:option>
		</frm:select>
		<br /><br />
		<frm:input path="salary"  type="text" placeholder="Salary" />
	
		<br /><br />
		<input type="submit"  value="Register Employee" />
</p>
	</frm:form>
	
	<h2>${msg }</h2>
</body>
</html>