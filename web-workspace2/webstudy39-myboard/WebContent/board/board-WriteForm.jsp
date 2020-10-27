<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>


<form action="front" method="post">
	<input type="hidden" name="command" value="writePost">
	<input type="hidden" name="id" value="${sessionScope.member.id}">
	<table class="table">
		<tr>
			<th>제목</th>
			<td><input type="text" name="title" 
				required="required"></td>
		</tr>
		<tr>
			<th>본문</th>
			<td><textarea cols="50" rows="10" name="content"
					required="required"></textarea></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="작성"></td>
		</tr>
	</table>
</form>