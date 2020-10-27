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
 * MVC의 Front Controller 역할을 담당 모든 클라이언트의 요청을 처리한다.
 */
@WebServlet("/front")
public class DispathcerServler extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DispathcerServler() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.handleRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// post 방식 한글처리
		request.setCharacterEncoding("utf-8");
		this.handleRequest(request, response);
	}

	/**
	 * 모든 클라이언트 요청을 처리
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			Controller controller = HandlerMapping.getInstance().create(request.getParameter("command"));
			String url = controller.execute(request, response).trim();
		if (url.startsWith("redirect:")) {
				response.sendRedirect(url.substring(url.indexOf(":") + 1));
			} else {
				request.getRequestDispatcher(url).forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("error.jsp");
		}

	}
}
