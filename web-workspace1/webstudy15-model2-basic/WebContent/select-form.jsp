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
	client에서 요청하면 Controller(Servlet)이 적절한 view를 선택해 응답하게 한다.
	select-form.jsp --> request --> SelectServlet
										 |
									 forward방식 이동
									     |
							      select_result.jsp로 응답
						<-------response | 
										  
 --%>
 <form action="SelectServlet" method="get">
 	<input type="text" name="userId" required="required">
 	<input type="submit" value="전송">
 </form>
</body>
</html>