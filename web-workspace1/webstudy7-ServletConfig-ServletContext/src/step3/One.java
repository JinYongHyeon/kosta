package step3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class One
 */
public class One extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public One() {
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
		out.print("차이점? : "+ getServletContext().getInitParameter("dbUrl"));
		//ServletContext에 특정 정보를 할당
		getServletContext().setAttribute("nick", "홍길동");
		out.println("servletContext에  nick을 할당" + getServletContext().getAttribute("nick"));
		out.println("<br><a href=Two>two Servlet 실행</a>");
		out.println("<br><a href=ContextTest.jsp>contextTest.jsp 이동</a>");
		out.println("</h1>");
		out.close();
	}
	

}

