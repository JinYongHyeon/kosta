<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<form action="front" method="post">
	<input type="hidden" name="command" value="updatePost">
	<table class="table">
		<tr>
			<th>번호</th>
			<td><input type="text" name="no" value="${pvo.no}"
				readonly="readonly"></td>
		</tr>
		<tr>
			<th>제목</th>
			<td><input type="text" name="title" value="${pvo.title}"
				required="required"></td>
		</tr>
		<tr>
			<th>작성자</th>
			<td><input type="text" name="name" value="${pvo.mebmerVO.name}"
				readonly="readonly"></td>
		</tr>
		<tr>
			<th>작성일시</th>
			<td><input type="text" name="timePosted"
				value="${pvo.timePosted}" readonly="readonly"></td>
		</tr>
		<tr>
			<th>조회수</th>
			<td>${pvo.hits}</td>
		</tr>
		<tr>
			<th>본문</th>
			<td><textarea cols="50" rows="10" name="content"
					required="required">${pvo.content}</textarea></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="수정"></td>
		</tr>
	</table>
</form>