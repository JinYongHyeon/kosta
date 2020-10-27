<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>비동기 방식 통신(ajax)의 예</title>
<script type="text/javascript">
	var xhr;
	function startAjax(){ 
	    //ajax 통신을 위한 자바스크립트 객체
		xhr = new XMLHttpRequest();
		//alert(xhr);		
		//callback 함수를 등록, callback함수는 readystate가 변화될 때 호출(서버가 응답할 때 호출된다)
		xhr.onreadystatechange = callback;
		//open(method,ServerUrl) : 요청메서드방식과 처리할 서버프로그램  url
		xhr.open("get","AsynServlet");
		xhr.send(null); // post 방식일 때 사용 --> get방식 일 때 null로 보내줌
		
	}
	function callback(){
		var result = document.getElementById("result");
		//readyState가 4(서버로부터 응답데이터를 받은 상태)
		//status 200(정상수행)
		if(xhr.readyState == 4 && xhr.status == 200){
			//responseText : 서버가 응답한 데이터 
			//alert(xhr.responseText);
			//span에 접근해서 서버가 응답한 데이터를 할당해본다.
			result.innerHTML=xhr.responseText;
		}
			
	}
</script>
</head>
<body>
<form action="${pageContext.request.contextPath}">
	<input type="text" name="userInfo">
	<input type="button" value="비동기통신(ajax)테스트" onclick="startAjax()">
	<span id="result"></span>
</form>

<hr>
<textarea rows="30" cols="100">

</textarea>
</body>
</html>