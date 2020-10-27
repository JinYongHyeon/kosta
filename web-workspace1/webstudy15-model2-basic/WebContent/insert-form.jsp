<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>redirect방식 테스트</title>
</head>
<body>
<%-- 						Controller
	insert_form.jsp --request -- InsertServlet < --- >  Model
 									  |
 									  | -- (redirect 방식)
								    View
									  |  
	             <---- response isnert_result.jsp
 --%>
</body>
<form action="InsertServlet" method="post">
	<span>고객정보</span><input type="text" name="customerInfo">
	<input type="submit" value="등록(redirectTest)">
</form>
</html>