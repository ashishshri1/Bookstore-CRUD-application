<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<jsp:directive.include file="bootstrap.jsp" />
<title>User Login</title>
</head>
<body>
	<div style="text-align: center; width: 100%">
		<h2>User Login</h2>
	</div>
	<form action="/Book-Application-Servlet-JSP/login" method="POST" style="margin-left:540px">
		<div class="input-group mb-3">
			<input type="text" class="form-control" placeholder="Username"
				aria-label="Username" aria-describedby="basic-addon1" name="username">
		</div>
		<br>
		<div class="input-group mb-3">
			<input type="password" class="form-control" placeholder="Password"
				aria-label="Password" aria-describedby="basic-addon1" name="password">
		</div>
		<br>
		<button type="submit" class="btn btn-success" style="width: 200px;">Login</button>
	</form>
	<jsp:directive.include file="footer.jsp" />
</body>
</html>