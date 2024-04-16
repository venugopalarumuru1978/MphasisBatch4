<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table width="100%" border="1">
<tr>
<td>

<h1>This is JSP Page.</h1>
<%
// java code
int x = 100;
float y = 12.45f;
List<String> lstStr = new ArrayList<String>();
lstStr.add("Laxmi");
lstStr.add("Pratheek");
lstStr.add("Manasvi");
lstStr.add("Srinivas");
%>
<h1>X value is : <%=x %></h1>
<h1>Y value is : <%=y %></h1>
<h1>Addition is : <%=(x+y) %></h1>

<%
for(String st : lstStr)
{
%>
	<h2><%=st %></h2>
<%
}
%>
<jsp:include page="Demos.html"/>

</td>
<td>
<form  method="POST"  action="Page2.jsp">
		<input type="text"  name="txtName" placeholder="Ur Name" />
		<input type="submit"  value="Click Me" />
</form>

</td>
</tr>
</table>




</body>
</html>