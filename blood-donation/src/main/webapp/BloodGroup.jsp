<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
	<!-- As a heading -->
	<nav class="navbar navbar-dark bg-dark">
		<div class="container-fluid">
			<span class="navbar-brand mb-0 h1">X-workz</span>
		</div>
	</nav>

	<h1>Blood Donation Form</h1>

	<c:forEach items="${errors}" var="error">
		<span style="color: red;">${error.defaultMessage } </span>
		</br>
	</c:forEach>

	<span style="color: green;">${successMsg}</span>
<center>
	<form action="donate" method="post">
	<pre>
	Person Name <input type="text" name="personName" /> <br>
	BloodGroup <select name="group"> 	
	<option>A+</option>
	<option>B+</option>
	<option>AB+</option>
	<option>O+</option>
	<option>A+</option>
	<option>O-</option>
	</select> <br>
	Age <input type="number" name="age" /> <br>
	Address <textarea rows="3" cols="30" name="address"></textarea> <br>
	Weight <input type="text" name="weight" />  <br>
	<input type="submit" value="Save" />  <br>
	</pre>
	</form>
	</center>
</body>
</html>