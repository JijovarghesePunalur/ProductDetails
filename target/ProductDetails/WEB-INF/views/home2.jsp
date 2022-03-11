<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>User management</h1>

	<table>
		<c:forEach var="user" items="${users}">
			<tr>
				<td><c:out value="${user.productname}" /></td>
				<td><c:out value="${user.productprice}" /></td>
				<td><c:out value="${user.currency}" /></td>
				<td><a href="<c:url value="/delete/${user.id}"/>">Delete
						user</a></td>
				<td><a href="">Update user</a></td>
				<form action="" method="post" id="myForm">
					<td>Product Name: <input type="text" name="username" /></td>
					<td>Price : <input type="text" name="country" /></td>
					<td>Currency : <input id="url" type="text" name="Url" /></td>

				<button onclick="doStuff();">Submit</button>
				</form>
			</tr>
		</c:forEach>
		<c:if test="${empty users}">
			no users added yet.
		</c:if>
	</table>

	<a href="<c:url value="/add1"/>">Add new user</a>
</body>
</html>
