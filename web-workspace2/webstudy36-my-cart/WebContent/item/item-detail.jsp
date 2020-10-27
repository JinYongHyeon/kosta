
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script type="text/javascript">
<%	
%>
	function addCart(){
		var flag  = confirm("장바구니에 담으시겠습니까?");
		if(flag){
			location.href="${pageContext.request.contextPath}/front?command=CardAdd&itemNo=${requestScope.item.itemNo}"
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
			<td colspan="2"><input type="button" value="장바구니" style="width:100%;" onclick="addCart()"></td>
		</tr>
	</c:if>

</table>