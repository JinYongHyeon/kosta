<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<table class="table table-bordered  table-hover boardlist">
	<thead>
		<tr class="success">
			<th>번호</th>
			<th class="title">제목</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>조회</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="pvo" items="${requestScope.lvo.list}">
			<tr>
				<td>${pvo.no }</td>
				<td><c:choose>
						<c:when test="${sessionScope.mvo!=null}">
							<a
								href="${pageContext.request.contextPath}/front?command=PostDetail&no=${pvo.no }">
								${pvo.title }</a>
						</c:when>
						<c:otherwise>
				${pvo.title }
				</c:otherwise>
					</c:choose></td>
				<td>${pvo.memberVO.name }</td>
				<td>${pvo.timePosted }</td>
				<td>${pvo.hits }</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<c:set value="${requestScope.lvo.pagingBean}" var="bean"></c:set>
<ul>
<c:if test="${bean.previousPageGroup}">	<li><a href="${pageContext.request.contextPath}/front?command=List&nowPage=${bean.startPageGroup-1}">«</a></li>
	</c:if>
	<c:forEach var="page" begin="${bean.startPageGroup}"
		end="${bean.endPageGroup}">
		<c:choose>
		
		<c:when test="${page == bean.nowPage}">
		<li><a href="#">${page}</a>
		</c:when>
		<c:otherwise>
			<li><a href="${pageContext.request.contextPath}/front?command=List&nowPage=${page}">${page}</a></li>
		</c:otherwise>
		</c:choose>
	</c:forEach>
	<c:if test="${bean.nextPageGroup}"><li><a href="${pageContext.request.contextPath}/front?command=List&nowPage=${bean.endPageGroup+1}">»</a></li>
	</c:if>
</ul>











