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
<script type="text/javascript">
	$(document).ready(function() {
		$("#testBtn").on("click", function() {
			alert($(this).val());
		});
		$(document).on("click",".student",function(){
			$("#result").text($(this).text());
		});
	});
</script>
</head>
<body>
	<div class="container">
		<input type="button" value="셀렉터 연습" id="testBtn">
		<br>
		<div class="student">미니언</div>
		<div class="teacher">홍길동</div>
		<div class="student">윈스턴</div>
		<div id="result"></div>
		<%-- class student를 클릭하면 result id 영역에 자신의 text가 출력된다. --%>
	</div>
</body>
</html>