<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 등록</title>
<link rel="stylesheet" type="text/css" href="css/mystyle.css">
</head>
<body>
	<div class="container">
		<a href="index.jsp">HOME</a> 
		<a href="">상품목록</a>
			<a href="front?command=list">상품 리스트</a>
		<hr>
		<form action="front" method="post">
			<input type="hidden" name="command" value="register">
			<span>상품명</span><input type="text" name="name" required="required" placeholder="상품명을 입력하세요">
			<span>제조사</span><input type="text" name="maker" required="required" placeholder="제조사을 입력하세요">
			<span>가격</span><input type="number" name="price" required="required" placeholder="가격을 입력하세요">
			<input type="submit" value="등록">						
		</form>
		<%--
			register-form.jsp -- command:register --> RegisterProductController <--> ProductDAO().register(ProductVO)
										|
										| -- (redirect)
										|
								register-result.jsp
		 --%>
	</div>
</body>
</html>