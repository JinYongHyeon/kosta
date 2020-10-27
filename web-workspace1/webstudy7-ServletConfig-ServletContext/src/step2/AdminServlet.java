package step2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdminServlet
 */
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<h1> 관리자 모드<br><br>");
		//adminEmail과 adminTel이 필요
		
		/* 하드코딩 -> 변경 시 소스코드를 수정, 유지보수성이 낮다
		String adminEdmail="yh@gmail.com";
		String telEmail="0123456";
		*/
		//ServletConfig을 이용해 이메일과 Tel을 반환
		String adminEmail = getServletConfig().getInitParameter("adminEmail");
		String adminTel = getServletConfig().getInitParameter("adminTel");
		out.println("이메일  : "+adminEmail+"<br>전화번호 : " +adminTel);
		out.println("<br>servletContext 객체 : "+this.getServletConfig().getServletContext());
		out.println("</h1>");
		out.close();
	}

}
