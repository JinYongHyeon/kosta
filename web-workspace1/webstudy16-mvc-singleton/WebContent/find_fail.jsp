<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>error 상품 아이디 없음</title>
</head>
<body>
	<script type="text/javascript">
		alert("<%=request.getAttribute("id")%> 가 존재하지 않습니다.");
		location.href="index.jsp";
	</script>
</body>
</html>