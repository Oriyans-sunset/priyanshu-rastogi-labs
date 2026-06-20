<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c"%>

<html>
<head>

</head>

<body>

	<h1>Employee List</h1>
	
	<table>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Salary</th>
		</tr>
		<c:forEach items="${employees}" var="emp">

			<tr>
				<td>${emp.id}</td>
				<td>${emp.name}</td>
				<td>${emp.salary}</td>
			</tr>

		</c:forEach>

	</table>
<h3>Find Employee by ID</h3>
	<form action="${pageContext.request.contextPath}/employees/find"
		method="get">
		ID: <input type="number" name="id" required /> <input type="submit"
			value="Find" />
	</form>

	<c:if test="${not empty foundEmployee}">
		<p>Found: ID=${foundEmployee.id}, Name=${foundEmployee.name},
			Salary=${foundEmployee.salary}</p>
	</c:if>
	<c:if test="${not empty notFound}">
		<p>${notFound}</p>
	</c:if>

</body>
</html>