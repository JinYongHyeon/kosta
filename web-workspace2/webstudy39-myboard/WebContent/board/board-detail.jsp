<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script type="text/javascript">
	function postDelete(){
		var flag=false;
		if(confirm("게시물을 삭제하시겠습니까?")){
			flag =true;
		}
		return flag;
	}
	
	function postUpdate(){
		var flag=false;
		if(confirm("게시물을 수정하시겠습니까?")){
			flag =true;
		}
		return flag;
	}
</script>
<%--게시물번호, 제목, 작성자(name), 작성일시, 조회수, 게시물 본문내용이 제공된다 --%>

<table class="table">
	<tr>
		<th>번호</th>
		<td>${pvo.no}</td>
	</tr>
	<tr>
		<th>제목</th>
		<td>${pvo.title}</td>
	</tr>
	<tr>
		<th>작성자</th>
		<td>${pvo.mebmerVO.name}</td>
	</tr>
	<tr>
		<th>작성일시</th>
		<td>${pvo.timePosted}</td>
	</tr>
	<tr>
		<th>조회수</th>
		<td>${pvo.hits}</td>
	</tr>
	<tr>
		<th>본문</th>
		<td><pre>${pvo.content}</pre></td>
	</tr>

	<c:if test="${sessionScope.member.id == pvo.mebmerVO.id}">
		<tr>

			<td>
				<form action="${pageContext.request.contextPath}/front"
					method="post" onsubmit="return postUpdate()">
					<input type="hidden" name="command" value="updatePostForm">
					<input type="hidden" name="no" value="${pvo.no}">
					<input type="submit" value="수정">
					
				</form>
			</td>


			<td><form action="${pageContext.request.contextPath}/front"
					method="post" onsubmit="return postDelete()">
				<input type="hidden" name="command" value="deletePost">
				<input type="hidden" name="no" value="${pvo.no}">
					<input type="submit" value="삭제">
				</form></td>

		</tr>
	</c:if>
</table>
