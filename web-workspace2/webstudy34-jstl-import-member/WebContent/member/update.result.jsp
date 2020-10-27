<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<table>
		<thead>
			<tr style="text-align: center;">
				<th>회원정보 수정</th>
			</tr>
			<tr>
				<td>아이디</td>
				<td colspan="2"><input type="text" name="id"
					readonly="readonly"
					value="${sessionScope.userVO.id}"></td>

			</tr>
	
			<tr>
				<td>이름</td>
				<td colspan="2"><input type="text" name="name"
					required="required" placeholder="이름 입력"
					value="${sessionScope.userVO.name}"></td>
			</tr>
			<tr>
				<td>주소</td>
				<td colspan="2"><input type="text" name="address"
					required="required" placeholder="주소 입력"
					value="${sessionScope.userVO.address}"></td>
			</tr>
			
		</thead>
	</table>