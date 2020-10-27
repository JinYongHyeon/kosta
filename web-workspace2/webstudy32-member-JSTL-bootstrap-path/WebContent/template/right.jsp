<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"  %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%--
	로그인 실패하면 member/login-fail.jsp 에서 alert으로 로그인 실패, index로 이동시킨다.
	로그인 성공하면 index로 이동시킨다. 
	로그인 전에는 로그인 폼만 제공 로그인 후에는 홍길동님 로그인
	회원검색 주소리스트가 제공
	
	로그아웃하면 다시 index로 이동 로그인 폼만 제공된다.
	
	sessionScope
	 -한가지 주의할 점은 page 지시어에서 session 속성을 false 로 설정했을 경우에는 session 객체에 저장한 빈 객체를 사용할 수 없다.
 	 -JSP 페이지가 서블릿 클래스로 변환될때 request.getSession() 이 자동적으로 추가되기 때문에 jsp페이지에서 request.getSession()을 사용할 필요없이 session 내장객체를 사용하기만 하면 된다고 한다. 즉, 별다른 설정이 없다면 그냥 세션객체를 쓰면된다는 것이다. 하지만 <%@ page session="false"%> 설정을 하면 JSP 페이지에서 session 내장 객체를 사용하지 않겠다는 의미가 되므로 session 내장 객체를 사용할 수 없고 따라서 sessionScope 도 사용할 수 없게 된다.
 --%>

<c:choose>
	<c:when test="${sessionScope.user == null}">
		<form action="${pageContext.request.contextPath}/front" method="post">

			<input type="hidden" name="command" value="login">
			<table>
				<tr>
					<td>아이디</td>
					<td><input type="text" name="id" required="required"
						placeholder="아이디를 입력하세요"></td>
				</tr>

				<tr>
					<td>패스워드</td>
					<td><input type="password" name="password" required="required"
						placeholder="비밀번호를 입력하세요"></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="로그인"></td>
				</tr>
			</table> 
		</form>
	</c:when>
	<c:otherwise>
		<h3>${sessionScope.user.name}님 안녕하세요</h3>
		<button onclick="location.href='${pageContext.request.contextPath}/front?command=logout';">로그아웃</button>
			<ul>
				<li><a
					href="${pageContext.request.contextPath }/member/findbyid-form.jsp">회원검색</a></li>
				<li><a
					href="${pageContext.request.contextPath }/front?command=getAddressKind">주소목록불러오기</a></li>
			</ul>
			
	</c:otherwise>
</c:choose>


