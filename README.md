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
 <li>20년09월16일 수업일지<hr>
 <ol>
 	<li>EL : JSP 버전이 상향되면서 추가된 스크립트 언어
 		<ol>
 			<li>기존 사용 방식 JSP 버전이 상향되면서 추가된 스크립트 언어 </li>
 			<li>EL 방식 ${requestScope.mvo.name} OR ${mvo.name} // requestScope 생략가능(내부적으로 탐색함)</li>
 			<li>EL 방식은 내부적으로 형변환을 해준다 EX)Integer.parseInt()</li>
 			<li>EL 방식을 이용하면 null일 경우 화면에 표현하지 않는다. --> 값은 null은 전달한다.[기존은 Null 화면에 뿌려줌]</li>
 		 <li>EL에서 Model에 접근 가능한 메서드는 get계열과 is계열 메서드만 가능 is계열 메서드는 리턴타입이 boolean일때 사용</li>
			<li>${pageContext.request.contextPath } : /projcetName 뽑아옴 [웹컨텍스트 (or 웹프로젝트명)을 출력]
			<li>JSP 내장객체 종류
				<ol>
					  <li>pageContext : 다른 내장객체를 생성하는 역할 // Context -- > 환경설정</li>
					  <li>pageScope  : JSP가 서블릿으로 변환되었을 때 Servlet 객체 자신(this)</li>
					  <li>requestScope : request 객체에 접근하기 위한 역할</li>
					  <li>sessionScope : session 객체에 접근하기 위한 역할</li>
					  <li>applicationScope : application 객체 (ServletContext 객체) 객체에 접근하기 위한 역할</li>
					  <li>Scope 부분을 스킵을 할 경우 name이 동일 할 때 유효범위가 작은 것으로 사용한다. (request>session>application[ServletContext]) </li>
				</ol>
			</li>
			<li>EL 파라미터 제어
				<ol>
					 <li>param : request.getParameter();</li>
			 		 <li>paramValues : request.getParameterValues(); </li>
			 		 <li>initParam : application.getInitParameter()</li>
				</ol>
			</li>
 		</ol>
 	 </li>
 	 <li>JSTL : JSP 표준라이브러리(JSP Standard Tag Library) JSP에서 자주 사용하는 기능(반복과 조건 , 데이터 표현등)을
미리 구현해 놓은 커스텀 태그 라이브러리 모음 JSTL은 EL(Expression Language)를 사용하여 표현한다.
	<ol>
		<li>jsp 선언부에 jstl을 사용하기 위한 taglib 를 명시한다. <%@ taglib prefix="	c" uri="http://java.sun.com/jsp/jstl/core" %></li>
		<li> c:if (test): test 테스트 조건 가공되다</li>
		<li> c:choose : if else 사용할 때 사용 / choose 안에 when과 otherwise 조건문으로 사용
			<ol>
				<li>c:when : if or else if 역할</li>
				<li>c:otherwise else 역할</li>
			</ol>
		</li>
		<li> c:forEach : JSTL for loop
			<ol>
				<li> var : 요소를 저장할 변수</li>
				<li> varStatus : index와 count 속성이 있다.</li>
				<li>item : 대상 배열 또는 컬렉션 </li>
			</ol>
		</li>
	</ol>
</li>
 </ol>
 </li>
<li>20년09월17일 수업일지<hr>
<ol>
<li>c:forEach : JSTL for loop
	<ol>
		<li>begin : 시작 </li>
		<li>end : 끝</li>
		<li>JSTL forEach로 map의 key와 value를 순차적으로 출력  : ${variable.key} : key값 ${variable.value} value값 </li>
	</ol>
</li>
<li>c:set : Bean, Map등에 값을 설정을 하거나, 일반 변수를 생성해서 값을 할당 할 수 있습니다. </li>
<li> jsp:include 와 c:import 차이
<ol>
	<li>jstl import를 이용해 다른 웹어플리케이션의 자원을 가져와 본다.</li>
	<li>jsp:include는 자신의 웹어플리케이션 내의 자원만 가져올 수 있다.</li>
<ol>
</li>
</ol>
</li>
<li>20년09월18일 수업일지<hr>
	<ol>
		<li>sessionScope
			<ol>
				<li>page 지시어에서 session 속성을 false 로 설정했을 경우에는 session 객체에 저장한 빈 객체를 사용할 수 없다.</li>
				<li><%@ page session="false"%> 설정을 하면 JSP 페이지에서 session 내장 객체를 사용하지 않겠다는 의미가 되므로 session 내장 객체를 사용할 수 없고 따라서 sessionScope 도 사용할 수 없게 된다.</li>
			</ol>
		</li>
		<li>경로 설정<ol>
		<li>client  측에 도달되는 html, css, javascript는 / 를 명시할 경우 port 다음으로 정보를 찾게 된다.</li>

<li>server 측에 실행되는 foward, include (or jstl import)는 /를 명시할 경우 자신의 웹컨텍스트(웹어플리케이션명) 다음에서 정보를 찾게 된다.</li>
<li>
html, javascript, css는 ${pageContext.request.contextPath}/를 명시해서 웹어플리케이션 아래에서 정보를 찾게 하면 된다.
</li>
</ol>
	</li>
	</ol>
</li>
<li>20년09월21일 공부일지<hr>
<ol>
	<li>layout or login-layout.jsp : 템플릿을 만들어서 session을 통해 session이 존재하지 않을경우에는 layout으로 존재할 경우
	login-layout으로 이동시켜 request.setAttribute으로 메인페이지  url을 설정을 하여 c:import 을 통해 메인페이지를 보여준다. 
	</li>
</ol>
	
</li>
</ul>
