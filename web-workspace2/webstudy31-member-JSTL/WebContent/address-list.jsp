<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<script type="text/javascript">
function check(){
	var flag =true;
	var add = document.getElementsByName("address");
	if(add[0].value ==="===주소==="){
		alert("주소를 선택하세요 ^^");
		flag =false;
	}
	return flag;
}
</script>
<body>
	<form action="front" onsubmit="return check()">
		<input type="hidden" name="command" value="addressList">
		<select name="address" required="required">
			<option>===주소===</option>
			<c:forEach items="${requestScope.list}" var="address">
				<option value="${address}">${address}</option>
			</c:forEach>
		</select>
		<input type="submit" value="검색">
	</form>
</body>
</html>