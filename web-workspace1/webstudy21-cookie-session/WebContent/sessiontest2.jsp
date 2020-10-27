<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sessiontest2</title>
</head>
<body>
	<h1>sessiontest2 jsp에서 java로 생성될 때 세션이 자동으로 생성되지 않도록 처리</h1>
	<%-- 
	session.getId(); compile error, 위 지시자 태그에서 session="false"를 명시하여 세션을 생성하는 코드가 생성되지 않았으므로
	권장사항 JSP에서 session을 생성을 방지하고 controller에서 session을 생성
	
	jsp에서  session을 자동 생성을 할 경우 비로그인자도 session을 가지고 있어 서버에 부담이 간다.
	session은 controller을 통해 로그인을 한 클라이언트에게 session을 피아식별을 한다. ㅇㅋ.
 	--%>
	<%
		HttpSession session = request.getSession(false);
	if (session == null) {
	%>
	<h1>세션이 없습니다.</h1> <a href="SessionOne">SessionOne</a>
	<%
		} else {
	%>
	<h1>기존 세션이 있습니다.<%=session.getId() %></h1>
	<%
		}
	%>
</body>
</html>