package step3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FindMemberAjaxServlet
 */
@WebServlet("/FindMemberAjaxServlet")
public class FindMemberAjaxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FindMemberAjaxServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		response.setContentType("text/html;charset=utf-8");

		PrintWriter pw = response.getWriter();
		// ajax 비동기 통신 응답이므로 필요한 데이터만 응답한다.
		String id = request.getParameter("userId");
		if (id != null && id.equals("java")) {
			pw.println("이름 : 홍길동, 주소 : 판교");
		} else {
			pw.println(id + "아이디에 대한 회원정보가 없습니다.");
		}
		pw.close();

	}

}
