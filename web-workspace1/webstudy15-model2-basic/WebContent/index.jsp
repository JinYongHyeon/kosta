<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Model2 MVC</title>
<style>
ul {
	list-style: none;
	width: 100%;
	float: left;
	padding-left: 0;
}

ul li {
	width: 250px;
	height: 50px;
	float: left;
	background-color: #f7a37c;
	box-shadow: 2px 2px #000;
	text-align: center;
	margin-right:25px;
}

a {
	color: #fff;
	text-decoration: none;
	line-height: 50px;
}
</style>
</head>
<body>
	<h1>Model2 MVC Basic Test</h1>
	<ul>
		<li><a href="select-form.jsp">forward 방식 테스트1</a></li>
		<li><a href="insert-form.jsp">redirect 방식 테스트1</a></li>
	</ul>
	<hr>
	<img src="Model2-1.png" alt="model2">
	<hr>
	<img src="Model2-2.png" alt="model2">
	<hr>
	<img src="4_forward.png" alt="forward redirect">
</body>
</html>