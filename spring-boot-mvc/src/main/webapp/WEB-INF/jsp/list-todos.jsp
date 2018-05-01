<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring Boot MVC</title>
</head>
<body>
	<div><a href="/api/logout">Logout</a></div>
	<div>
	Here are the list of your todos: ${todos}
	<BR /> Your Name is : ${name}
	</div>
</body>
</html>