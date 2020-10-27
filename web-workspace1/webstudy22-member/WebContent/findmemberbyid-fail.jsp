<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>아이디 없음</title>
</head>
<script type="text/javascript">
	alert("<%=request.getParameter("userId")%> 아이디를 가진 회원이 없습니다");
	location.href="index.jsp";
</script>
<body>

</body>
</html>