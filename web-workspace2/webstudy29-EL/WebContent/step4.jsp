<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>ServletContext initParameter</title>
</head>
<body>
	<%-- ServletContext의 초기파라미터에 접근하여 출력 --%>
	<%=application.getInitParameter("adminEmail") %>
	${initParam.adminEmail}
</body>
</html>