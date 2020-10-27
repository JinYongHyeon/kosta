package step5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionThree
 */
@WebServlet("/SessionThree")
public class SessionThree extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionThree() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<h1>"+getServletName()+"<br>");
		//기존 세션이 있는 지 확인햇 있으면 세션을 무효화시킨다(로그아웃 기능)
		//request.getSession(false) :  기존 세션이 있으면 반환하고 없으면 null 리턴
		HttpSession session = request.getSession(false);
		if(session != null) {
		request.getSession().invalidate();//세션을 무효화시킨다.
		out.println("기존 세션을 무효화시킴.. 로그아웃<br>");
		}else {
			out.println("세션이 없습니다.<br>");
		}
		out.println("<a href=SessionOne>SessionOne에서 확인</a><br>");
		out.println("<a href=SessionTwo>SessionTwo에서 확인</a>");
		out.println("</h1>");
		out.close();
	}

}
