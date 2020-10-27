<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>실패</title>
<script type="text/javascript">
	function fail(){
		self.close();
	}
</script>
</head>
<body onunload="fail()">
	아이디가 존재합니다 다시 입력하세요
	<input type="button"  value="확인" onclick="fail()"> 
</body>
</html>