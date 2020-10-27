<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ajax 방식으로 회원정보검색</title>
<script type="text/javascript">
	var xhr
	function startAjax() {
		var idComp = document.getElementById("userId");
		if (idComp.value === "") {
			alert("아이디를 입력하세요");
			return;
		}

		//Ajax를 위한 자바스크립트 객체
		xhr = new XMLHttpRequest();

		//콜백함수등록(서버가 응답하면 실행될 함수를 등록)
		xhr.onreadystatechange = collBack;
		//요청시 get방식이므로 url에서 userId를 전송한다
		xhr.open("get", "FindMemberAjaxServlet?userId=" + idComp.value);
		//post방식일때 사용하는 메서드
		xhr.send(null); //send()함수가 실행되었을 때 요청이 완료
	}

	//서버가 응답하면 실행되는 함수
	function collBack() {
		var result = document.getElementById("result");
		//readyState 4 응답완료, status 200 정상수행
		if (xhr.readyState == 4 && xhr.status == 200) {
			result.innerHTML = xhr.responseText;
		} else if (xhr.readyState < 4) {
			result.innerHTML = "<font>응답대기중</font>";
		}
	}
</script>
</head>
<body>
	<form>
		<input type="text" name="userId" id="userId" placeholder="아이디">
		<input type="button" value="회원검색" onclick="startAjax()">
	</form>
	<span id="result"></span>
</body>
</html>