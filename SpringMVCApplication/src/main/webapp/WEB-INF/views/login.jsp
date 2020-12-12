<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Account Login</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
 <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/login-style.css" >
</head>
<body>
	<header>
		<h1>Welcome to Net Banking</h1>
		<h2>Login to Continue</h2>
	</header>
	
	<section>
	    <p id="success">${success}</p>
	    <p id="error">${error}</p>
		<div id="container1">
		
		<form:form action="log-in" method="post" modelAttribute="loginDetails">
		
		    <label for="emailid" class="field">Email Id</label><br>
			<form:input path="emailId" class="value" name="emailid" id="emailid" placeholder="Enter Email Id"/>
			
			<label for="password" class="field">Password</label><br>
			<form:password path="password" class="value" name="password" id="password" placeholder="Enter Password"/>
			
			 <input type="submit" id="button"  name="signup" class="btn btn-success"value="login"> 
		</form:form>
		</div>
		
		<div id="container2">
			<p>Didn't have an account? <a href="signup">Create Account</a></p>
		</div>
	</section>
</body>
</html>