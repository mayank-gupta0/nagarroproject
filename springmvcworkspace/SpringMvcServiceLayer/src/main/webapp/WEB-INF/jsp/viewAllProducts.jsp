<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
int r;
%>
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
	<div class="text-center  bg-info">
		<h1>All Products</h1>
	</div>


	<table class="table table-hover">

		<thead class="thead-dark">

			<tr>
				<th scope="col">Name</th>
				<th scope="col">Description</th>
				<th scope="col">Price</th>
				<th scope="col">Brand</th>
				<th scope="col">Product Code</th>
				<th scope="col">Location</th>
				<th scope="col">Deliverable OR NOT</th>

			</tr>

		</thead>

		<tbody>
			<c:forEach var="get" items="${data}">
				<tr>
					<td>${get.productName}</td>
					<td>${get.productDescription}</td>
					<td>${get.productPrice}</td>
					<td>${get.productBrand}</td>
					<td>${get.productCode}</td>
					<td>${get.productLocation}</td>
					<%-- <c:url var="myurl"
						value="http://localhost:8080/SpringMvcServiceLayer/checkingdelivery">
						<c:param name="q" value="${get.productCode}"></c:param>
					</c:url> --%>
					<td><a href="checkingdelivery">Check Product is
							deliverable or not by enter pincode </a></td>

				</tr>
			</c:forEach>
		</tbody>
	</table>

	<div>
		<div class="container w-25 p-3">
			<form action="viewSimilarProducts" method="get">

				<div class="form-group">
					<label for="search">Search</label> <input type="text"
						class="form-control" placeholder="Enter product name" name="value" required>
				</div>
				<button type="submit" class="btn btn-success my-3">Search</button>

			</form>
		</div>
	</div>


</body>
</html>