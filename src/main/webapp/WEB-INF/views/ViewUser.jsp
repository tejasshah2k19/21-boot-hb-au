<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View User</title>
</head>
<body>

	<h2>User Profile</h2>
	<b>UserId</b>: ${user.userId }
	<bR>
	<b>FirstName</b>: ${user.firstName }
	<br>
	<b>Email</b>:${user.email }
	<br>
	<b>Password</b>:${user.password }
	<br>


	<br>
	<a href="/home">Home</a>
</body>
</html>