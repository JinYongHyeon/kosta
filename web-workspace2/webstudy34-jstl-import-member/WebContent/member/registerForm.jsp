<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<style>
	form input{width:100%;}
</style>
<%--
			command=register -- RegisterController -- MemberDAO().reigster(MemberVO)
									    |
								   redirect방식   
									    |
							  RegisterResultController
							            |
					 member/register-result.jsp (레이아웃 적용되야  함)
 --%>
<form action="${pageContext.request.contextPath}/front" method="post">
	<input type="hidden" name="command" value="register">
	<table>
		<thead>
			<tr style="text-align:center;">
				<th>회원가입</th>
			</tr>
			<tr>
				<td>아이디</td>
				<td><input type="text" name="id" required="required"
					placeholder="아이디 입력"></td>
				<td><input type="button" value="중복체크"></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td colspan="2"><input type="password" name="password"
					required="required" placeholder="비밀번호 입력"></td>
			</tr>
			<tr>
				<td>이름</td>
				<td colspan="2"><input type="text" name="name"
					required="required" placeholder="이름 입력"></td>
			</tr>
			<tr>
				<td>주소</td>
				<td colspan="2"><input type="text" name="address"
					required="required" placeholder="주소 입력"></td>
			</tr>
			<tr>
				<td colspan="3"><input type="submit" value="회원가입"></td>
			</tr>
		</thead>
	</table>
</form>