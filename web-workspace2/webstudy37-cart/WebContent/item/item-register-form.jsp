<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%--
			RegisterItemController - ItemDAO().registerItem(dto)
			         |
			      redirect
			         |
		  item/item-register-result.jsp --> alert() 상품등록완료 후 home으로 이동
			     	
 --%>
<form action="front" method="post">
	<input type="hidden" name="command" value="RegisterItem">
	<table class="table">
		<tr>
			<th>상품이름</th>
			<td><input type="text" name="name" required="required" placeholder="상품이름을 입력하세요"></td>
		</tr>
		<tr>
			<th>제조사</th>
			<td><input type="text" name="maker" required="required" placeholder="제조사을 입력하세요"></td>
		</tr>
		<tr>
			<th>가격</th>
			<td><input type="number" name="price" required="required" placeholder="가격을 입력하세요"></td>
		</tr>
		<tr>
			<th>상세설명</th>
			<td><textarea rows="5" cols="30" name="detail" required="required"></textarea></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="상품등록"></td>
		</tr>
	</table>

</form>