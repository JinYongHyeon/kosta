<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jquery next(), prev()</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script type="text/javascript">
	$(document).ready(function(){
		$(document).on("click","#infoDiv .desc",function(){
			//alert($(this).text());
			//클릭된 요소의 다음 요소에 클릭된 요소의 텍스트를 할당
			$(this).next().text($(this).text());
		});
		$(document).on("click","#deleteAllBtn",function(){
			//class desc 다음 요소의 정보를 지운다.
			$(".desc").next().text("");
		});
		$(document).on("click","#prevBtn",function(){
			//현재 버튼의 이전 요소의 텍스트를 출력
			alert($(this).prev().prev().prev().text());
			
		});
	});
</script>
</head>
<body>
	<div class="container">
		<div id="infoDiv">
			<span class="desc">홍길동</span><span></span><br>
			<span class="desc">길</span><span></span><br>
			<span class="desc">개리</span><span></span><br>
			<br>
			<input type="button" value="추가한 데이터를 지움" id="deleteAllBtn">
			<br>
			<span>킹아서</span>
			<br><font>검객</font>
			<button type="button" id="prevBtn">prevTest</button>
		</div>
	</div>
</body>
</html>