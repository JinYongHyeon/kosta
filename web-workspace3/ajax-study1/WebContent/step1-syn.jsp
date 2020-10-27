<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>동기적 방식 통신 테스트</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/SynServlet" method="get">
	<input type="text" name="userInfo" required="required">
	<input type="submit" value="동기적방식테스트">
</form>
<hr>
<form>
	<textarea rows="40" cols="100"></textarea>
</form>
</body>
</html>