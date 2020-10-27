<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>아이디 검색 폼</title>
</head>
<%--
	FindProductByIdServlet < -- > ProductDAO.findProductById(id) : ProductVO
	         |
        find_ok.jsp(true) or find_fail.jsp(false)
        table로 상품정보제공
 --%>
<body>
	<form action="FindProductByIdServlet" method="get">
		<span>상품 아이디 </span><input type="text" name="productId" required="required" placeholder="아이디를 입력하세요">
		<input type="submit" value="검색">
	</form>
</body>
</html>