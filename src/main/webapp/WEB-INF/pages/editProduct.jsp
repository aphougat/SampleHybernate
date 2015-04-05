<%@ page language="java" pageEncoding="utf-8" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
			<td>Register</td>

		</tr>
		<form:form id="registeredForm" action="/save" method="post" modelAttribute="product">

		<tr
				style="background-color: white; color: black; text-align: center;"
				height="30px">

			<td><form:input path="code" />
			</td>
			<td><form:input path="name" />
			</td>
			<td><form:input path="des" />
			</td>
			<td><input type="submit" value="Save"></td>

		</tr>

		</form:form>
		<a href="form">Click Here to add new User</a>
		</center>
</body>
</html>