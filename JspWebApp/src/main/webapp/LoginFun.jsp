<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %> 

<jsp:useBean id="logObj"  class="com.entites.Login" scope="session"/>

<jsp:setProperty property="uname" name="logObj" value='<%=request.getParameter("txtName") %>'/>
<jsp:setProperty property="pwd" name="logObj" value='<%=request.getParameter("txtPwd") %>'/>

<c:set var="uname" scope="session" value='<%=logObj.getUname() %>'/>
<c:set var="pwd" scope="session" value='<%=logObj.getPwd() %>'/>

<h1>User Name : <c:out value="${uname }"/></h1>
<h1>Password : <c:out value="${pwd }"/></h1>

<c:if test="${uname=='venugopal' && pwd=='v@123'}">  
   <jsp:forward page="Welcome.jsp"/>
</c:if>