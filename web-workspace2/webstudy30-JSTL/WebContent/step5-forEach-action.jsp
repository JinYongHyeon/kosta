<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
</head>
<body>
<% request.setCharacterEncoding("utf-8"); %>
주문자명  : ${param.customerName}<br>
주문항목<br>
<c:forEach items="${paramValues.menu}" var="menu" varStatus="order">
	${order.count}. ${menu}<br>
</c:forEach>
</body>
</html>