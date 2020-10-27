<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ajax(JSON을 이용하여 통신)</title>
<script type="text/javascript">
	var xhr;
	var modelComp;
	var priceComp;
	
	function startAjax() {
		//alert("startAjax");
		modelComp = document.getElementById("modelView");
		priceComp = document.getElementById("PriceView");
		var makerComp = document.getElementById("maker");
		if (makerComp === "") {
			modelComp.innerHTML = "";
			priceComp.innerHTML = "";
			return;
		}
		xhr = new XMLHttpRequest();
		//요청에 대한 응답이 완료되면 실행될 함수 등록
		xhr.onreadystatechange = function() {
			if (xhr.readyState == 4 && xhr.status == 200) {
				//alert(xhr.responseText);
				//응답받은 정보를 json (javascript object) 으로 변환
				var json = JSON.parse(xhr.responseText);
				//alert(json.model);
				//alert(json.price);
				modelComp.innerHTML = json.model;
				priceComp.innerHTML = json.price;
			}
		}

		xhr.open("get", "FindCarJSONServlet?maker=" + makerComp.value);
		xhr.send(null);
	}
</script>
</head>
<body>
	<select id="maker" onchange="startAjax()">
		<option value="">---</option>
		<option value="현대">현대</option>
		<option value="르노">르노</option>
		<option value="기아">기아</option>
	</select> 모델
	<span id="modelView"></span> 가격
	<span id="PriceView"></span>
</body>
</html>