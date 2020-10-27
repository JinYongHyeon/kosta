<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>성공</title>
</head>
<script type="text/javascript">
	function fail(){
		var flagName = opener.document.getElementsByName("flag");
		var id = opener.document.getElementsByName("id");
		id[0].value="";
		id[0].focus();
		flagName[0].value="fail";
		self.close();
	}
</script>
<body onunload="fail()">
<%=request.getAttribute("id")%>는 중복사용 불가입니다.
<input type="button" value="확인" onclick="fail()">
</body>
</html>