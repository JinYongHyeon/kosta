<%@page import="org.kosta.model.CarVO"%>
<%@page import="org.kosta.model.PersonVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>JSTL step10-set.jsp</title>
</head>
<body>
<% 
	request.setAttribute("personVO", new PersonVO("홍길동",24));
%>
  <h1>JSTL의 set을 이용ddd </h1>
  <h2>${requestScope.personVO.name}</h2>
  <c:set value="${requestScope.personVO}" var="p"> </c:set>
  ${p.name}${p.age}
  <hr>
  <%
  		PersonVO pvo = new PersonVO("트위치",22,new CarVO("123","람보르기니",8000));
  		request.setAttribute("person", pvo);
  %>
  <%
  	//기존 방식(스크립틀릿)으로 정보를 확인
  	PersonVO rvo=(PersonVO) request.getAttribute("person");
  %>
  <h1>기존 방식(스크립틀릿)으로 정보를 확인</h1>
  이름 : <%=rvo.getName() %> 자동차모델명 : <%=rvo.getCarVo().getModel() %><hr>
  <h1>EL방식으로 출력</h1>
  이름 :  ${requestScope.person.name}  자동차모델명 : ${requestScope.person.carVo.model} 자동차가격 : ${requestScope.person.carVo.price} <hr>
  <h1>c:set방식</h1>
  <c:set value="${requestScope.person.carVo}" var="pv"></c:set>
  이름 : ${requestScope.person.name}  자동차모델명 : ${pv.model} 자동차가격 : ${pv.price}
  
</body>
</html>