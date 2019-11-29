<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body background="C:\Users\Coalesce\Desktop\Holiday-Shopping-online4.jpg">
<style>
h3{
	text-align: center;
	color:purple;
}
h4{
	text-align: center;
	color:black;
}
</style>
<h3>CUSTOMER INFORMATION</h3>
	<table border=1 align="center" bgcolor="pink" width=20%>
		<thead>
			<tr>
				<th>id</th>
				<th>name</th>
				<th>address</th>
				<th>mobile</th>
				<th>salary</th>
				<th>update</th>
				<th>delete</th>
				<th>Employee</th>
				<th>Emp email</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${customers}" var="customer">
				<tr>
					<td>${customer.id}</td>
					<td>${customer.name}</td>
					<td>${customer.address}</td>
					<td>${customer.mobile}</td>
					<td>${customer.salary}</td>
					<td>${customer.email}</td>
					<td>${customer.employee}</td>
					<td><a href="update?id=${customer.id}">update</a></td>
					<td><a href="delete?id=${customer.id}">delete</a></td>
				</tr>
			</c:forEach>
			
		</tbody>
	</table>
	<c:if test="${user.profile=='admin' || user.profile=='Manager'}"/>
	
	<h4>Add Customer :  <a href="addcustomer">click here</a><br/></h4>
	<h4>LogOut :  <a href="logout">logout</a></h4>
	
</body>
</html>