<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring Boot MVC</title>
</head>
<body>
	<div>
		<form method="post" accept-charset="utf-8">
			<p>
				Name : <input type="text" name="name" />
			</p>
			<p>
				Password : <input type="password" name="password" />
			</p>
			<p>
				<input type="submit" formAction="/api/auth" value="Submit"/>&nbsp;&nbsp;&nbsp;&nbsp;
				<input type="submit" formAction="/api/newUser" value="Register"/>
			</p>
		</form>
		<font color="red">${errorMessage}</font>
	</div>
</body>
</html>