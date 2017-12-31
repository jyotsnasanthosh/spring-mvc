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
	text-align: left;
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
		<br /> <br /> <br /> <b> Enter Customer Details </b> <br /> <br />
		<div>
			<form:form method="post" action="insert" modelAttribute="customer">
				<table>
					<tr>
						<td>Id :</td>
						<td><form:input path="custId" /></td>
					</tr>
					<tr>
						<td>Name :</td>
						<td><form:input path="name" /></td>
					</tr>
					<tr>
						<td>Age :</td>
						<td><form:input path="age" /></td>
					</tr>
					<tr>
						<td>Gender :</td>
						<td><form:radiobuttons path="gender"
								items="${map.genderList}" /></td>
					</tr>
					<tr>
						<td>City :</td>
						<td><form:input path="city" /></td>
					</tr>
					<tr>
						<td></td>
						<td><input type="submit" value="Save" /></td>
					</tr>
					<tr>

						<td colspan="2"><a href="getCustomerList">View customer
								list</a></td>
					</tr>
				</table>
			</form:form>
		</div>
	</center>
</body>
</html>
