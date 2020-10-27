<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>Bootstrap include</title>
</head>
<style>
.content {
	height: 400px;
	position: relative;
}

.content h1 {
	position: absolute;
	top: 50%;
	left: 50%;
	transform: translate(-50%, -50%);
	
}

footer {
	background-color: #000; color : #fff;
	padding: 15px;
	color: #fff;
}

footer p {
	text-align: center;
	font-size: 36px;
	font-weight: bold;
}
</style>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<div class="content">
		<h1>메인1 화면입니다.</h1>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>

</body>
</html>