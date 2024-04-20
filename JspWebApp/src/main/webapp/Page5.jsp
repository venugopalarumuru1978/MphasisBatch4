<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:useBean id="em" class="com.entites.Employee" scope="session" />
<jsp:setProperty property="empno" name="em" value="1001"/>
<jsp:setProperty property="ename" name="em" value="PK"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>

This is Page 3 
<br />
With Bean and setProp as well as getProp
</h1>

<h1>Emp No : <jsp:getProperty property="empno" name="em"/> </h1>
<h1>Emp Name : <jsp:getProperty property="ename" name="em"/></h1>
</body>
</html>