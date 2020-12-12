<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Account SignUp</title>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/signup-style.css">
<script
	src="${pageContext.request.contextPath}/resources/scripts/signup-validation.js"></script>

</head>

<body>
	<header>
		<h1>Welcome to Net Banking</h1>
		<h2>SignUp to continue</h2>
	</header>

	<section>
		<div id="container">
			<p id="error">${error}</p>
			<form:form action="sign-up" method="post" modelAttribute="accDetails">
				<label for="username" class="field">Username</label>
				<br>
				<form:input path="userName" class="value" placeholder="Enter a username" />

				<label for="password" class="field">Password</label>
				<br>
				<form:password path="password" class="value"  placeholder="Enter a Password" />

				<label for="cnfpassword" class="field">Confirm Password</label>
				<br>
				<form:password path="confirmPassword" class="value" placeholder="Confirm Password" />
				<input type="submit" id="button" class="btn btn-success"
					value="Sign Up" onclick="return validateDetails()">

			</form:form>
		</div>
	</section>

</body>
</html>