<%@page import="org.kosta.model.CarVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="org.kosta.model.PersonVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>step6-forEach.jsp</title>
</head>
<body>
	<c:forEach begin="1" end="20" var="num" >
		${num }
	</c:forEach>
	<hr>
	<%
		PersonVO arr[] = {new PersonVO("홍길동",23),new PersonVO("아이어맨",33),new PersonVO("캡틴",34)};
 		request.setAttribute("parray", arr);
 	%>
 	<%--
 		items : 배열 or 컬렉션 
 		var : 요소를 담을 변수
 		varStatus : count--> start 1부터 ,  index--> start 0부터
 	 --%>
 	<c:forEach items="${requestScope.parray}" var="person" varStatus="order">
 		${order.count} 이름 : ${person.name} 
 		나이 : ${person.age} <br>
 	</c:forEach>
	<%
		ArrayList<CarVO> list = new ArrayList<CarVO>();
		list.add(new CarVO("123","마세라티",7000));
		list.add(new CarVO("456","롤스로이스",8000));
		list.add(new CarVO("432","부가티",10000));
		session.setAttribute("carList", list);
	%>
<hr>
<%--
	1. 모델명 : 모닝 가격: 10000
	.
	.
	.
 --%>
<c:forEach items="${carList}" var="car" varStatus="order">
	${order.count }. 모델명 : ${car.model} 가격 : ${car.price}<br>
</c:forEach>
</body>
</html>