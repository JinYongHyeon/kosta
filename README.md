<H1>KOSTA203기 자료</H1>

<ul>
  <li>1.Java SE WorkSpace</li>
  <li>2.Java(JDBC) WorkSpace</li>
  <li>20년09월03일 수업일지
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
 <li>20년09월04일 수업일지
 	<ol>
 		<li>DataBase DATE연산
 			<ol>
 				<li>DATE타입은 데이터베이스 시간(년,월,일,시,분,초)을 관리하는 타입</li>
 				<li>sysdate 키워드 : 현재 시간을 표현하는 키워드</li>
 				<li>주요 함수 <ol>
 					<li>TO_CHAR() : 데이터베이스에 저장된 DATE형의 정보를 문자열로 반환받을 때 사용<br>
 					사용법 : TO_CHAR(SYSDATE,'YYYY/MM/DD HH24:MI:SS') == 년,월,일 시,분,초
 					 </li>
 					<li>TO_DATE() : 문자타입의 시간 정보를 데이터베이스의 DATE형으로 변환해 저장할 때 사용 <br>
 					※웹 어플리케이션에서 시간 정보를 전달받아 DB에 저장하기 위해 주로 사용 <-- EX)생년월일※<br>
 					사용법 : TO_DATE('1989.1.7 5:20:33','YYYY.MM.DD HH24:MI:SS') == 년,월,일,시,분,초
 					</li>
 				</ol></li>
 				<li>데이터 타입으로 연산도 가능 : SELECT ID,MYDATE ,MYDATE-1 AS 하루전 FROM DATA_TEST;</li>
 				<li>TRUNC() : 소수점 이하는 버릴 때 쓰는 함수 </li>
 				<li>MONTHS_BETWEEN(현재시간,등록시간) : ~개월차이 볼 떄 쓰는 함수</li> 				
 			</ol>
 		</li>
 		<li>DATE연산자를 이용한 Servlet&JSP
 			<ol>
 				<li>상품등록 : 상품 아이디(시퀀스)처리,상품 등록일(SYSDATE), 상품등록폼에서 이름,제조사,가격 입력 후 DAO에서 처리작업</li>
 				<li>상품 전체리스트 : 상품 전체리스트 링크를 클릭시 DAO에서 SELECT 후 Collection계열인 ArrayList<VO> 리턴 값을 받아
 					상품 전체리스트 폼에 뿌려준다.
 				</li>
 				<li>상품 상세리스트 : 상품 전체리스트폼에서 상품이름을 클릭시 링크를 통해 id값을 저장해 DAO전달하여 SELECT 에서 ID PRIMARY KEY 을 찾아서 있을경우 상품 상세리스트폼에 뿌려주고 존재하지 않을경우 alert알림을 통해 존재하지 않는 알림 후 index.jsp페이지로 이동시킨다.</li>
 			</ol>
 		</li>
 	</ol>
 </li> 
</ul>
