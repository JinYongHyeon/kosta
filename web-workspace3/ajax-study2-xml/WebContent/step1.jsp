<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ajax</title>
<script type="text/javascript">
	var xhr;
	function startAjax() {
		var makerComp = document.getElementById("maker");
		if (makerComp.value === "") {
			document.getElementById("carView").innerHTML=""; 
			//alert("메이커를 선택하세요");
			return;
		}
		xhr = new XMLHttpRequest();
		xhr.onreadystatechange = collback;
		xhr.open("get","FindCarServlet?maker="+makerComp.value);
		xhr.send(null);
		//alert("startAjax")
	}
	function collback(){
		var v = document.getElementById("carView")
		if(xhr.readyState == 4 && xhr.status==200){
		v.innerHTML=xhr.responseText;
		}
	}
</script>
</head>
<body>
	<select id="maker" onchange="startAjax()">
		<option value="">---</option>
		<option value="현대">현대</option>
		<option value="르노">르노</option>
		<option value="기아">기아</option>
	</select>
	<span id="carView"></span>
</body>
</html>