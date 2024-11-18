<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Application Form</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	rel="stylesheet">
<style>
body {
	background: linear-gradient(to right, #6a11cb, #2575fc);
	height: 100vh;
	display: flex;
	justify-content: center;
	align-items: center;
	animation: fadeIn 1s;
}

.form-container {
	background: white;
	border-radius: 10px;
	padding: 2rem;
	box-shadow: 0 10px 20px rgba(0, 0, 0, 0.2);
	width: 400px;
	opacity: 0;
	transform: translateY(-20px);
	animation: slideIn 0.5s forwards;
	animation-delay: 0.5s;
}

.form-title {
	margin-bottom: 1.5rem;
	font-size: 1.8rem;
	color: #343a40;
	text-align: center;
}

.btn-custom {
	background-color: #007bff;
	color: white;
}

.btn-custom:hover {
	background-color: #0056b3;
}

@
keyframes fadeIn {from { opacity:0;
	
}

to {
	opacity: 1;
}

}
@
keyframes slideIn {from { opacity:0;
	transform: translateY(-20px);
}

to {
	opacity: 1;
	transform: translateY(0);
}
}
</style>
</head>
<body>
	<div class="form-container">
		<h1 class="form-title">Application Form</h1>
		<form action="jdbcServlet" method="post">



			<div class="form-group">
				<input type="text" class="form-control" id="name"
					placeholder="Enter Your Name" name="name" required>
			</div>
			<div class="form-group">
				<input type="email" class="form-control" id="email"
					placeholder="Enter Your Email" name="email" required>
			</div>
			<div class="form-group">
				<input type="tel" class="form-control" id="phone"
					placeholder="Enter Your Phone No" name="phone" required>
			</div>
			<div class="form-group">
				<input type="text" class="form-control" id="address"
					placeholder="Enter Your Address" name="address" required>
			</div>
			<div class="form-group">
				<input type="text" class="form-control" id="pincode"
					placeholder="Enter Your Pincode" name="pincode" required>
			</div>
			<button type="submit" class="btn btn-custom btn-block">Apply</button>
		</form>
	</div>

</body>
</html>