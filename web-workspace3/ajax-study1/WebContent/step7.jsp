<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jquery hide,show img</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<script type="text/javascript">
	$(document).ready(function() {
		$(document).on("click", "#hideBth", function() {
			$("#imgView").hide(3000,function(){
				$("#stateInfo").text("오킹 없다.");
			});
		});

		$(document).on("click", "#showBtn", function() {
			$("#imgView").show(3000,function(){
				$("#stateInfo").text("오킹 있다.");
			});
		});
	});
</script>
<body>
	<div class="container">
		<img src="${pageContext.request.contextPath}/Oking.jpg" alt="oking"
			width="400px" height="400px" id="imgView"> <input type="button"
			value="사진감추기" id="hideBth"> <input type="button" value="사진보기"
			id="showBtn">
	</div>
	<hr>
	<span id="stateInfo" style="font-size:48px; color:blue;">오킹 있다.</span>
</body>
</html>