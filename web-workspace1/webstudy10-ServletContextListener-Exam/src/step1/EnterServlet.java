package step1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MemberVO;

/**
 * Servlet implementation class EnterServlet
 */
public class EnterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ArrayList<MemberVO> list;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EnterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	@Override
    public void init() throws ServletException {
    	 list =(ArrayList<MemberVO>) getServletContext().getAttribute("list");
    }
    
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		
		list.add(new MemberVO(name, address));
		PrintWriter out = response.getWriter();
		out.println(name + " , " + address);
		out.println("<a href=ListServlet>이동</a>");
		out.close();
	
	}

}
