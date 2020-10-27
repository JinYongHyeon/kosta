package step4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AjaxPostServlet
 */
@WebServlet("/AjaxPostServlet")
public class AjaxPostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjaxPostServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    	/**
	 * 
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter pw = response.getWriter();
		String pno = request.getParameter("pno");
		System.out.println("서버에서 pno 전달받음 : "+pno);
		pw.println(pno+"번 게시물을 삭제");
		pw.close();
	}

}
