<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Employee Application Form</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<style>
body {
	background-color: #f8f9fa;
}

.form-container {
	background: linear-gradient(135deg, #f06, #4a90e2);
	border-radius: 10px;
	padding: 30px;
	box-shadow: 0 4px 20px rgba(0, 0, 0, 0.1);
	color: white;
}

.form-group label {
	color: white;
}

.btn-custom {
	background-color: #28a745;
	color: white;
}
</style>
</head>
<body>
	<div class="container mt-5">
		<div class="form-container">
			<h2 class="text-center">Employee Application Form</h2>

			<form action="verify" method="post">

				<div class="form-group">
					<input type="text" class="form-control"
						placeholder="Enter your Name" name="userName" required>
				</div>
				<div class="form-group">
					<input type="text" class="form-control"
						placeholder="Enter your number" name="phone" required>
				</div>
				<div class="form-group">
					<input type="email" class="form-control"
						placeholder="Enter your email" name="email" required>
				</div>
				<div class="form-group">
					<input type="text" class="form-control"
						placeholder="Enter your experience" name="exp" required>
				</div>
				<div class="form-group">
					<select class="form-control" name="dep" id="dep" required>
						<option value="" disabled selected>SELECT</option>
						<option value="HR">HR</option>
						<option value="IT">IT</option>
						<option value="Sales">Sales</option>
						<option value="Finance">Finance</option>
						<option value="Marketing">Marketing</option>
					</select>
				</div>
				<div class="form-group">
					<input type="number" class="form-control"
						placeholder="Enter your age" name="age" required>
				</div>
				<button type="submit" class="btn btn-custom btn-block">Submit</button>
			</form>
		</div>
	</div>
</body>
</html>