<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
    <%-- JSTL 선언부 taglib JSTL 선언하고 prefix JSTL c라고 사용한다.--%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>JSTL step1-if</title>
</head>
<body>
<c:if test="true">
	true이므로 실행한다.
</c:if>
<c:if test="false">
 false이므로 실행안됨
</c:if>
<hr>
<a href="step1-if.jsp?age=30&nick=홍길동">step1을 다시 호출</a><br><br>
이름 : ${param.nick}<br>
나이 : ${param.age}

<c:if test="${param.age>20 && param.nick=='홍길동'}">
	나이가 20세를 초과함 , 닉네임은 홍길동입니다.
</c:if>

</body>
</html>