<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>삭제폼</title>
</head>
<%--
	HandlerMapping에서 else if 추가
	DelectCarController 정의
	delete-car-result.jsp로 리다이렉트 한다.
 --%>
<body>
	<form action="front">
		<input type="hidden" name="command" value="deleteCar">
		<span>아이디 </span><input type="number" name="id">
		<input type="submit" value="삭제">
	</form>
</body>
</html>