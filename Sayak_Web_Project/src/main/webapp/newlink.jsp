<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
      
<title>HELLO WORLD</title>
</head>
<body>
	<form action="DeleteServlet" method="post">
		<table>
			<tr>
				<td>
					<input type="text" name="email" placeholder="Enter the valid email">
				</td>
			</tr>
			<tr>
				<td>
					<input type="submit" value="Delete">
				</td>
			</tr>
		</table>
	</form>
	<div>
		<form action="loginServlet" method="post">
		<table>
			<tr>
				<td>
					<input type="email" name="email" placeholder="Enter the valid email">
				</td>
				<td>
					<input type="password" name="password" placeholder="Enter your password">
				</td>
			</tr>
			<tr>
				<td>
					<input type="submit" value="login">
				</td>
				<td>
					<input type="submit" value="forgot password">
				</td>
			</tr>
		</table>
	</form>
	</div>
</body>
</html>