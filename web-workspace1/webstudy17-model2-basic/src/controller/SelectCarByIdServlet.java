package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CarVO;
import model.MockDAO;

/**
 * Servlet implementation class SelectCarByIdServlet
 */
@WebServlet("/SelectCarByIdServlet")
public class SelectCarByIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectCarByIdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("carId");
		String urlName = null;
		MockDAO dao = MockDAO.getInstance();
		CarVO vo = dao.selectCarById(id);
		if(vo!=null) {
			request.setAttribute("vo", vo);
			urlName="selectcar-ok.jsp";
		}else {
			urlName="selectcar-fail.jsp";
		}
		request.getRequestDispatcher(urlName).forward(request, response);
	}

}
