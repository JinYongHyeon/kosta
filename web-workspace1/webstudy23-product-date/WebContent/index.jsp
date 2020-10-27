<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Main</title>
<link rel="stylesheet" type="text/css" href="css/mystyle.css">
</head> 
<body>
<div class="container">
	<a href="index.jsp">HOME</a>
	<a href="register-form.jsp">상품등록</a>
	<%--  index 링크 --command=list --> ProductListController  <---> PorductDAO().list():ArrayList<ProductVO>
							|
							|--(forward)
							|
					product-list.jsp
			아이디 상품명 등록시간 테이블로 제공
		
	--%>
	<a href="front?command=list">상품 리스트</a>
</div>
</body>
</html>