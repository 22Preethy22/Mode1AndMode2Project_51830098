<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer app login page!</title>
<style type="text/css">
.error {
	font-style: italic;
	font-family: serif;
	color: red;
}
</style>
</head>
<body background="C:\Users\Coalesce\Desktop\login_pic3.jpg">
	${error}
	
	<form:form action="login" method="post" modelAttribute="userbean">
	<br/>
		<table align="center" width=20% bgcolor="grey">
			<tr>
				<td>Enter email: <form:input path="email" /> <form:errors
						path="email" class="error" /> <br />

				</td>
			</tr>
			<tr>
				<td>Enter password: <form:input path="password" type="password" />
					<form:errors path="password" class="error" /> <br />
				</td>
			</tr>
			<tr>
				<td><input type="submit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>