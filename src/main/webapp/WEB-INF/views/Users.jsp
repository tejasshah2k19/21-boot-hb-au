<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Users</title>
</head>
<body>

	<h2>List All Users</h2>


	<a href="home">Home</a>
	<br>

	<br>
	<table border="1">
		<tr>
			<th>UserID</th>
			<th>FirstName</th>
			<th>Action</th>
		</tr>
		<c:forEach items="${users}" var="user">
			<tr>
				<td>${user.userId}</td>
				<td>${user.firstName}</td>
				<td><a href="deleteuser/${user.userId}">Delete</a> | Edit | <a
					href="users/${user.userId}"> View</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>