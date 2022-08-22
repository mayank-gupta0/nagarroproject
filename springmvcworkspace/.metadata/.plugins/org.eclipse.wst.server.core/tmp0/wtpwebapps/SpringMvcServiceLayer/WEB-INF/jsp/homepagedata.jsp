<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx"
	crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
	<div class="text-center">
		<table class="table table-hover">
			<thead class="thead-dark">
				<tr>
					<th scope="col">Name</th>
					<th scope="col">Description</th>

				</tr>

			</thead>

			<tbody>
				<c:forEach var="get" items="${data}">
					<tr>
						<td>${get.productName}</td>
						<td>${get.productDescription}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<div class="text-center">
		<p>Do Login/Register For More Information</p>
		<button type="submit" class="btn btn-light my-2">
			<a class="text-decoration-none" href="login">LogIn</a>
		</button>
		<button type="submit" class="btn btn-light my-2">
			<a class="text-decoration-none" href="register">Register</a>
		</button>
		
		<button type="submit" class="btn btn-light my-2">
			<a class="text-decoration-none" href="home">Home</a>
		</button>
	</div>

</body>
</html>