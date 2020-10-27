<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>JSTL FORM</title>
</head>
<body>
	<form action="step3-choose-action.jsp">
		이름<input type="text" name="userName" required="required" placeholder="go Home Please....."><br>
		나이<input type="number" name="userAge" required="required" placeholder="go Home Please....."><br>
		<input type="submit" value="ㅇㅅㅇ">
	</form>
<%--
		step3-choose-action.jsp 
		19세 이상이면 홍길동님 28세 성인입니다. 
		13세 이상이면 홍길동님 15세 청소년입니다.
		1~13세 미만이면 홍길동님 7세 어린이입니다.
		0세 이하이면 홍길동님 사람이 아닙니다.
 --%>
</body>
</html>
