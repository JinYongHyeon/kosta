<%@page import="org.kosta.model.PersonVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	PersonVO vo = new PersonVO("손흥민",23);
	request.setAttribute("pvo", vo);

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>JSTL 다중조건(choose,when,otherwise)</title>
</head>
<body>
<h1>EL로 NAME과 AGE를 출력</h1>
이름 : ${requestScope.pvo.name}<br>
나이 : ${pvo.age}세
<hr>
<h1>JSTL 다중조건 choose , when , otherwise[else] </h1>
<%--  eq : 문자열 또는 숫자가 같으면 참입니다. null 또는 빈 문자열 인지도 확인할 수 있습니다. or  == 같은거임 --%>
<c:choose>
	<%-- 
		when = if or else if 역할
	 --%>
	<c:when test="${pvo.name eq '홍길동'}">
		홍길동입니다.
	</c:when>
	<c:when test="${pvo.name eq '손흥민'}">
		토트넘 손흥민 입니다.
	</c:when>
	<c:otherwise>
	<%--  otherwise = else 역할 --%>
		홍길동 아님
	</c:otherwise>
</c:choose>
</body>
</html>