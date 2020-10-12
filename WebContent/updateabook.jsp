<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Update a book</title>
<meta charset="utf-8">
<jsp:directive.include file="bootstrap.jsp" />
<body>
	<div style="text-align: center; width: 100%">
		<h2>Choose a book to update</h2>
	<form action="/Book-Application-Servlet-JSP/updatingbook" method="post">
		<div class="form-group" style="width:600px;margin-left:340px;">
			<select class="form-control"
				id="sel" name="selectbook">
				<c:forEach var="book" items="${books}">
				<option value="${book.id}"><c:out value="${book.isbn}: ${book.title} by ${book.author} priced at ${book.price}"/> </option>
				</c:forEach>
			</select>
		</div>
		<br>
		<div class="input-group mb-3" style="margin-left:540px;" >
			<input type="number" class="form-control" placeholder="Updated Price"
				aria-label="Updated Price" aria-describedby="basic-addon1" name="updatedPrice">
		</div>
		<br>
			<button type="submit" class="btn btn-success" style="width: 200px;">Update</button>
		</form>
		<br>
		<form action="adminbookcontroller.jsp" method="post">
		<button type="submit" class="btn btn-success" style="width: 200px;">Back</button>
		</form>
	</div>
	<jsp:include page="footer.jsp" />
</body>
</html>