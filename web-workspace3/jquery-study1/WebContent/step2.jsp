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
  //document가 준비된 시점(메모리에 로딩)에 익명함수가 실행되고 이 익명함수는 현페이지에서 필요한 이벤트 행위를
  //일괄적으로 등록
  $(document).ready(function(){
	  //$(:button).on("click",function) -> (:button) jquery 필터로 선택, type=button을 선택해준다.
	 $("input[type=button]").on("click",function(){
		alert($(this).val()); 
	 }); 
  });
  </script>
</head>
<body>
<div class="container">
	<input type="button" value="버튼1"><br>
	<input type="button" value="버튼2"><br>
	<input type="button" value="버튼3"><br>
	<input type="button" value="버튼4"><br>
</div>
</body>
</html>