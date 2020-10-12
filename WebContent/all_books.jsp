<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Book list</title>
<meta charset="utf-8">
<jsp:directive.include file="bootstrap.jsp" />
<body>
<div style="text-align: center; width: 100%">
		<h2>Books Data</h2>
	</div>
	<table border="1" class="table table-dark">
		<thead class="thead-dark">
			<tr>
				<th scope="col">ISBN</th>
				<th scope="col">Title</th>
				<th scope="col">Author</th>
				<th scope="col">Publishing Date</th>
				<th scope="col">Price</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="book" items="${books}">
				<tr>
					<td hidden="true" scope="row"><c:out value="${book.id}" /></td>
					<td><c:out value="${book.isbn}" /></td>
					<td><c:out value="${book.title}" /></td>
					<td><c:out value="${book.author}" /></td>
					<td><c:out value="${book.pubDate}" /></td>
					<td><c:out value="${book.price}" /></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<div style="text-align: center; width: 100%">
	<form action="/Book-Application-Servlet-JSP/logout" method="post">
			<button type="submit" class="btn btn-success" style="width: 200px;">Logout</button>
	</form>
	</div>
	<jsp:include page="footer.jsp"/>
</body>
</html>