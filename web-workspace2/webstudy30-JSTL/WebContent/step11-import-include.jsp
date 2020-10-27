<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>JSTL import(jsp include action tag과 역할이 같다.)</title>
</head>
<body>
<%-- 
	jstl import는 <jsp:include page="header.jsp"></jsp:include> 역할이 같다.
	차이는 jstl import는 다른 웹어플리케이션의 자원을 이용할 수 있다.
 --%>
<c:import url="header.jsp"></c:import>
<h1>이 부분은 step11 화면입니다.</h1>
<%--
	jstl import를 이용해 다른 웹어플리케이션의 자원을 가져와 본다.
	jsp:include는 자신의 웹어플리케이션 내의 자원만 가져올 수 있다.
 --%>
<c:import url="http://localhost:8888/webstudy29-EL/footer.jsp"></c:import>
</body>
</html>