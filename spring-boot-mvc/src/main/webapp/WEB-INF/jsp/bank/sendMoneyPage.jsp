<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bank</title>
</head>

<body>
	
	<div style="border: 1px solid #ccc; padding: 5px; margin-bottom: 20px;">
		<a href="/api/account">Accounts</a> | &nbsp; <a href="/api/sendMoney">Send Money</a>
	</div>

	<h2>Send Money</h2>
	<ul>
		<li>1 - Tom</li>
		<li>2 - Jerry</li>
		<li>3 - Donald</li>
	</ul>

	<div th:if="${errorMessage!=null}"
		style="color: red; font-style: italic" th:utext="${errorMessage}">..</div>

	<form th:action="@{/api/sendMoney}" th:object="${sendMoneyForm}"
		method="POST">
		<table>

			<tr>
				<td>From Bank Account Id</td>
				<td><input type="text" th:field="*{fromAccountId}" /></td>
			</tr>
			<tr>
				<td>To Bank Account Id</td>
				<td><input type="text" th:field="*{toAccountId}" /></td>
			</tr>
			<tr>
				<td>Amount</td>
				<td><input type="text" th:field="*{amount}" /></td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td><input type="submit" value="Send" /></td>
			</tr>
		</table>
	</form>
</body>
</html>