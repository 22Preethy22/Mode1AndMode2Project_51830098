<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.error {
	color: pink;
	font-family: serif;
	font-style: italic;
}
</style>
</head>
<body background="C:\Users\Coalesce\Downloads\preview.v1.png">
<style>

h3{
	text-align: left;
	color:#b76e9e;
}


</style>
	<form:form action="addcustomer" method="post" modelAttribute="customer">
		<form:hidden path="id" />
		<table align="left" width=25% border=0.5 >
			<tr>
				<td><h3>Enter name:<form:input path="name" /> <form:errors
						path="name" class="error" /> <br />
						</h3>
				</td>
			</tr>
			<tr>
				<td><h3>Enter address:<form:input path="address" /> <form:errors
						path="address" class="error"></form:errors> <br />
						</h3>
				</td>
			</tr>
			<tr>
				<td><h3>Enter mobile:<form:input path="mobile" /> <form:errors
						path="mobile" class="error" /> <br /></h3>
				</td>
			</tr>
			<tr>
				<td><h3>Enter salary:<form:input path="salary" /> <form:errors
						path="salary" class="error" /> <br /></h3>
				</td>
			</tr>
			<tr>
				<td><h3>Enter Emp email:<form:input path="email" /> <form:errors
						path="email" class="error" /> <br /></h3>
				</td>
			</tr>
			<tr>
				<td><h3>Enter Employee:<form:select path="employee"
						items="${EmpList}" /> <form:errors path="Employee" class="error"></form:errors>
					<br /></h3>
				</td>
			</tr>
			<tr>
				<td><input type="submit"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>