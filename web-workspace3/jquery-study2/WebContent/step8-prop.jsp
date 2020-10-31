<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>step7-prop.jsp</title>
<script type="text/javascript">
	$(document).ready(function() {
		$(document).on("click", "#checkBtn1", function() {
			//mailing 체크박스를  체크상태로 만든다.
			$("#mailing").prop("checked",true);
		});
		$(document).on("click", "#checkBtn2", function() {
			//mailing 체크박스를  체크 해제상태로 만든다.
			$("#mailing").prop("checked",false);
		});
		$(document).on("click", "#checkBtn3", function() {
			//체크박스의 체크 상태를 확인한다.
			alert($("#mailing").prop("checked"));
		});
	});
</script>
</head>
<body>
	<input type="checkbox" id="mailing">메일체크
	<br>
	<input type="button" id="checkBtn1" value="체크하기">
	<input type="button" id="checkBtn2" value="체크해제하기">
	<input type="button" id="checkBtn3" value="체크상태확인">
</body>
</html>








