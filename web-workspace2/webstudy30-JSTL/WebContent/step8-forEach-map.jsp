<%@page import="oracle.net.aso.i"%>
<%@page import="java.util.Iterator"%>
<%@page import="org.kosta.model.PersonVO"%>
<%@page import="java.util.LinkedHashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>jstl forEach map</title>
</head>
<body>
	<%
		LinkedHashMap<String, PersonVO> map = new LinkedHashMap<String, PersonVO>();
	map.put("a", new PersonVO("홍길동", 23));
	map.put("b", new PersonVO("코난", 24));
	map.put("c", new PersonVO("닥터", 25));
	session.setAttribute("personMap", map);
	%>
	<h1>기존 scriptlet 방식으로 세션에 저장된 map의 key와 value를 출력</h1>
	<%	
		//rMap의 key와 value를 순차적으로 출력
		//set으로부터 iterator()를 호출해서 Iterator 객체를 반환
		//Iterator 의 hasNext() 와 next()를 이용해서 key를 추출,
		//추출한 key로부터 rMap의 key에 해당하는 value를 rMap.get(key) 형태로 반환
		LinkedHashMap<String, PersonVO> rmap = (LinkedHashMap<String, PersonVO>) session.getAttribute("personMap");		
		Iterator iterator =  rmap.keySet().iterator();
		while(iterator.hasNext()){
			String key =(String) iterator.next();
	%>
	key : <%=key %> |  value : <%=rmap.get(key).getName() %> <%=rmap.get(key).getAge()%><br>
	<%
		}
	%>
	<hr>
	<H1>JSTL forEach로 map의 key와 value를 순차적으로 출력</H1>
	<c:forEach items="${sessionScope.personMap}" var="person">
		key : ${person.key} value : ${person.value.name}<br>
 	</c:forEach>
</body>
</html>