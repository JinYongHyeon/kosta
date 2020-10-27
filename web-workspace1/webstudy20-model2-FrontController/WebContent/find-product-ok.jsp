<%@page import="org.kosta.model.ProductVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품정보</title>
</head>
<body>
<% ProductVO vo = (ProductVO)request.getAttribute("vo"); %>
<h1>***검색 결과***</h1>
<h1>아이디  : <%=vo.getId() %></h1>
<h1>상품명  : <%=vo.getName() %></h1>
<h1>제조사  : <%=vo.getMaker() %></h1>
<h1>가격 : <%=vo.getPrice() %></h1>
</body>
</html>