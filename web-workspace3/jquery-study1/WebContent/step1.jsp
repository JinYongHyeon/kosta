<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jquery basic</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script type="text/javascript">
	//jQuery의 ready 함수는 document 가 준비되는 시점에서 실행된다.
	//jQuery(document).ready(function(){})
	//jQuery와 $는 같은 표현 : 자바스크립트 객체를 jQuery 객체로 변환한다.
	//ready시점에 현 페이지의 이벤트를 등록
	$(document).ready(function() {
		//alert(document.getElementById("ts").innerHTML) javascript
		alert($("#ts").html());
		//a tag에 대해 클릭했을 때 자신의 text를 alert으로 출력하는 이벤트를 등록
		$("a").click(function(){
			alert($(this).text())
		})
	});
</script>
</head>
<body>
	<div class="container">
		JqueryBasic <span id="ts"> test span </span>
		<ul>
			<li><a href="#">test1</a></li>
			<li><a href="#">test2</a></li>
			<li><a href="#">test3</a></li>
		</ul>
	</div>
</body>
</html>