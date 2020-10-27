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
 * Servlet implementation class RegisterCarServlet
 */
@WebServlet("/RegisterCarServlet")
public class RegisterCarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterCarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String carId = request.getParameter("carId");
		String owner = request.getParameter("owner");
		String model = request.getParameter("model");
		String address = request.getParameter("address");
		MockDAO dao = MockDAO.getInstance();
		dao.registerCar(new CarVO(carId, owner, model, address));
		//클라이언트가 재요청시 동작이 반복될 수 있다(insert 시에는 적합하지 않다)
		response.sendRedirect("car-register-result.jsp");
	
	}

}
