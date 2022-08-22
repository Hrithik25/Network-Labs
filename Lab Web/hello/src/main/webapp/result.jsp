<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String first_name = request.getParameter("first_name");
		String last_name = request.getParameter("last_name");
		
		out.println("Your Name is " +first_name +" " +last_name);
	%>
</body>
</html>