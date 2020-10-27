<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script type="text/javascript">
	function cartDelete(){
		var flag =false;
		if(confirm("장바구니에서 상품을 삭제하시겠습니까?")){
			flag =true;
		}
		return flag;
	}
</script>
<table class="table table-hover">
	<thead>
		<tr>
			<th>번호</th>
			<th>상품명</th>
			<th>제조사</th>
			<th>가격</th>
			<th>비고</th>
		</tr>
	</thead>
	<c:choose>
		<%-- empty == 값이 없을경우 --%>

		<c:when test="${empty sessionScope.userDTO.cart.itemList}">
			<tbody>
				<tr style="text-align: center;">
					<td colspan="5">상품없음</td>
				</tr>
			</tbody>
		</c:when>
		<c:otherwise>
			<tbody>
				<c:forEach items="${sessionScope.userDTO.cart.itemList}" var="item">
					<tr>
						<td>${item.itemNo}</td>
						<td>${item.name}</td>
						<td>${item.maker}</td>
						<td>${item.pirce}</td>
						<td>
							<form action="front" method="post" id="deleteItemForm" onsubmit="return cartDelete()">
								<input type="hidden" name="command" value="deletecart"> 
								<input type="hidden" name="itemNo" value="${item.itemNo}"> 
								<input type="submit" value="삭제">
							</form>
						</td>
					<tr>
				</c:forEach>
				<tr style="text-align: center;">
					<td colspan="5">총금액 : ${sessionScope.userDTO.cart.totalPrice}</td>
				</tr>
			</tbody>
		</c:otherwise>
	</c:choose>

</table>
