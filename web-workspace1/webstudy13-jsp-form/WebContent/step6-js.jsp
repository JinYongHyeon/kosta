<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>step6-js.jsp</title>
</head>
<%--
	step6-action.jsp 에서는 19세를 초과할 떄
	홍길동님 즐거운 성인영화 관람하세요!
	19세 이하이면
	홍길동님 나이 더 먹고 오세요.
 --%>
<body>
	<form action="step6-action.jsp">
		<span>이름</span><input type="text" name="userName" required="required">
		<span>나이</span><input type="number" name="userAge"  min="1" max="150"  required="required"> 
		<input type="submit" value="관람하기">
	</form>
</body>
</html>