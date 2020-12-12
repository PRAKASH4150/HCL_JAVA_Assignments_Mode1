<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Registration</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
</head>
<body>
	<header>
	<h1>Welcome to Pet Peers</h1>
	<h2>Register to continue</h2>
	</header>

	<section>
	<div id="container">
		<form:form action="add" method="post" modelAttribute="userDetails">

			<label for="username" class="field">Username</label>
			<br>
			<form:input path="userName" class="value" name="username" id="username"
				placeholder="Enter a username" />

			<label for="password" class="field">Password</label>
			<br>
			<form:password path="password" class="value" name="password" id="password"
				placeholder="Enter a Password" />

			<label for="cnfpassword" class="field">Confirm Password</label>
			<br>
			<form:password path="confirmPassword" class="value" name="cnfpassword"
				id="cnfpassword" placeholder="Confirm Password" />

			<input type="submit" id="button" name="register"
				class="btn btn-success" value="Submit">
		</form:form>
	</div>
	</section>

</body>
</html>