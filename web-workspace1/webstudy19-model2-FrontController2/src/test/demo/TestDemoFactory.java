package test.demo;
//FrontController 분화 시키는 과정을 확인하는 예제
class FrontServlet{
	public void handleRequest(String command) {
		if(command.contentEquals("select")) {
			System.out.println("차량정보조회작업");
		}else if(command.equals("register")) {
			System.out.println("차량등록작업");
		}
	}
}
//위 FrontServlet에서 모든 컨트롤러 로직을 처리한다면 코드량 증가 및 유지보수성이 낮아진다.
//아래 코드처럼 컨트롤러 로직을 분리시킨다.

class FrontServlet2{
	public void handleRequest(String command) {
		Controller c = null;
		if(command.contentEquals("select")) {
			c = new SelectCarController();
		}else if(command.equals("register")) {
			c = new RegisterCarController();
		}
		c.execute();// 다양성 컨트롤러 구현체를 단일한 방법으로 실행한다.
	}
}

interface Controller{
	public void execute();
}

class SelectCarController implements Controller{

	@Override
	public void execute() {
		System.out.println("차량정보조회작업");
	}
	
}

class RegisterCarController implements Controller{

	@Override
	public void execute() {
		System.out.println("차량등록작업");
	}
	
}

//FrontServletVer2 에서 기존에 작업하던 개별 컨트롤러 로직을 별도의 클래스(SelectController와 RegisterController...등)에서
//담당하게 하고 자신은 인터페이스에서 명시한 단일한 방법(execute())으로 실행하는 역할을 한다.
//but Ver2에서 사용자가 요청한 작업을 처리할 개별 컨트롤러 객체를 생성해야 하는 코드가 증가될 수 있다.
//Ver3 에서는 객체를 생성을 전담하는 Factory(객체공장)를 만들어 다시 역할을 분리한다.
class FrontServlet3{
	public void handleRequest(String command) {
		Controller c = HandleMapping.getInstance().create(command);
		c.execute();// 다양성 컨트롤러 구현체를 단일한 방법으로 실행한다.
	}
}
//객체 생성을 전담하는 공장(Factory) : 결합도를 낮추기 위해
//FrontServletVer3 과 개별 컨트롤러와의 결합도를 낮춘다.
class HandleMapping{
	private static HandleMapping instance = new HandleMapping();
	private HandleMapping() {}
	public static HandleMapping getInstance() {
		return instance;
	}
	public Controller create(String command) {
		Controller c = null;
		if(command.contentEquals("select")) {
			c = new SelectCarController();
		}else if(command.equals("register")) {
			c = new RegisterCarController();
		}
		return c;
	}
}
public class TestDemoFactory {
	public static void main(String[] args) {
		FrontServlet3 f3 = new FrontServlet3();
		f3.handleRequest("select");
		f3.handleRequest("register");
	}
}


//고런데 요렇게 나누면 FrontControlller 디자인 패턴을 사용 이유가 있나????????? 클래스를 만들고.... !??

