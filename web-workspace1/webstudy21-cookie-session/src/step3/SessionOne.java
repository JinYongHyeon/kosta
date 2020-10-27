package step3;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionOne
 */
@WebServlet("/SessionOne")
public class SessionOne extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionOne() {
        super();
        // TODO Auto-generated constructor stub
    }

	/*
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<h1>"+getServletName()+"<br>");
		//기존 세션이 없으면  새로 세션을 생성, 만약 기존 세션이 있으면 기존 세션을 반환
		HttpSession session = request.getSession(); //내부적으로 쿠키를 이용해 세션 유무 검사	
		session.setAttribute("nick", "야스오");
		session.setAttribute("time", new Date());
		System.out.println("session ID : "+ session.getId());//내부적으로 이 세션 아이디가 클라이언트에 쿠키로 저장(WAS에서 작업)
		out.println("session ID : "+ session.getId()+"<br>");
		out.println("<a href=SessionTwo>SessionTwo에서 확인</a>");
		out.println("</h1>");
		out.close();
	}

}
