<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@page import="org.kosta.model.CarVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>EL 연습</title>
</head>
<body>
	<%	
		//컨트롤러에서 공유했다고 가정
		CarVO car1=new CarVO("1234","소나타",2000);
		request.setAttribute("cvo", car1);
	%>
	<h3>EL(Expression Language) 기본</h3>
	<ol>
		<li>
		기존 방식으로 출력(스크립틀릿) : <%CarVO c = (CarVO) request.getAttribute("cvo"); %>
		<%=c.getModel() %>
		</li>
		<li>
		EL 방식으로 출력 : ${requestScope.cvo.model} OR  생략형[requestScope] = ${cvo.model}
		</li>
			<%
				ArrayList<CarVO> list = new ArrayList<CarVO>();
				list.add(new CarVO("4321","현대",2100));
				list.add(new CarVO("5231","KIA",3000));
				list.add(new CarVO("5252","테슬라",4500));
				session.setAttribute("carList", list);
				//위 코드는 컨트롤러에서 할당했다고 가정한다.
			%>
		<li>
			<%	@SuppressWarnings("unchecked")
				ArrayList<CarVO> rList =(ArrayList<CarVO>) session.getAttribute("carList");
				CarVO c1 = rList.get(0);
			%>
			
			 기존 방식으로 세션영역의 ArrayList의 요소에 접근 : <%=c1.getModel() %>
			 
		</li>
		<li>
			 EL 방식으로 세션영역의 ArrayList의 요소에 접근 : ${sessionScope.carList[1].model} OR 
			 ${carList.get(0).model} OR ${carList[0].model} 내부적으로 배열 방식[]로 하는것도 가능
		</li>
		<li>
			<% 
				HashMap<String,CarVO> map = new HashMap<String,CarVO>(); 
				map.put("car1",new CarVO("333","모닝",1000));
				session.setAttribute("carMap",map);
				//컨트롤러에서 할당했다고 가정
			%>
			
			<%  @SuppressWarnings("unchecked")
				HashMap<String,CarVO> rMap = (HashMap<String,CarVO>)session.getAttribute("carMap");
				CarVO vo = rMap.get("car1");
			%>
				기존 방식으로 세션영역의 HashMap의 요소에 접근 : <%=vo.getModel()%>
		</li>
		<li>
			EL 방식으로 세션영역의 HashMap 요소에 접근 : ${sessionScope.carMap.car1.model} or ${carMap.car1.model}
		</li>
	</ol>
</body>
</html>