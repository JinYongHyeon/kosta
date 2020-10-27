<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>차검색</title>
</head>
<body>
<%-- 
	controller.SelectCarByIdServlet 
	MockDAO의 selectCarById() 와 연동해서 차정보가 존재하면 selectcar-ok.jsp 에서 차정보를 아이디,차주명,모델명, 주소를 제공
 	존재하지 않으면 select-fail.jsp 에서 차량정보가 존재하지 않습니다.
 --%>
<form action="front" method="get">
	<input type="hidden" name="command" value="selectCar">
	<span>아이디 </span> <input type="number" name="carId" required="required">
	<input type="submit" value="car정보검색">
</form>
</body>
</html>