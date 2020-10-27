<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%--
			command = updateMember -- UpdateMemberController  -- MemberDAO().updateMember()
											   | <--- db에 member 정보와 session의 member 정보를 함께 수정
									       redirect
									           |
							      UpdateMemberResultController
											   |
									        forward
									           |
									   update-result.jsp (login-layout이 적용된 화면)
									  (회원정보수정 완료)
									 		 아이디
											  이름
									 		  주소
 --%>

<form action="${pageContext.request.contextPath}/front" method="post">
	<input type="hidden" name="command" value="updateMember">
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
				<td>비밀번호</td>
				<td colspan="2"><input type="password" name="password"
					required="required" placeholder="비밀번호 입력"
					value="${sessionScope.userVO.password}"></td>
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
			<tr>
				<td colspan="3"><input type="submit" value="정보수정"></td>
			</tr>
		</thead>
	</table>
</form>