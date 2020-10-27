<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>step7-form</title>
</head>
<body>
<%--
	홍길동 이름 입력하고 88점 점수 입력하면
	( 100 ~ 90 이상 : 홍길동님 A학점
	  90미만 ~ 80이상 : 홍길동님 B학점
	  80미만 ~ 70이상 : 홍길동님 C학점
	  70미만 : 홍길동님 F학점 --> alert 후 step7-F.jsp로 이동시킨다.
	)
 --%>
<form action="step7-grade.jsp">
	<span>이름</span><input type="text" name="studentName" required="required">
	<span>점수</span><input type="number" name="studentScore" min=0 max=100>
	<input type="submit" value="학점확인">
</form>
</body>
</html>