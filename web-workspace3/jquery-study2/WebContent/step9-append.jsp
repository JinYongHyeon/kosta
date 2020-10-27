<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>step9-append.jsp</title>
<style type="text/css">
	#span1{
		background-color: yellow;
	}
	#span2{
		background-color: lime;
	}
</style>
<script type="text/javascript">
	$(document).ready(function(){
		$(document).on("click","#testBtn",function(){
			$("#span1").append("가수");	//대상 요소의 마지막 하위(자식) 요소로 추가
			$("#span2").after("가수");
			$("a[href*=daum]").append("go");//*=daum 포함된 거 찾음
			$("a[href*=google]").after("거거거");
		});
		
	});
</script>
</head>
<body>
<input type="button" id="testBtn" value="테스트"><br><br>
<span id="span1">아이유</span><hr>
<span id="span2">이효리</span><hr>
<a href="http://daum.net">다음넷으로</a><hr>
<a href="http://google.com">구글로</a><hr>
</body>
</html>









