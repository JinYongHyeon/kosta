package step1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LifeCycleServlet
 */
public class LifeCycleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LifeCycleServlet() {
		super();
		System.out.println(getClass().getName() + " 객체 생성");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init() throws ServletException { //기초작업
		System.out.println("init 실행");
	}
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("service메서드 계열인 doGet() 실행");
	}
	
	@Override
	public void destroy() { //죽기전에 백업
		System.out.println("destory() 실행");
	}
	

}
