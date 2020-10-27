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
<title>Bootstrap offset 기능</title>
</head>
<body>
	<div class="container-fluid">
		<h3>offset test : .col-sm-offset-* 클래스를 사용하면 * 열만큼 오른쪽으로 이동</h3>
		<h2>offset test</h2>
		<div class="row">
			<div class="col-sm-5" style="background-color: #f00fff;">.col-sm-5</div>
			<div class="col-sm-5 col-sm-offset-2"
				style="background-color: yellow">.col-sm-5-offset-2</div>

		</div>
		<div class="row" style="background-color: #f0f0f0;">
			<%-- 3만큼 오른쪽으로 이동 --%>
			<div class="col-sm-9 col-sm-offset-3"
				style="background-color: #ff0000">.col-sm-9 col-sm-offset-3</div>
		</div>

		<div class="row">
			<div class="col-sm-6 col-sm-offset-3" style="background-color: red;">col-sm-6
				col-sm-offset-6</div>
		</div>

	</div>
</body>
</html>