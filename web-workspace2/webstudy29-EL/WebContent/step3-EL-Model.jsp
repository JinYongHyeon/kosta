<%@page import="org.kosta.model.TestVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>step3-EL-Model</title>
<style>
span {
	background-image: linear-gradient(90deg, red, orange, yellow, green, blue, navy, purple);
	-webkit-background-clip: text;
	color: transparent;
	font-size: 40px;
	font-weight: bold;
}
</style>
</head>
<body>
	<%-- Scope 부분을 스킵을 할 경우 name이 동일 할 때 범위가 작은 것으로 사용한다. 
	 requestScope > sessionScope
--%>
	<%
		TestVO vo = new TestVO();
	request.setAttribute("tvo", vo);
	%>
	<ol>
		<li>TestVO의 name을 출력 : ${requestScope.tvo.name } or ${tvo.name} <%-- 
				EL에서 Model에 접근 가능한 메서드는 get계열과 is계열 메서드만 가능 is계열 메서드는 리턴타입이 boolean일때 사용
				${requestScope.tvo.nick}
			 --%>
		</li>
		<li>TestVO의 message를 출력 : ${requestScope.tvo.message}</li>
		<li>TestVO의 exist를 출력 : ${requestScope.tvo.exist}</li>
		<li>TestVO의 exist 비교연산 가능 : ${requestScope.tvo.exist==false}</li>
		<li>TestVO의 money : ${requestScope.tvo.money}</li>
		<li>TestVO의 money 연산 : ${requestScope.tvo.money*4}</li>
		<li>TestVO의 money 비교연산 : ${requestScope.tvo.money>100}</li>
		<li>TestVO의 money 비교연산-2 : ${requestScope.tvo.money>100&&tvo.money<200}</li>
		<li>sessionScope 값 여부 확인 : ${sessionScope.mvo == null} or  ${sessionScope.mvo != null} </li>
	</ol>
	<span>용현아 안녕? 열심히 공부해</span>
</body>
</html>