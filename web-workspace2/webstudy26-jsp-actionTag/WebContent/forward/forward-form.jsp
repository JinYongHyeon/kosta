<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Jsp Forwar actionTag 연습</title>
</head>
<body>
<%	request.setCharacterEncoding("utf-8"); %>
<%-- 
			forward-form.jsp  -- forward-action.jsp
						     홍길동님 23세 성인입니다.
  				만약 19세 미만이면 jsp forward action tag를 이용해
	     				 child-view.jsp에서 응답하게 한다.
--%>
<form action="forward-action.jsp" method="post">
	<span>이름</span><input type="text" name="name" required="required" placeholder="이름을 입력하세요">
	<span>나이</span><input type="number" name="age" required="required" placeholder="나이을 입력하세요">
	<input type="submit" value="입장">
</form>
</body>
</html>