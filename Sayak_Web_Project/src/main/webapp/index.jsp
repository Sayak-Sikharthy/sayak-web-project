<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Form</title>

	<!-- External CSS -->
	<link rel="stylesheet" type="text/css" href="css/style.css">

	<!-- Internal CSS -->
	<style type="text/css">
		#inpt2 {
			color: red;
			font-size: 20px;
			font-weight: bold;
		}
	</style>
</head>
<body style="background-color: #e3e3e3;">
	<form action="UserServlet" method="post">
		<table border="1">
			<tr>
				<th>Name:</th>
				<td><input type="text" name="name" placeholder="Enter your name" id="inpt1"></td>
			</tr>
			<tr>
				<th>Email Address:</th>
				<td><input type="email" name="email" placeholder="Enter your email" id="inpt2"></td>
			</tr>
			<tr>
				<th>Contact Number:</th>
				<td><input type="text" name="phone" placeholder="Enter your phone number" style="color: red; font-size: 20px; 	font-weight: bold;"></td>
			</tr>
			<tr>
				<th>City</th>
				<td>
					<select name="city">
						<option value=" ">Choose your city</option>
						<option value="kolkata">Kolkata</option>
						<option value="siliguri">Siliguri</option>
						<option value="durgapur">Durgapur</option>
						<option value="asansol">Asansol</option>
					</select>
				</td>
			</tr>
			<tr>
				<!-- <th>Gender</th> -->
				<th colspan="2">
					<input type="radio" name="gender" value="male">Male
					<input type="radio" name="gender" value="female">Female
					<input type="radio" name="gender" value="other">Other
				</th>
			</tr>
			<tr>
				<th>Password</th>
				<td><input type="password" name="password" placeholder="Enter your password" id="inpt45"></td>
			</tr>
			<tr>
				<th><input type="submit" value="Submit" name="submit"></th>
				<th><input type="reset" value="Reset"></th>
			</tr>
		</table>
	</form>
	
</body>
</html>