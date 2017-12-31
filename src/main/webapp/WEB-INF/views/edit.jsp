<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
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
		<br /> <br /> <br /> <b>Update Customer Details </b><br /> <br />
		<div>
			<form:form method="post" action="update" modelAttribute="customer">
				<table>
					<tr>
						<td>Name :</td>
						<td><form:input path="name" value="${map.customer.name}" />
						</td>
					</tr>
					<tr>
						<td>Age :</td>
						<td><form:input path="age" value="${map.customer.age}" /></td>
					</tr>
					<tr>
						<td>Gender :</td>
						<td><spring:bind path="gender">
								<c:forEach items='${map.genderList}' var='genderName'>
									<c:choose>
										<c:when test="${genderName eq map.customer.gender}">
											<input type="radio" name="gender" value="${genderName}"
												checked="checked">${genderName}  
          </c:when>
										<c:otherwise>
											<input type="radio" name="gender" value="${genderName}">${genderName}  
          </c:otherwise>
									</c:choose>
								</c:forEach>
							</spring:bind></td>
					</tr>
					<tr>
						<td>City :</td>
						<td><form:input path="city" value="${map.customer.city}" />
						</td>
					</tr>
					<tr>
						<td></td>
						<td><input type="submit" value="Save" /></td>
					</tr>
				</table>
				<form:input type="hidden" path="custId"
					value='${map.customer.custId}' />
			</form:form>
		</div>
	</center>
</body>
</html>
