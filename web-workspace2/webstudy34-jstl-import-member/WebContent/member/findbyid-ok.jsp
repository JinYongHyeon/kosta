<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<table class="table">
	<thead>
		<tr>
			<th colspan="2">검색 결과</th>
		</tr>
		<tr>
			<th>아이디</th>
			<th>이름</th>
			<th>주소</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>${param.id }</td>
			<td>${requestScope.memberVO.name}</td>
			<td>${requestScope.memberVO.address}</td>
		</tr>
	</tbody>
</table>