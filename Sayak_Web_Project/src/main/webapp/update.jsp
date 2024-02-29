<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Data Update</title>
</head>
<body>
	<form action="UpdateServlet" method="post">
		<table border="1">
			
			<tr>
				<th>Email Address:</th>
				<td><input type="email" name="email" placeholder="Enter your existing email" id="inpt2"></td>
			</tr>
			<tr>
				<th>Contact Number:</th>
				<td><input type="text" name="phone" placeholder="Enter your new phone number" style="color: red; font-size: 20px; 	font-weight: bold;"></td>
			</tr>
			<tr>
				<th><input type="submit" value="Submit" name="submit"></th>
				<th><input type="reset" value="Reset"></th>
			</tr>
		</table>
	</form>
</body>
</html>