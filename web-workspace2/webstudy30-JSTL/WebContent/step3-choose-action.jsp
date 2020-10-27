<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
</head>
<body>
<c:choose>
	<c:when test="${param.userAge>=19 }">
		${param.userName} 님 ${param.userAge }세 성인입니다.
	</c:when>
		<c:when test="${param.userAge>=13 }">
		${param.userName} 님 ${param.userAge }세 청소년입니다.
	</c:when>
		<c:when test="${param.userAge>=1 && param.userAge<13}">
		${param.userName} 님 ${param.userAge }세 어린이입니다.
	</c:when>
	<c:otherwise>
		${param.userName }님 사람이 아니므이다.
	</c:otherwise>
</c:choose>
</body>	
</html>