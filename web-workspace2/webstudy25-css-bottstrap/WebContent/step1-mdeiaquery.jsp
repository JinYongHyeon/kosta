<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- 반응형 웹을 미디어쿼리 선언부 -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>반응형 웹</title>
<style>
body {
	background-color: #fc0352;
}
/*
	부트스트랩 프레임워크 
	xs(768이하) 모바일 폰 
	sm(768이상) 태블릿
	md(992이상) 중간기기 데스크탑
	lg(1200이상) 큰기기 데스크탑
	768  너비부터 yellow
*/

@media( min-width :768px ) {
	body {
		background-color: #0373fc;
	}
}
@media( min-width :992px ) {
	body {
		background-color: #fc6f03;
	}
}
@media( min-width :1200px ) {
	body {
		background-color: #a503fc;
	}
}
</style>
  
</head>
<body>

</body>
</html>