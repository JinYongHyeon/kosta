<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"  %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<ul>
	<li><a href="front?command=itemRegisterForm">상품등록</a>
	<%-- forward case --%>
	<li><a href="${pageContext.request.contextPath}/front?command=FindItemFrom">상품검색</a></li>
	<%-- redirect case --%>
	<li><a href="${pageContext.request.contextPath}?front?command=ItemRegisterForm"></a></li>
</ul>

