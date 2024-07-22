<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Hello World!</title>
	</head>
	<body>
		<h1>Greetings!</h1>
		<hr><br>
		<marquee>
			<h1 style='color:Red;'>Hello World!</h1>
		</marquee>
		<br><br><br>
		<form action="greet.jsp">
			<label>Username: </label>
			<input type="text" name="username" id="username">
			<br><br>
			<label>Password: </label>
			<input type="password" name="password" id="password">
			<br><br>
			<br><br>
			<input type="submit" value=" Submit ">			
			
		</form>
	</body>
</html>