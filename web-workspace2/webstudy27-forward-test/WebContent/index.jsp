<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>dbcp test</title>
</head>
<body>
<%--
	index.jsp -- command = findCarByNo -- FindCarByNoController -- CarDAO().findCarByNo(String no):CarDTO
 												   |
 												   |
 								find-ok.jsp : 차 정보 제공(car_no,model,price)
 											       or
 							findcar_fail.jsp : 차정보가 없습니다 alert 후 index로 이동
 	
 --%>
	<form action="front">
		<input type="hidden" name="command" value="findCarByNo">
		<span>차번호</span><input type="number" name="carNo" required="required">
		<input type="submit" value="검색">
	</form>
	<br><br>
	<%--
		command=getAllCarList --> GetAllCarListController --> CarDAO2().getAllCarList():ArrayList<CarDTO>()
										     |
										     |
										car-list.jsp[table 형식으로 carNo 와 model만 리스트로 제공]
										carNo역순
	 --%>
	<a href="front?command=getAllCarList">자동차리스트보기</a>
	
	<%--
		현재 jsp가 홈으로 실행되면 바로 front인 DispathcerServlet이 실행되도록 처리한다.
	 --%>
	<jsp:forward page="front">
		<jsp:param value="getAllCarList" name="command"/>
	</jsp:forward>
	
</body>
</html>