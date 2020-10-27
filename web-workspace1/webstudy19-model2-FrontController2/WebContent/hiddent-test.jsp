<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>html hidden test</title>
</head>
<body>
<form action="hidden-result.jsp">
	<input type="hidden" name="command" value="register">
	<input type="submit" value="test">
</form>
<hr>

<form action="hidden-result.jsp" method="post">
	<input type="hidden" name="command" value="findProductById">
	<input type="submit" value="test2">
</form>
<hr>
<a href="hidden-result.jsp?command=selectCar">link test</a>
</body>
</html>