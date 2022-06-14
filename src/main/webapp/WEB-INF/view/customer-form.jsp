<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Registration Form</title>
<style>
	.error {color: red}
</style>
</head>
<body>
	<form:form action="processForm" modelAttribute="customer">
		First name: <form:input path="firstName"/>
		<br><br>
		Last name (*): <form:input path="lastName" />
		<form:errors path="lastName" cssStyle="error"></form:errors>
		<br><br>
		Free Passes (*): <form:input path="freePasses" />
		<form:errors path="freePasses" cssStyle="error"></form:errors>
		<br><br>
		Postal Code (*): <form:input path="postalCode" />
		<form:errors path="postalCode" cssStyle="error"></form:errors>
		<br><br>
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>