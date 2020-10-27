package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ProductDAO;
import model.ProductVO;

/**
 * Servlet implementation class FindProductByIdServlet
 */
@WebServlet("/FindProductByIdServlet")
public class FindProductByIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindProductByIdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductDAO dao = ProductDAO.getInstance();
		String id = request.getParameter("productId");
		try {
			ProductVO vo =dao.findProductById(id);
			String viewName=null;
			if(vo !=null) {
				request.setAttribute("vo", vo);
				viewName = "find_ok.jsp";
			}else {
				request.setAttribute("id", id);
				viewName = "find_fail.jsp";
			}
			request.getRequestDispatcher(viewName).forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
