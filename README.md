<H1>KOSTA203기 자료</H1>

<ul>
  <li>1.Java SE WorkSpace</li>
  <li>2.Java(JDBC) WorkSpace</li>
  <li>20년09월03일 공부일지
  	<ol>
  		<li>회원가입
  			<ol>
  				<li>아이디 중복 체크작업 : javascript = window.open(url,name,option)을 이용하여 팝업창을 띄운 동시에 Contoller <--> DAO(DB작업)을 통해 아이디가 중복 시 register-idCheck-fail.jsp 팝업을 띄우고 중복이라는 메시지를 클라이언트에게 알려주고 팝업에 버튼을 누르면 팝업이 종료가 된다. 반대로 중복이 아닐 시 registeridCheck-ok.jsp 팝업을 띄우고 중복이 아니라는 메세지를 클라이언트에게 알려주고  팝업에 버튼을 누르면 팝업이 닫히기 전에 opener(팝업 요청한 곳).document.폼이름.컴포넌트 이름.value= ID <-- input[type=hidden] 을 저장해줘서 회원가입 창에서 최종적으로 회원가입(submit)을 할 때 input[type=hidden]영역에 저장 된 아이디와 아이디 필드랑 비교를 해서 같을 경우 true을 반환을  하고 정상적으로 기능을 한다. </li>
  				<li>패스워드 재확인체크작업 : 2개의 password 필드를 가지고 javascript에서 value값을 가져와 둘이 값으면 true값을 넘겨주고 값이 같지 않을경우  false을 넘겨줘서 alert을 통해 비밀번호가 맞지 않다고 알려준다.</li>
            </ol></li>
  	<li>내 정보 : session에 유지된 user정보를 넘겨줘서 클라이언트에게 알려준다.</li>
  		<li>내 정보 수정 : session에 유지된 user 정보를 form 영역 안에 필드에 각각 넣어주고 id는 변경 불가로 만들고 그 외에 변경하고 싶은 내용을 작성
  		후 전송을 통해 DB작업이 정상적으로 끝났을 때   session을 불러와 user에 담겨있는 정보를 재활당을 해준다.
  		</li>
  	</ol>
  			
  		
  </li>
  
</ul>
