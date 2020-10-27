<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<style type="text/css">
.a {
	background-color: yellow;
}

.b {
	background-color: lime;
}
</style>
<script type="text/javascript">
	$(document).ready(function() {
		//food class 이하의 li 태그들을 대상으로 이벤트를 적용
		$(".food li").on("click",function(){
			alert($(this).text());
		});
	});
</script>
</head>
<body>
	<div class="container">
		<ol class="a food">
			<li>곱창</li>
			<li>광어</li>
			<li>갈비</li>
		</ol>
		<ol class="food b">
			<li>소주</li>
			<li>맥주</li>
			<li>와인</li>
		</ol>
		<ol class="address">
			<li>판교</li>
			<li>강남</li>
			<li>종로</li>
		</ol>
	</div>
</body>
</html>