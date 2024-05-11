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
			<frm:form  method="post"  action="empprocess"  modelAttribute="emp">
				<label>Employee ID</label>
				<frm:input path="empno"  type="text" placeholder="Employee Number"  />
				<br />
				<label>Employee Name </label>
				<frm:input path="ename"  type="text" placeholder="Employee Name" />
				<br />
				<label>Address</label>
				<frm:input path="adrs.houseno"  type="text" placeholder="Address" />
				<br />
				<label>Salary</label>
				<frm:input path="adrs.location"  type="text" placeholder="Location" />
				<br />
				<input type="submit"  value="Register Employee" />
			</frm:form>	
</body>
</html>