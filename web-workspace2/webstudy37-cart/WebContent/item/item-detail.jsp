<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script type="text/javascript">
	function addCartBtn(){
		if(confirm("쇼핑칻트에 담으시겠습니까?")){
			//alert(document.getElementById("addCartForm"));
			//command = addcart -> AddCartController -> addcart_result.jsp
			//javascript form submit
			document.getElementById("addCartForm").submit();
		}
	
	}
</script>
<table class="table table-hover table-bordered detailTable">
	<tr>
		<th>No</th>
		<td>${requestScope.item.itemNo}</td>
	</tr>
	<tr>
		<th>Name</th>
		<td>${requestScope.item.name}</td>
	</tr>
	<tr> 
		<th>maker</th>
		<td>${requestScope.item.maker}</td>
	</tr>
	<tr>
		<th>Price</th>
		<td>${requestScope.item.pirce}</td>
	</tr>
	<tr>
		<th>Detail</th>
		<td><pre>${requestScope.item.detail}</pre></td>
	</tr>
	<c:if test="${sessionScope.userDTO != null}">
	<tr>
		<td colspan="2">
		<form action="front" method="post" id="addCartForm">
		<input type="hidden" name="command" value="addcart">
		<input type="hidden" name="itemNo" value="${requestScope.item.itemNo}">
		<input type="button" style="width:100%;" onclick="addCartBtn()" value="장바구니담기">
		</form>
		</td>
	</tr>
	</c:if>
</table>