<%@page import="model.CarVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>성공</title>
</head>
<body>
<% CarVO vo = (CarVO)request.getAttribute("vo"); %>
<h1>아이디 : <%=vo.getId() %></h1>
<h1>오너 :<%=vo.getOwner() %></h1>
<h1>모델 :<%=vo.getModel() %></h1>
<h1>주소 :<%=vo.getAddress() %></h1>
</body>
</html>