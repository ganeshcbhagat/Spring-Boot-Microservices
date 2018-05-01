<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring Boot MVC</title>
</head>
<body>

	<p><span>Welcome ${name}!! <a href="/api/list-todos" name=${name}>Click here</a> to manage your todo's.</span></p>
	<p><span> <a href="/api/h2_console" target="_blank">Show Database</a></span></p>
</body>
</html>
