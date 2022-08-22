<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page import="com.entity.*" %>
    <%@page import="com.daoImpl.*" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
			String email = request.getParameter("username");
			String pwd = request.getParameter("password");
			User user = new User();
			user.setUserEmail(email);
			user.setUserPwd(pwd);
			UserDaoImpl obj = new UserDaoImpl();
			boolean isValid = obj.isValidUser(user);
			if(isValid)
				out.println("Valid User");
			else
				out.println("Invalid User");
%>


</body>
</html>