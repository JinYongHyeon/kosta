<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Bootstrap grid test연습</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<%--grid 그리드는 페이지 레이아웃 --%>
	<%--bootstrap의 container class 활용해본다 
		container는 고정 너비 레이아웃
		container-fluid 는 전체 너비 레이아웃
	--%>
	<div class="container-fluid">
		<h2>부트스트랩 테스트</h2>
	</div>
	<!-- row(행) 가로 
		 col(열) 세로 
	 해석 : div row 영역안에 col 그리드 배치 부트스트랩 미디어쿼리로 일정 사이즈가 지나면 모바일 row: 수평의 컬럼 모음 만들기 위한거
	 	    보기 편하게 만듬
	 -->
	<div>
		<%--
		col-sm-* : 768px 이상이면 반영(테블릿 화면 사이즈 이상이면 적용)
	 --%>
		<div class="col-sm-4 col-lg-6" style="background-color: lavender;">.col-sm-4</div>
		<div class="col-sm-4 col-lg-6" style="background-color: lavender;">.col-sm-4</div>
		<div class="col-sm-4 col-lg-6" style="background-color: lavender;">.col-sm-4</div>
		<div class="col-sm-8 col-lg-6" style="background-color: red;">.col-sm-4</div>
		<!-- <div class="col-sm-4" style="background-color: lavender;">.col-sm-4</div> -->
	</div>
</body>
</html>