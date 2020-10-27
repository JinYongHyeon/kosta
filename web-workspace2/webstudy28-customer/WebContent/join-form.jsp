<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<title>회원가입</title>
<style>
.container{position:absolute; top:50%; left:50%; transform:translate(-50%,-50%); }
</style>
<script type="text/javascript">
	function idCheck2() {
		var flag = false;
		var id = document.getElementsByName("id");

		if (id[0].value.trim() === "") {
			alert("빈공간입니다. 아이디를 입력해주세요");
			return;
		}
		window.open("front?command=idCheck&id=" + id[0].value, "알아서뭐해",
				"width:300px,heigth:300px");
	}

	function submitCheck() {
		var flag = false;
		var id = document.getElementsByName("id");
		var idCheck = document.getElementsByName("idCheck");
		if (id[0].value === idCheck[0].value) {
			flag = true;
		}

		if (flag === false) {
			alert("아이디 중복 체크를 해주세요");
		}
		return flag;
	}
</script>
</head>
<body>
	<div class="container">
	<h1 style="text-align:center; margin-bottom:30px;">Sing UP</h1>
		<form action="front" method="post" onsubmit="return submitCheck()">
			<input type="hidden" name="command" value="join"> <input
				type="hidden" name="idCheck" value="">
			<div class="input-group mb-3">
				<div class="input-group-prepend">
					<span class="input-group-text" id="basic-addon1">아이디</span>
				</div>
				<input type="text" name="id" required="required"
					class="form-control" placeholder="아이디를 입력하세요"> <input
					type="button" name="idCheck" value="아이디 체크" onclick="idCheck2()">
			</div>

			<div class="input-group mb-3">
				<div class="input-group-prepend">
					<span class="input-group-text" id="basic-addon1">비밀번호</span>
				</div>
				<input type="password" name="password" required="required"
					class="form-control" placeholder="비밀번호를 입력해주세요">
			</div>

			<div class="input-group mb-3">
				<div class="input-group-prepend">
					<span class="input-group-text" id="basic-addon1">이름</span>
				</div>
				<input type="text" class="form-control" name="name"
					required="required" placeholder="이름을 입력해주세요">
			</div>

			<div class="input-group mb-3">
				<div class="input-group-prepend">
					<span class="input-group-text" id="basic-addon1">주소</span>
				</div>
				<input type="text" name="address" required="required"
					class="form-control" placeholder="주소 입력하세요">
			</div>

			<div class="input-group mb-3">
				<div class="input-group-prepend">
					<span class="input-group-text" id="basic-addon1">생일</span>
				</div>
				<input type="date" class="form-control" name="birthday"
					required="required">

			</div>
			<input type="submit" value="회원가입" class="btn btn-lg btn-primary btn-block">
		</form>
	</div>
</body>
</html>