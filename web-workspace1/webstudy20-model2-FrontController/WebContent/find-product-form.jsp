<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--
 find-product-form.jsp --request -- front(DispatcherServlet) <---> HandlerMapping <---> FindProductByIdController <---> ProductDAO
 										|
 										| -- (forward)
 									find-ok.jsp
 									    or
 									find-fail.jsp
 									
 		command = findproductbyid	
 
 
 --%>
	<form action="front" method="post"> 
		 <input type="hidden" name="command" value="FindProductByIdController">
		 상품아이디<input type="text" name="productId" required="required" placeholder="상품아이디 입력하세요">
		 <input type="submit" value="검색">
	</form>
</body>
</html>