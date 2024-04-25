<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page  isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="loginfo">
<p style="text-align:center">
<input type="text"  name="txtUname" placeholder="Username" />
<br /><br />
<input type="password"  name="txtPwd" placeholder="Password" />
<br /><br />
<input type="submit" value="Click Me" />
</p>
</form>
<h2 style="color:red;text-align:center">
${msg }
</h2>
</body>
</html>