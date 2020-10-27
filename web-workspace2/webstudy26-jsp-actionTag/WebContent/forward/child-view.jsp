<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Child View</title>

</head>
<body
	style="background-image: linear-gradient(to right, rgba(255, 0, 0, 0), rgba(255, 0, 0, 1));">
	<span><%=request.getParameter("age")%>세 <%=request.getParameter("name")%>님
		미성년 페이지입니다.</span><br>
	<%=request.getParameter("command")%><br>
	<%
	//jsp forward param 한글 정보를 받기 위해 한글처리(디코딩)가 필요
	String info = URLDecoder.decode(request.getParameter("info"),"utf-8");
	%>
	<%=request.getParameter("info")%><br>
	<%=info %>

	<a href="forward-form.jsp">입장페이지로</a>
</body>
</html>