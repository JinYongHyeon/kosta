<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 등록</title>
</head>
<body>
<%--
	register-form -- command=registerproduct --> RegisterProductController -- ProductDAO().registerProduct(ProductVO)
							 |
							 | -- (redirect)
							 |
				 register-product-result.jsp

 --%>
	<form action="front" method="post">
		<input type="hidden" name="command" value="registerproduct">
		<span>상품명</span><input type="text" name="productName" required="required" placeholder="상품명을 입력해주세요"> 
		<span>제조사</span><input type="text" name="productMaker" required="required" placeholder="제조사을 입력해주세요"> 
		<span>가격</span><input type="number" name="productPrice" required="required" placeholder="가격을 입력해주세요"> 
		<input type="submit" value="등록">
	</form>
</body>
</html>