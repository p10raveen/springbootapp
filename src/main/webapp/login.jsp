<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form name="submitform" method="POST">
	<input type="text" name="userName" placeholder="Enter Username">
	<input type="password" name="password" placeholder="Enter Password">
	<input type="submit" value="login">
</form>
<br/>
<span>${error}</span>

</body>
</html>