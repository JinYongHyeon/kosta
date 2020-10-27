<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>line test</title>
</head>
<body>
<%-- 
	 query string 방식 : 서버url?name=value&name=value 같이 전송하면 Servlet과 jsp에서
						request.getParameter(name)으로 반환받으면 된다.
 --%>
<a href="step1-link-action.jsp?command=find&no=123">첫번쨰 링크</a>
<a href="step1-link-action.jsp?command=update&no=1234">두번쨰 링크</a>
</body>
</html>