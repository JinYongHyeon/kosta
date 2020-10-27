package stpe3;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;

import model.CarDAO;
import model.CarDTO;

/**
 * Servlet implementation class CarJSONServlet
 */
@WebServlet("/CarJSONServlet")
public class CarJSONServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CarJSONServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 *
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		ArrayList<CarDTO> carList = CarDAO.getInstance().getCarList(request.getParameter("maker"));
		JSONArray ja = new JSONArray(carList);
		out.print(ja.toString());
		out.close();
	}

}
