<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script type="text/javascript">

	function cartDelete(itemNo) {
		
		var flag = confirm("장바구니에 추가!! 장바구니로 이동하시겠습니까?");
		if (flag) {
			location.href = "${pageContext.request.contextPath}/front?command=cartDelete&itemNo="+itemNo;
		}  
	}

	
</script>

</head>


<body>
	<table class="table">
		<thead>
			<tr>
				<th>번호</th>
				<th>상품명</th>
				<th>제조사</th>
				<th>가격</th>
				<th>비고</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${sessionScope.cart}" var="cart">
				<tr>
					<td>${cart.value.itemNo}</td>
					<td>${cart.value.name}</td>
					<td>${cart.value.maker}</td>
					<td>${cart.value.pirce}</td>
					<td><input type="button" value="삭제"
						onclick="cartDelete(${cart.value.itemNo})"></td>
				<tr>
				<c:set var="point" value="${point+cart.value.pirce}"></c:set>
			</c:forEach>
			<tr>
				<td colspan="5">${point}</td>
			</tr>
		</tbody>
	</table>