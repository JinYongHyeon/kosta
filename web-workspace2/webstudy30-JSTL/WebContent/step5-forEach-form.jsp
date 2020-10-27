<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>step5-forEach-form.jsp</title>
</head>
<body>
<form action="step5-forEach-action.jsp" method="post">
	주문자 <input type="text" name="customerName"><br>
	<input type="checkbox" name="menu" value="전어">전어<br>
	<input type="checkbox" name="menu" value="소주">소주<br>
	<input type="checkbox" name="menu" value="맥주">맥주<br>
	<input type="submit" value="ㅇㅅㅇ">
</form>
<%-- 
	주문자명 : 홍길동
	주문항목
	1. 전어
	2. 맥주
 --%>
</body>
</html>