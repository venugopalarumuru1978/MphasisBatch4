<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="AddEmp">
	<p style="text-align: center;">
		<input type="text" name="txtEname" placeholder="Employee Name" required />
		<br /><br />
		<textarea name="txtAdrs" cols="30"  rows="5" placeholder="Address Here"></textarea>
		<br /><br />
		<input type="text" name="txtLoc" placeholder="Location" required />
		<br /><br />
		<input type="submit"  value="Add Employee" />
	</p>
</form>
</body>
</html>