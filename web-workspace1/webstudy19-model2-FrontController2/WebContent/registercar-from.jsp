<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>차량등록페이지 19project 맞음??</title>
</head>
<body>

<%--
	controller.RegisterCarServlet --> MockDAO.registerCar()
	  				   |
	  				   | -->(redirect 방식으로 이동시킨다.)
	  		car-register-result.jsp
--%>

	<form action="front" method="post">
		<input type="hidden" name="command" value="registerCar">
		<span>아이디</span><input type="text" name="carId"><br>
		<span>차주명</span><input type="text" name="owner"><br>
		<span>모델명</span><input type="text" name="model"><br>
		<span>주소</span><input type="text" name="address"><br>
		<input type="submit" value="등록하기">
	</form>
</body>
</html>