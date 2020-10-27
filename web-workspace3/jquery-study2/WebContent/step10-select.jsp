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
  			$(document).on("click","#createOption",function(){
  				//alert(1);
  				var arr =["손흥민","네이마르","음바페"];
  				for(var i=0;i<arr.length;i++){
  					$("#friend").append("<option value="+arr[i]+">"+arr[i]+"</option>");
  				}
  			});
  			$(document).on("click","#delteOption",function(){
  				$("#friend").empty(); //대상의 자식 요소를 삭제, 즉 옵션을 삭제
  			});
  		});
  </script>
</head>
<body>
<div class="container">
	<input type="button" value="셀렉트옵션생성" id="createOption">
	<input type="button" value="셀렉트옵션삭제" id="delteOption">
	<select id="friend">
		
	</select>
</div>
</body>
</html>