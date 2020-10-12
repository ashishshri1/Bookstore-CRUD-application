<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<jsp:directive.include file="bootstrap.jsp" />
<title>User Signup</title>
</head>
<body>
	<div style="text-align: center; width: 100%">
		<h3>
			<c:out value="${message}"/>
		</h3>
		<br>
		<form action="index.jsp" method="post">
			<button type="submit" class="btn btn-success" style="width: 200px;">Back</button>
		</form>
	</div>
	<jsp:directive.include file="footer.jsp" />
</body>
</html>