<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Confirmation</title>
</head>
<body>
	<p> The customer is confirmed: ${customer.firstName} ${customer.lastName} </p>
	<br><br>
	Free passes: ${customer.freePasses}
	<br><br>
	Postal Code: ${customer.postalCode}
		<br><br>
	Course Code: ${customer.courseCode}
</body>
</html>