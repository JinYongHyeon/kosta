<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>접속수 출력</title>
</head>
<body>
<%! int count; %>
<%--<%= %> : out.print(++count)와 동일 --%>
<h3>접속 수 : 
<%=++count %>
</h3> 
</body>
</html>