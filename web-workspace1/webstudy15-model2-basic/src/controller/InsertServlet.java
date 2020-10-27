package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MockDAO;

/**
 * Servlet implementation class InsertServlet
 */
@WebServlet("/InsertServlet")
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String info = request.getParameter("customerInfo");
		System.out.println("InsertServlet Controller 실행");
		//model과 연동해서 Model을 업데이트
		MockDAO dao = new MockDAO();
		String viewUrl="insert-result.jsp";
		dao.insertCustomerInfo(info);
		/*forward 방식으로 테스트 : 클라이언트에서 재동작할 경우 다시 정보가 insert되려고 시도해서 문제가 발생할 수 있으므로 
		   					    redirect 방식으로 변경한다.		
		request.getRequestDispatcher(viewUrl).forward(request, response);
		*/
		
		//redirect 방식
		response.sendRedirect(viewUrl); //클라이언트(브라우저)에게 이동을 명령한다.
		
	}

}
