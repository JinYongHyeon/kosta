package step2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MemberVO;

/**
 * Servlet implementation class ListServlet
 */
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private ArrayList<MemberVO> list;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	@Override
    public void init() throws ServletException {
    list =(ArrayList<MemberVO>) getServletContext().getAttribute("list");
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		for(int i=0;i<list.size();i++) {
			out.println(list.get(i).getName() + " , "+list.get(i).getAddress()+"<br>");
		}
		out.println("<br><a href=index.html>home</a>");
		out.close();
	}

}
