<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<% String id = request.getParameter("id"); %>
<script type="text/javascript">
function success(){
	var idCheck = opener.document.getElementsByName("idCheck");
	idCheck[0].value="<%=id%>";
	self.close();
}
</script>
</head>
<body onunload="success()">
	<%=id %> 사용가능합니다
	<input type="button" value="확인" onclick="success()">
</body>
</html>