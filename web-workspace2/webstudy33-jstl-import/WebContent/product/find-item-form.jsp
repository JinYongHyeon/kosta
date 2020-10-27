<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%--
	FindItemController 
		   |
	    forward
		   | 
   find-item-result.jsp 에서 == 머머 아이디 상품 : 진로
 --%>
<form action="${pageContext.request.contextPath}/front" >
	<input type="hidden" name="command" value="FindItem">
	<span>상품아이디</span><input type="text" name="productId">
	<input type="submit" value="검색">
</form>
</body>
</html>