<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>EL paramValue 연습1</title>
</head>
<body>
<%-- EL 방식이므로 NULL일 경우 화면에 출력하지 않는다. --%>
	<ol>
		<li>${paramValues.food[0]}</li>
		<li>${paramValues.food[1]}</li>
		<li>${paramValues.food[2]}</li>
		<li>${paramValues.food[3]}</li>
		<li>${paramValues.food[4]}</li>
	</ol>
	

</body>
</html>