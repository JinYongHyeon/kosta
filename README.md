<H1>KOSTA203기 자료</H1>

<ul>
  <li>1.Java SE WorkSpace</li>
  <li>2.Java(JDBC) WorkSpace</li>
  <li><a href="https://github.com/JinYongHyeon/kosta/tree/master/%EC%BD%94%EB%94%A9%ED%85%8C%EC%8A%A4%ED%8A%B8">3.코딩테스트 공부</a></li>
  <li>20년09월03일 수업일지
    <hr>
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
   <hr>
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
 <li>20년09월14일 수업일지
 <hr>
 <ol>
 	<li>DBCP(DataBase Connection Pool) : 데이터베이스 연동시 컨넥션을 생성하고 소멸시키는 것이 아니라 미리 생성한 컨넥션을 빌려고오고
반납받는 형식으로 시스템 성능 향상을 위해 사용.(DBCP WAS ex) tomcat 제공하는 dbcp 생성)
	<ol>
		<li>import javax.sql.DataSource(interface) : 타입으로 DBCP를 관리한다.<br>인터페이스 관리하는 이유 :  WAS가 변경되면 dbcp도 변경될 수 있으므로 추상화된 인터페이스 타입으로 관리하는 것이유지보수에 유리하다.
		</li>
		<li>
		setInitialSize(3) : //처음 로드될 때 생성해 놓을 컨넥션 수 <-- 예상인원을 생각해서 미리 만들어놈<br>
		setMaxTotal(10);//최대 컨넥션 수 : defualt 8 , Synchronized을 이용해 단일 스레드 변경하고 컨넥션 연결이 Full경우 wait()을 걸어
		컨넥션을 반납할 때까지 대기 시킨다.
		</li>
	</ol>
</li>

<li>반응형 웹(Media Query) : 다양한 기기(모바일, 태블릿,pc)에 최적화된 화면을 제공하는 것을 말함.
 		<ol>
 			<li>HTML5, CSS3에 의해 지원되는 미디어 쿼리는 반응형 웹의 핵심기술이다.</li>
 			<li>미디어쿼리는 화면의 종류와 크기에 따라 디자인을 달리 주는 CSS 기술.</li>
 			<li>미디어쿼리를 사용하기 위한 선언부 (뷰메타태그)  : [meta name="viewport" content="width=device-width, initial-scale=1] </li>
 		</ol>
 	</li>
 	
<li>Bootstrap : 반응형 웹 사이트를 개발하기 위한 HTML,CSS,JAVASCRIPT 프레임워크.
 		<ol>
 			<li>Bootstrap 그리드 시스템을 사용 할때 모든 행은 반드시 .container(고정너비) or .container-fluid(전체너비) 안에 정의해야한다.</li>
 			<li>grid column 공간이 12이다.</li>
 			<li>col-*-* 클래스를 사용할 때 row class 안에 넣어야 한다. 이유는 row는 수평의 컬럼 모음을 만드길 위해서이다.
 				그냥 row class를 안쓰고 div안에 했을 때는 수평이 유지가 안됨 --> 확대를 했을 때 깨짐 row를 적용하면 확대를 할 때
 				안깨짐 
 			</li>
 			<li> col-xs-*(768이하) 모바일 폰 / col-sm-*(768이상) 태블릿 / col-md-*(992이상) 중간기기 데스크탑 / col-lg-*(1200이상) 큰기기 데스크탑</li>
  			<li>offset : 사용하면 * 열만큼 오른쪽으로 이동한다. ex) div class = col-sm-5 / div class = col-sm-5 col-sm-offset-2(첫번째 div가 5칸을 차지하고 두번재 div에서 offset 사용하여 2칸 뛰고 5칸을 차지한다. </li>
 		</ol>
 	</li>
 </ol>
 </li>
 <li>20년09월15일 수업일지<hr>
 	<ol>
 		<li>jsp:Action Tag<ol>
 			<li>jsp:forward : 요청을 다른 자원을 전달(forward방식) -- 바로 db 들려야 할때 사용</li>
 			<li>jsp:include : header 나 footer 같은 고정적으로 만들어서 사용할 때 사용</li>
 		</ol>
 		</li>
 		<li>UML : UseCaseDiagram
 			<ol>
 				<li>Use Case : 사용자 관점의 기능단위(서비스단위)</li>
 				<li>Actor : 시스템 외부에 존재하면서 시스템과 상호작용하는 개체</li>
 				<li>include : 기본 유즈케이스가 실행되기 위해서는 반드시 다른 특정 유즈케이스의 행위를 포함해야 한다는 것을 의미</li>
 				<li>extends유즈케이스가 특정 유즈케이스에 정의된 행위로 선택적으로 추가 확장될 수 있다는 것을 나타낸다. </li>
 				<li>Generalization(일반화) : 기능의 추가 관계 아님. 개념의 확대로 봐야 함</li>
 			</ol>
 		</li>
 	</ol>
 </li>
</ul>

