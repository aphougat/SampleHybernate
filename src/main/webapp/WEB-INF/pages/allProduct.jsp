<%@ page language="java" pageEncoding="utf-8" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<center>
	<h1>Product</h1>
	<table border="1" bgcolor="black" width="600px">
		<tr
				style="background-color: teal; color: white; text-align: center;"
				height="40px">

			<td>Code</td>
			<td>Name</td>
			<td>Description</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
	<c:forEach items="${products}" var="product">
		<tr
				style="background-color: white; color: black; text-align: center;"
				height="30px">

			<td><c:out value="${product.code}" />
			</td>
			<td><c:out value="${product.name}" />
			</td>
			<td><c:out value="${product.des}" />
			</td>
			<td><a href="edit?id=${product.code}">Edit</a></td>
			<td><a href="delete?id=${product.code}">Delete</a></td>
		</tr>
	</c:forEach>
		<a href="form">Click Here to add new Product</a>
		</center>
</body>
</html>