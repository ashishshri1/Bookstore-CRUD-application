<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<jsp:directive.include file="bootstrap.jsp" />
<title>Add a book</title>
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" href="/resources/demos/style.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script>
	$(function() {
		$("#datepicker").datepicker({
			changeMonth : true,
			changeYear : true
		});
	});
</script>
</head>
<body>
	<div style="text-align: center; width: 100%">
		<h2>Add a book</h2>
	</div>
	<form action="/Book-Application-Servlet-JSP/addingbook" method="POST"
		style="margin-left: 540px">
		<div class="input-group mb-3">
			<input type="text" class="form-control" placeholder="ISBN"
				aria-label="ISBN" aria-describedby="basic-addon1" name="isbn">
		</div>
		<br>
		<div class="input-group mb-3">
			<input type="text" class="form-control" placeholder="Title"
				aria-label="Title" aria-describedby="basic-addon1" name="title">
		</div>
		<br>
		<div class="input-group mb-3">
			<input type="text" class="form-control" placeholder="Author"
				aria-label="Author" aria-describedby="basic-addon1" name="author">
		</div>
		<br>
		<div class="input-group mb-3">
			<input type="text" class="form-control" placeholder="Publishing Date"
				aria-label="Publishing Date" aria-describedby="basic-addon1"
				name="pubDate" id="datepicker">
		</div>
		<br>
		<div class="input-group mb-3">
			<input type="number" class="form-control" placeholder="Price"
				aria-label="Price" aria-describedby="basic-addon1" name="price">
		</div>
		<br>
		<button type="submit" class="btn btn-success" style="width: 200px;">Add</button>
	</form>
	<br>
	<form action="adminbookcontroller.jsp" method="post"
		style="margin-left: 540px">
		<button type="submit" class="btn btn-success" style="width: 200px;">Back</button>
	</form>
	<jsp:directive.include file="footer.jsp" />
</body>
</html>