<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<table class="table table-bordered">
	<thead>
		<tr class="warning">
			<th>번호</th>
			<th>제품명</th>
			<th>제조사</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${requestScope.item}" var="item">
			<tr>
				<td><a href="${pageContext.request.contextPath}/front?command=detailItem&itemNo=${item.itemNo}">${item.itemNo}</a></td>
				<td>${item.name}</td>
				<td>${item.maker}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
