<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<script type="text/javascript">
	function registerCheck() {
		var flag = false;
		var flagName = document.getElementsByName("flag");
		var id = document.getElementsByName("id");
		var idCheck2 = document.getElementsByName("idCheck2");
		
		if(flagName[0].value !== id[0].value){
			alert("아이디 중복검사를 해주십시오");
			return flag;
		}else{
			flag = true;
		}
		
		flag = passwordCheck();
		if (!flag)
			alert("비밀번호가 맞지 않습니다.");
		return flag;
	}
	
	function idCheck(){	
		var id = document.getElementsByName("id");
		if(id[0].value.trim() ===""){alert("공백금지"); id[0].focus(); return;}
		window.open("front?command=findMemberByIdCheck&id=" + id[0].value,
				"알아서뭐해", "width:300px,heigth:300px");
		
	}
	function passwordCheck() {
		var password = document.getElementsByName("password");
		var flag = false;
		if (password[0].value.trim() === password[1].value.trim())
			flag = true;
		return flag;
	}
</script>
</head>
<body>
	<h1>회원가입 페이지</h1>
	<form action="front" method="post" onsubmit="return registerCheck()">
		<input type="hidden" name="flag" value="">
		<input type="hidden" name="command" value="register">
		<table>
			<tr>
				<td>아이디</td>
				<td><input type="text" name="id" required="required"
					placeholder="아이디를 입력해주세요"></td>
			</tr>
			<%-- 전송전 javascript로 비교해서 일치하지 않으면 전송하지 않는다. --%>
			<tr>
				<td>패스워드</td>
				<td><input type="password" name="password" required="required"
					placeholder="비밀번호를 입력해주세요"></td>
			</tr>
			<tr>
				<td>패스워드 확인</td>
				<td><input type="password" name="password" required="required"
					placeholder="비밀번호를 입력해주세요"></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="name" required="required"
					placeholder="이름을 입력해주세요"></td>
			</tr>
			<tr>
				<td>주소</td>
				<td><input type="text" name="address" required="required"
					placeholder=" 주소를 입력해주세요"></td>
			</tr>
			<tr>
				<td colspan="1"><input type="submit" value="회원가입"></td>
				<td><input type="button" value="아이디 중복검사" onclick="idCheck()"></td>
			</tr>
		</table>
	</form>

</body>
</html>