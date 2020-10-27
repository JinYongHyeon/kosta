<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<table class="table">
	<thead>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>조회</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${requestScope.boardList}" var="post">
			<tr>
				<td>${post.no}</td>
				<c:choose>
					<c:when test="${sessionScope.member != null}">
						<td><a
							href="${pageContext.request.contextPath}/front?command=getPostDetail&no=${post.no}">${post.title}</a></td>
					</c:when>
					<c:otherwise>
						<td>${post.title}</td>
					</c:otherwise>
				</c:choose>
				<td>${post.mebmerVO.name}</td>
				<td>${post.timePosted}</td>
				<td>${post.hits}</td>
			</tr>
		</c:forEach>

	</tbody>
</table>
<div class="container">
	<div class="row">
		<div class="col-sm-6 col-sm-offset-2">
			<nav aria-label="Page navigation example" style="text-align:center">
				<ul class="pagination">
					<li class="page-item"><a class="page-link" href="#"
						aria-label="Previous"> <span aria-hidden="true">&laquo;</span>
					</a></li>
					<li class="page-item"><a class="page-link" href="#">1</a></li>
					<li class="page-item"><a class="page-link" href="#"
						aria-label="Next"> <span aria-hidden="true">&raquo;</span>
					</a></li>
				</ul>
			</nav>
		</div>
	</div>
</div>
