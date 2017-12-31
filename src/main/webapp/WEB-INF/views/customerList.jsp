<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Spring MVC</title>
<style>
body {
	font-size: 20px;
	color: teal;
	font-family: Calibri;
}

td {
	font-size: 15px;
	color: black;
	width: 100px;
	height: 22px;
	text-align: center;
}

.heading {
	font-size: 18px;
	color: white;
	font: bold;
	background-color: orange;
	border: thick;
}
</style>
</head>
<body>
	<center>
		<br /> <br /> <br /> <b>Customer List </b><br /> <br />



		<table border="1">
			<tr>
				<td class="heading">Customer Id</td>
				<td class="heading">Name</td>
				<td class="heading">Age</td>
				<td class="heading">Gender</td>
				<td class="heading">City</td>
				<td class="heading">Edit</td>
				<td class="heading">Delete</td>
			</tr>
			<c:forEach var="customer" items="${customerList}">
				<tr>
					<td>${customer.custId}</td>
					<td>${customer.name}</td>
					<td>${customer.age}</td>
					<td>${customer.gender}</td>
					<td>${customer.city}</td>
					<td><a href="edit?id=${customer.custId}">Update</a></td>
					<td><a href="delete?id=${customer.custId}">Delete</a></td>
				</tr>
			</c:forEach>
			<tr>
				<td colspan="7"><a href="register">Add New Customer</a></td>
			</tr>
		</table>

	</center>
</body>
</html>
