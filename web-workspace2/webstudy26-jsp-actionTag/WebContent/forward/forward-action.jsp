<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>forward Action</title>
</head>
<body>
	<%
	request.setCharacterEncoding("utf-8");
	String name = request.getParameter("name");
	int age = Integer.parseInt(request.getParameter("age"));

	if (age >= 19) {
	%>
	<%=name%>님은
	<%=age%>세 입니다. [성인]
	<%
		} else {
		//jsp forward 액션태그에서 param 으로 한글을 전송하기 위해서는 한글 인코딩이 별도로 필요하다.
		String info = URLEncoder.encode("테스트","UTF-8");
	%>
	<jsp:forward page="child-view.jsp">
		<jsp:param value="list" name="command" />
		<jsp:param value="<%=info %>" name="info" />
	</jsp:forward>
	<%
		}
	%>
</body>
</html>