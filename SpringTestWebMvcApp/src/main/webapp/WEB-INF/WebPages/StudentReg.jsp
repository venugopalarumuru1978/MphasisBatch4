<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page  isELIgnored="false" %>
    <%@ taglib prefix="frm" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<frm:form method="post" action="stdreginfo" modelAttribute="std">
<p style="text-align:center">
<label>Roll Number</label><br />
<frm:input path="rollno" type="text" />
<br /><br />
<label>Student Name </label><br />
<frm:input path="sname"  type="text" />
<br /><br />
<label>Course </label><br />
<frm:input path="course"  type="text" />
<br /><br />
<label>Course Fees </label><br />
<frm:input path="fees"  type="text" />
<br /><br />
<input type="submit" value="Click Me " />
</p>
</frm:form>
<hr />
<h1>Roll Number : ${sinfo.rollno }</h1>
<h1>Student Name : ${sinfo.sname }</h1>
<h1>Course : ${sinfo.course }</h1>
<h1>Fees : ${sinfo.fees }</h1>
</body>
</html>