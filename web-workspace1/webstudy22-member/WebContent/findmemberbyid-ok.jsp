<%@page import="org.kosta.model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보</title>
</head>
<body>
<% MemberVO vo =(MemberVO)request.getAttribute("vo"); %>
<h1>***회원정보***</h1>
<h1>아이디 : <%=vo.getId() %></h1>
<h1>이름 : <%=vo.getName() %></h1>
<h1>주소 : <%=vo.getAddress() %></h1>
</body>
</html>