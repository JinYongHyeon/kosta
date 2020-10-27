<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% String id = request.getParameter("id"); %>
	<h1>당신의 아이디는 <%=id %>입니다.</h1>
	<a href="step8.jsp">폼</a>
</body>
</html>