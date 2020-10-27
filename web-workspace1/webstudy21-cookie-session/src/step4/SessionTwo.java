package step4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionTwo
 */
@WebServlet("/SessionTwo")
public class SessionTwo extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionTwo() {
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
		//기존 세션이 있으면 기존 세션을 반환,없으면 null을 리턴
		HttpSession session = request.getSession(false);//기존 세션이 있는 지 유무를 판단
		if(session != null) {
			out.println("세션 아이디 : "+session.getId()+"<br>");
			out.println("세션 챔피언 : "+session.getAttribute("nick")+"<br>");
			out.println("세션 시간 : "+session.getAttribute("time")+"<br>");
		}else {
			out.println("세션이 없습니다.<br>");
		}
		out.println("<a href=SessionOne>SessionOne에서 확인</a><br>");
		out.println("<a href=SessionThree>SessionThree에서 확인</a>");
		out.println("<br><a href=sessiontest1.jsp>sessiontest1.jsp로 이동</a>");
		out.println("<br><a href=sessiontest2.jsp>sessiontest2.jsp로 이동</a>");
		out.println("</h1>");
		out.close();
	}

}
