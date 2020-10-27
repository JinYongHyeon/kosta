package org.kosta.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DispatcherServlet
 */
@WebServlet("/front")
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
		this.HandleRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		this.HandleRequest(request, response);
	}
	/*
	 * 1.try catch : 예외 발생시  error.jsp로 redirect 시킨다.
	 * 2.Client가 보낸 command를 반환받는다.
	 * 3.HandlerMapping을 이용해 개별 컨트롤러 객체를 Controller interface type으로 반환받는다.
	 * 4.개별 컨트롤러 객체를 실행시킨다.
	 * 5.개별 컨트롤러 객체가 실행 후 반환한 정보를 이용해 응답하기 위해  redirect or forward 방식으로  view로 이동한다.
	 */
	protected void HandleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String command = request.getParameter("command").trim();
			Controller controller = HandlerMapping.getInstance().create(command);
			String url = controller.execute(request, response);
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
