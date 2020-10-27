<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% request.setCharacterEncoding("utf-8");  %>
	<h1><%= request.getParameter("userName") %>에 사는 
	<%= request.getParameter("userAddr") %>님 등록되었습니다.</h1>
	<a href="step9.jsp">등록화면</a>
</body>
</html>