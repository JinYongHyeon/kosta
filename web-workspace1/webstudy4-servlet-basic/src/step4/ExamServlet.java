package step4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ExamServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	/**
	 * 검색 SELECT용
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=utf-8");
		String name = req.getParameter("userName");
		String nick = req.getParameter("userNick");
		
		PrintWriter pw = resp.getWriter();
		pw.println("<style>body{background-color:#8490f0;}</style>");
		pw.println("이름  : "+name+"<br>");
		pw.println("별명 : " +nick);
		pw.close();
	}
	/**
	 * CUD 생성,삭제,업데이트용
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html; charset=utf-8");
		
		String name = req.getParameter("userName");
		String nick = req.getParameter("userNick");
		
		PrintWriter pw = resp.getWriter();
		pw.println("이름  : "+name+"<br>");
		pw.println("별명 : " +nick);
		pw.close();
		
	}
	
	
	
	
}	
