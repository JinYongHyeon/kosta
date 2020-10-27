<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script type="text/javascript">
  	$(document).ready(function(){
  		$(".ct").on("click",function(){
  			return confirm($(this).text()+"이동하시겠습니까?");			
  		});
  	});
  </script>
</head>
<body>
<div class="container">
	<a href="http://daum.net" class="ct">다음넷으로</a><br>
	<a href="http://naver.com">네이바로</a><br>
	<a href="http://google.com" class="ct">구글로</a><br>
	
</div>
</body>
</html>