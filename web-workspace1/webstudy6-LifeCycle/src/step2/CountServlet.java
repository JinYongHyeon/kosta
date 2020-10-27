package step2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CountServlet
 */
public class CountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private int count;//접속수 저장
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CountServlet() {
        super();
        System.out.println("CountServlet 객체 생성");
        // TODO Auto-generated constructor stub
    }
    @Override
    public void init() throws ServletException {
    	System.out.println("init() 실행");
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter pw = response.getWriter();
		pw.println("<h3>안녕하세요 한국에서 온 용현입니다.");
		pw.println("접속수 : "+ ++count);
		pw.println("</h3>");
		pw.close();
	}
	@Override
	public void destroy() {
		System.out.println("destroy() 실행");
	}


}
