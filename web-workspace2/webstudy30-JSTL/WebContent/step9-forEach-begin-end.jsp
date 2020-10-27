<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>JSTL forEach-begin-end.jsp</title>
<style>
ul {
	list-style: none;
}

ul li {
	float: left;
	width: 50px;
	height: 50px;
	border: 1px solid #000;
	text-align: center;
	line-height: 50px;
	cursor: pointer;
	transition: 0.4s;
}

ul li:hover {
	background-color: #000;
	color: #fff;
}
</style>
</head>
<body>
	<%
	request.setAttribute("startPage", 11);
	request.setAttribute("endPage", 20);
	request.setAttribute("noewPage", 13);
	//nowPage에는 링크(a href)가 부여되지 않고
	//나머지 페이지번호에는 링크가 부여되도록 한다
	%>
	<ul>
		<li>왼</li>
		<c:forEach begin="${requestScope.startPage}" end="${requestScope.endPage}" var="num">
		<c:choose>
		<c:when test="${num==requestScope.noewPage}">
			<li>${num}</li>
			</c:when>
			<c:otherwise>
			<li><a href="${num}">${num}</a></li>
			</c:otherwise>
			</c:choose>
		</c:forEach>
		<li>오</li>
	</ul>
</body>
</html>