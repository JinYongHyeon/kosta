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

  		$("#btn2").on("click",function(){
  			alert($(this).val());
  		});
  		
  		//id가 btn3인 대상을 선택해서 이벤트 등록
  		//자신의 value를 span id resultView에 출력 (text(값))
  		$("#btn3").on("click",function(){
  			//$("#resultView").text($(this).val());
  			//innerHTML 형식으로 html tag를 적용
  			$("#resultView").html("<h1>"+$(this).val()+"</h1>");
  		});
  	});
  </script>
</head>
<body>
<div class="container">
	<input type="button" value="테스트1 이벤트적용안됨"><br><br>
	<input type="button" value="테스트2  값을 출력" id="btn2"><br><br>
	<input type="button" value="테스트3 값을 span에 출력" id="btn3"><br><br>
	<span id="resultView">span영역</span>
</div>
</body>
</html>