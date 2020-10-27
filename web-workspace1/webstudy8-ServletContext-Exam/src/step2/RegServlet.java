package step2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.java.swing.plaf.windows.WindowsTreeUI.CollapsedIcon;

import model.MemberVO;

/**
 * Servlet implementation class RegServlet
 */
public class RegServlet extends HttpServlet {
	//private ArrayList<MemberVO> memberList = new ArrayList<MemberVO>();
	//멀티 스레딩에 의해 공유되는 객체이므로 동기화 처리를 해준다.
	//private ArrayList<MemberVO> memberList;
	
	private List<MemberVO> memberList;
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void init() throws ServletException {
    	//init()메서드는 단 한번 실행되고 ServletContext에 객체를 사용할 수 있다.
    	//ServletContext에 list에 생성해 할당한다.
    	//memberList = new ArrayList<MemberVO>();
    	//동기화 처리된 리스트로 할당하는 것으로 변경해본다.
    	memberList = Collections.synchronizedList(new ArrayList<MemberVO>());
    	getServletContext().setAttribute("memberList", memberList);
    	//위에 ServletContext에 memberList = ArrayList 주소값을 가지고 있기 때문에 doGet()메소드 안에 둘 필요가 없다.
    	
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		
		
		String nick =request.getParameter("userNick");
		String email = request.getParameter("userEmail");
		memberList.add(new MemberVO(nick, email));
		
		//getServletContext().setAttribute("memberList",memberList);
		
		PrintWriter out = response.getWriter();
		out.println("<h1>"+nick+" 님 리스트에 등록 되었습니다.<br>");
		out.println("<a href=ListServlet>등록목록보기</a></h1>");
		out.close();
	}

}
