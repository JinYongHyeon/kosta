<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ㅎㅅㅎ Model2 MVC 상품관리</title>
<style>
ul{list-style: none; position: absolute; top:50%; left:50%; transform:translate(-50%,-50%)}
a{text-decoration: none; font-size:100px;}
</style>
</head>
<body>
<!-- 
	index.jsp -- request -- ProductTotalCountServlet < -- > ProductDAO
									 |
						     forward 방식으로 이동
									 |
						    product-totalcount.jsp
 -->
<ul>
	<li><a href="ProductTotalCountServlet">전체상품수 조회</a></li>
	<li><a href="find-product.jsp">아이디로 상품검색</a></li>
	<!-- 전체 상품을 검색해서 product-list.jsp에서 상품목록을 보여준다.(아이디와,상품명만 보여준다) -->
	<li><a href="ProductListServlet">상품리스트 보기</a></li>
</ul>
</body>
</html>