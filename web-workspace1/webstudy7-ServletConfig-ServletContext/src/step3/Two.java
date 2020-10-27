package step3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Two
 */
public class Two extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Two() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<h1><br><br>");
		String name = getServletConfig().getServletName();
		out.println(name);
		String dbUrl=getServletConfig().getServletContext().getInitParameter("dbUrl");
		out.println("<br>ServletContext에서 dbUrl 받아옴 : " + dbUrl);
		//One Servlet에서 ServletContext에 할당한 nick 정보를 반환받는다.
		String nick = (String)getServletContext().getAttribute("nick");//오브젝트로 받아서 down casting
		out.println("servletContext에  nick을 할당" +nick);
		out.println("<br><a href=One>One Servlet 실행</a>");
		out.println("<br><a href=ContextTest.jsp>contextTest.jsp 이동</a>");
		out.println("</h1>");
		out.close();
	}

}
