package step3;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

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
	
    //private ArrayList<MemberVO> list;
	private List<MemberVO> list;
	

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListServlet() {
        super();
    }
    
    @Override
    public void init() throws ServletException {
    	//list = (ArrayList<MemberVO>) getServletContext().getAttribute("memberList");
    	list = (List<MemberVO>) getServletContext().getAttribute("memberList");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		for(int i=0; i<list.size();i++) {
			out.println("<h1>"+i+". "+list.get(i).getNick()+" ");
			out.println(list.get(i).getEmail()+"");
		}
		out.println("<br><a href=index.html>home으로</a></h1>");
		out.close();
	}

	
}
