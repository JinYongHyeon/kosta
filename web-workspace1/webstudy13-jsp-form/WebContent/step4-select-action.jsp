<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	img{width:500px; height: 500px; position:absolute; top:50%; left:50%; transform:translate(-50%,-50%);}
</style>
</head>
<body>
	 <img src="picture/<%=request.getParameter("flower") %>.jpg" alt="라벤더">
</body>
</html>