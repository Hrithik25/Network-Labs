<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ page isELIgnored="false"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p>Your reservation is confirmed successfully. Please, re-check the
		details.</p>
	First Name : ${reservation.firstName}
	<br> Last Name : ${reservation.lastName}
	<br> Gender : ${reservation.gender} Meals:
	<ul>
		<c:forEach var="meal" items="${reservation.food}">
			<li>${meal}</li>
		</c:forEach>
	</ul>
</body>
</html>