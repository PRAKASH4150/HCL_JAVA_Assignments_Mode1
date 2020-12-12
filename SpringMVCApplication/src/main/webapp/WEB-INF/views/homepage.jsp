<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Banking-Home</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/homepage-style.css" >
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
 <h1>Account Summary</h1>
  <div id="container">
  	<table border="1" class="table table-striped table-bordered table-hover">
  		<tr>
  			<td class="field">Account Holder Name</td>
  			<td class="value">${accountSummary.getAccountHolderName()}</td>
  		</tr>
  			<tr>
  			<td class="field">Account Number</td>
  			<td class="value">${accountSummary.getAccountNumber()}</td>
  		</tr>
  			<tr>
  			<td class="field">Bank Name</td>
  			<td class"value">${accountSummary.getBankName()}</td>
  		</tr>
  			<tr>
  			<td class="field">Available Balance</td>
  			<td class="value">${accountSummary.getCurrentBalance()}/- INR</td>
  	</table>
  </div>
</body>
</html>