<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<jsp:directive.include file="bootstrap.jsp" />
<title>Book Application</title>
<meta charset="ISO-8859-1">
</head>
<body>
	<div style="text-align: center; width: 100%">
		<br>
		<form action="usersignup.jsp" method="post">
			<button type="submit" class="btn btn-success" style="width: 500px;">User
				Signup</button>
		</form>
		<br>
		<form action="userlogin.jsp" method="post">
			<button type="submit" class="btn btn-success" style="width: 500px;">User
				Login</button>
		</form>
		<br>
		<form action="adminlogin.jsp" method="post">
			<button type="submit" class="btn btn-success" style="width: 500px;">Admin
				Login</button>
		</form>
	</div>
	<jsp:directive.include file="footer.jsp" />
</body>
</html>