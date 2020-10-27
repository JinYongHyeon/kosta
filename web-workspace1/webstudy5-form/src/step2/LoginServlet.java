package step2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		String id= request.getParameter("memberId");
		String pass = request.getParameter("memberPass");
		String email = request.getParameter("memberEmail");
		PrintWriter pw = response.getWriter();
		pw.println("<h3>아이디  : " + id+"</h3>");
		pw.println("<h3>비밀번호 : " + pass+"</h3>");
		pw.println("<h3>비밀번호 : " + email+"</h3>");
		pw.close();
	}

}
