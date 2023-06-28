<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet">
	
<body>
			<nav class="navbar navbar-light" style="background-color: black;">
		<div>
			<img height="50px"
				src="https://img.freepik.com/free-vector/parking_24908-54061.jpg?size=626&ext=jpg&ga=GA1.1.1163619451.1684595486&semt=ais">
		</div>
	</nav>
 		<form action="admin" method="post">
			<div class="form-group">
				<label for="exampleInputEmail1">Email:</label>
				 <input type="email"	name="email" class="form-control"
					placeholder="Enter email" required>
			</div>
			<div class="form-group">
				<label for="exampleInputPassword1">Password:</label> <input type="password"
					name="password" 
					class="form-control" id="exampleInputEmail"
					placeholder="Enter password" required>
			</div>
			<br>
						<button type="submit" class="btn btn-primary button">Login</button>
				
			
			</form>
</body>
</html>