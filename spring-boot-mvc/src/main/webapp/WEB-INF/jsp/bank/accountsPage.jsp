<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bank</title>
<style>
th, td {
	padding: 5px;
}
</style>

</head>

<body>

	<div style="border: 1px solid #ccc; padding: 5px; margin-bottom: 20px;">
		<a href="/api/account">Accounts</a> | &nbsp; <a href="/api/sendMoney">Send Money</a>
	</div>


	<h2>Accounts</h2>

	<table border="1">
		<tr>
			<th>ID</th>
			<th>Full Name</th>
			<th>Balance</th>
		</tr>
		<tr th:each="accountInfo : ${accountInfos}">
			<td th:utext="${accountInfo.id}">..</td>
			<td th:utext="${accountInfo.fullName}">..</td>
			<td th:utext="${accountInfo.balance}">..</td>
		</tr>

	</table>
</body>
</html>