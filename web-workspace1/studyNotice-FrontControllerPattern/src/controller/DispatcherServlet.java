package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DispatcherServlet
 */
@WebServlet("/FrontController")
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DispatcherServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.headleRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		this.headleRequest(request, response);
	}

	protected void headleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Controller c = HandlerMapping.getInstance().create(request.getParameter("command").trim());
		try {
			String redirect = c.execute(request, response).trim();
			if (redirect.startsWith("redirect:")) {
				response.sendRedirect(redirect.substring(redirect.indexOf(":") + 1));
			} else {
				request.getRequestDispatcher(redirect).forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
