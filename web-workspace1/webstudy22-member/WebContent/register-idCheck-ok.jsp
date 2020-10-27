<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>성공</title>
</head>
<% String id =(String) request.getAttribute("id"); %>
<script type="text/javascript">
	function success(){
		var flagName = opener.document.getElementsByName("flag");
		flagName[0].value="<%=id%>";
		self.close();
	}
</script>
<body onunload="success()">
<%=id%>는 사용가능한 아이디입니다.
<input type="button" value="확인" onclick="success()">
</body>
</html>