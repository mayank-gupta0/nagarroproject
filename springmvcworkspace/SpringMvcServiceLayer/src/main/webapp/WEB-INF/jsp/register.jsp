<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx"
	crossorigin="anonymous">
<title>Registration Page</title>

</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<a class="navbar-brand font-weight-bold" href="home">Shopping
			Store</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item"><a class="nav-link" href="home">Home</a></li>

			</ul>
		</div>
	</nav>
	<h1 class="text-center">Registration Form</h1>
	<div class="container w-25 p-3">
		<form id="regForm" modelAttribute="UserResponse"
			action="registerProcess" method="post">

			<div class="form-group">
				<label for="exampleInputPassword1">First Name</label> <input
					type="text" class="form-control" id="exampleInputfirstname"
					placeholder="Enter firstname" name=firstName required>

			</div>

			<div class="form-group">
				<label for="exampleInputPassword1">Last Name</label> <input
					type="text" class="form-control" id="exampleInputlastname"
					placeholder="Enter lastname" name="lastName" required>


			</div>

			<div class="form-group">
				<label for="exampleInputEmail1">Email address</label> <input
					type="email" class="form-control" id="exampleInputEmail1"
					aria-describedby="emailHelp" placeholder="Enter email" name="email"
					required>


			</div>

			<div class="form-group">
				<label for="exampleInputPassword1">Password</label> <input
					type="password" class="form-control" id="exampleInputPassword1"
					placeholder="Enter Password" name="password" pattern=".{4,}"
					required title="4 characters minimum" required>


			</div>

			<div class="form-group">
				<label for="exampleInputPassword1">Confirm Password</label> <input
					type="password" class="form-control" id="exampleInputPassword2"
					placeholder="Enter Confirm Password" name="confirmPassword"
					pattern=".{4,}" required title="4 characters minimum" required>


			</div>
			<button type="submit" class="btn btn-primary my-2">Submit</button>
		</form>
	</div>
</body>
</html>









































<%-- <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>
	<form:form id="regForm" modelAttribute="UserResponse"
		action="registerProcess" method="post">
		<center>
			<h2>Registration :</h2>
			<hr>
		</center>
		<table align="center">
			<tr>
				<td><form:label path="firstName">FirstName</form:label></td>
				<td><form:input path="firstName" name="firstName"
						id="firstname" /></td>
			</tr>
			<tr>
				<td><form:label path="lastName">LastName</form:label></td>
				<td><form:input path="lastName" name="lastName" id="lastname" /></td>
			</tr>
			<tr>
				<td><form:label path="email">Email</form:label></td>
				<td><form:input path="email" name="email" id="email" /></td>
			</tr>
			<tr>
				<td><form:label path="password">Password</form:label></td>
				<td><form:password path="password" name="password"
						id="password" /></td>
			</tr>

			<tr>
				<td><form:label path="confirmPassword">Confirm Password</form:label></td>
				<td><form:password path="confirmPassword"
						name="confirmpassword" id="confirmPassword" /></td>
			</tr>

			<tr>
				<td></td>
				<td><form:button id="register" name="register">Register</form:button></td>
			</tr>
			<tr></tr>
			<tr>
				<td></td>
				<td><a href="index.jsp">Home</a></td>

			</tr>

		</table>
	</form:form>

</body>
</html>
 --%>