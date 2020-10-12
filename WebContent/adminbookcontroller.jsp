<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<jsp:directive.include file="bootstrap.jsp" />
<title>Admin Portal</title>
<meta charset="ISO-8859-1">
</head>
<body>
	<div style="text-align: center; width: 100%">
	<h2>Admin Portal</h2>
		<br>
		<form action="/Book-Application-Servlet-JSP/showallbooks" method="post">
			<button type="submit" class="btn btn-success" style="width: 500px;">Show all books</button>
		</form>
		<br>
		<form action="addabook.jsp" method="post">
			<button type="submit" class="btn btn-success" style="width: 500px;">Add a book</button>
		</form>
		<br>
		<form action="/Book-Application-Servlet-JSP/deleteabook" method="post">
			<button type="submit" class="btn btn-success" style="width: 500px;">Delete a book</button>
		</form>
		<br>
		<form action="/Book-Application-Servlet-JSP/updateabook" method="post">
			<button type="submit" class="btn btn-success" style="width: 500px;">Update a book</button>
		</form>
		<br>
		<form action="/Book-Application-Servlet-JSP/adminlogout" method="post">
			<button type="submit" class="btn btn-success" style="width: 200px;">Logout</button>
		</form>
	</div>
	<jsp:directive.include file="footer.jsp" />
</body>
</html>