<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<style>
  h1
  {
 	color:green;
 	text-align:center;
  }
  #container
  {
  	width: 550px;
	margin: 30px auto;
	position: relative;
	padding: 0.5%;
	
  }
  .field {
	font-weight: bold;
	width: 200px;
}

.value {
	width: 350px;
}
#button
{
	font-weight:bold;
	margin-left:500px;
}
  
</style>
</head>
<body>
  <h1>Account Created Sucessfully</h1>
  <div id="container">
  	<table border="1" class="table table-striped table-bordered table-hover">
  		<tr>
  			<td class="field">Account Holder Name</td>
  			<td class="value">${accDetails.getAccountHolderName()}</td>
  		</tr>
  			<tr>
  			<td class="field">Account Number</td>
  			<td class="value">${accDetails.getAccountNumber()}</td>
  		</tr>
  			<tr>
  			<td class="field">Bank Name</td>
  			<td class"value">${accDetails.getBankName()}</td>
  		</tr>
  			<tr>
  			<td class="field">Email Address</td>
  			<td class="value">${accDetails.getEmailAddress()}</td>
  	</table>
  </div>
  
  <a href="./index.jsp">
  <input type="button" id="button"value="Click to SignUp" class="btn btn-primary"/>
  </a>
</body>
</html>