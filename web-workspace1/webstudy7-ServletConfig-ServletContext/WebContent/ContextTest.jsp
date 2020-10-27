<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ServletContext Test</title>
</head>
<body>
<h1> 
contextTest.jsp
<br>ServletContext에서 dbUrl 받아옴 : <%=application.getInitParameter("dbUrl") %><br>
<br>
<br>
ServletContext로부터 One 서블릿이 할당한 nick을 반환 : 
<%=application.getAttribute("nick") %><br>
<a href="One">One Servlet으로 이동</a><br>
<a href="Two">Two Servlet으로 이동</a>
</h1>
</body>
</html>