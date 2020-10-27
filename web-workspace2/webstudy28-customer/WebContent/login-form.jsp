<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="resource/css/signin.css">

<title>Login</title>
</head>
<body>
	<form action="front" method="post" class="form-signin">
		<input type="hidden" name="command" value="login">
		<div class="text-center mb-4">
			<h1>Login</h1>
		</div>
		<div class="form-label-group">
			<input type="text" id="inputId" class="form-control" name="id" required="required" placeholder="아이디를 입력하세요"> 
				<label for="inputId">아이디를 입력하세요</label>
		</div>
		<div class="form-label-group">
			<input type="password" id="inputPass" class="form-control"
				name="password" required="required" placeholder="비밀번호를 입력하세요">
			<label for="inputPass">비밀번호를 입력하세요</label>
		</div>
		<input type="submit" value="로그인" class="btn btn-lg btn-primary btn-block">
	</form>
</body>
</html>