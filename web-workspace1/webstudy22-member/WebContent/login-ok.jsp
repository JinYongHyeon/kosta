z<%@page import="org.kosta.model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 성공</title>
</head>
<body>
	<%
		HttpSession session = request.getSession(false);

	if (session != null) {
		MemberVO vo = (MemberVO) session.getAttribute("user");
		if (vo != null) {
	%>
	<h1><%=vo.getName()%>님 로그인 하셨습니다.
	</h1>
	<a href="index.jsp">HOME</a>
	<%
		}
	}
	%>
</body>
</html>