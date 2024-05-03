<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="fm" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="text-align:center">Add New Student</h1>
<p style="text-align:center">
<fm:form method="POST"  action="stdimgprocess"  modelAttribute="student"  enctype="multipart/form-data">
<fm:input type="text"  path="stdname" placeholder="Student Name" />
<br />
<br />
<input type="file" name="uploadImg" />
<br /><br />
<input type="submit"  value="Add Student" />

</fm:form>
</p>
<h2>${info }</h2>
</body>
</html>