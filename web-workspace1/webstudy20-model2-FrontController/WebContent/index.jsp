<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	*{color:#fff; font-weight: bold; list-style:none; font-size:36px;}
	body{background-image: url("https://event.burgerking.co.kr/guinnesswhopper/pc/resources2/images/bg_coupon.jpg");}
</style>
</head>
<body>
<h1 style="text-align:center;">버거킹 기네스 비싸... ㅡㅡ</h1>
<h4>Model2(MVC+FrontController) 상품관리</h4>
<ul>
	<%--
			DispatcherServlet(TotalCountContoller)에서 요청처리 후 count-view.jsp에서 응답
	 --%>
	<li><a href="front?command=TotalCountContoller">전체상품수 조회</a></li>
	<li><a href="find-product-form.jsp">상품검색 조회</a></li>
	<%--
			index -- front -- HandlerMapping -- ProductListController - ProductDAO.getAllProductList()
					   |
					   | --(forward)
				product-list.jsp
			(command=getallproductlist)
	 --%>
	<li><a href="front?command=getallproductlist">전체상품리스트</a></li>
	<%--
			command = getmakerproductlist --> MakerProductListController <--> ProductDAO
													    |
													    | --(forward)
													    |
													    |
												   maker-from.jsp(제조사를 라디오 버튼으로 보여준다)
	 --%>
	<li><a href="front?command=getmakerproductlist">제조사 리스트보기</a></li>
	<li><a href="register-product.jsp">상품등록화면</a></li>
</ul>
</body>
</html>

<%--

	setParmeter("command",TotalCountContoller")
 --%>