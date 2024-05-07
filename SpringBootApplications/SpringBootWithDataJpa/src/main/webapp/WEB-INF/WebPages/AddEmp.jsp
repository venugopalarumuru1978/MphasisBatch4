<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
        <%@ taglib prefix="frm" uri="http://www.springframework.org/tags/form" %>
    <%@ page isELIgnored="false" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" ></script>
</head>
<body class="bg-info">
<div class="container-fluid">
<hr />
<div class="row">
	<div class="col-md-12">
		<p style="text-align: center">
		<a href="newemp">New Employee</a>
		&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
		<a href="empall">All Employees</a>
		&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
		<a href="search">Search Employee</a>
		&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
		<a href="empjob">Search Employee Based On Job</a>	
	</p>
	</div>
</div>
<hr />
<div class="row">

<div class="col-md-3"></div>
<div class="col-md-6">

	<div class="card">
		<div class="card-header">
			<b>Employee Register</b>
		</div>
		<div class="card-body">
			<frm:form  method="post"  action="empprocess"  modelAttribute="emp">
				<label>Employee ID</label>
				<frm:input path="empno"  type="text" placeholder="Employee Number" class="form-control"  />
				<br />
				<label>Employee Name </label>
				<frm:input path="ename"  type="text" placeholder="Employee Name" class="form-control" />
				<br />
				<label>Job</label>
				<frm:select path="job" placeholder="Job" class="form-select">
					<frm:option value="Manager">Manager</frm:option>
					<frm:option value="Developer">Developer</frm:option>
					<frm:option value="Tester">Tester</frm:option>
				</frm:select>	
				<br />
				<label>Salary</label>
				<frm:input path="salary"  type="text" placeholder="Salary" class="form-control" />
				<br />
				<input type="submit"  class="btn btn-success" value="Register Employee" />
			</frm:form>		
		</div>
	</div>

</div>
<div class="col-md-3"></div>

</div>

	<h2>${msg }</h2>

</div>
</body>
</html>