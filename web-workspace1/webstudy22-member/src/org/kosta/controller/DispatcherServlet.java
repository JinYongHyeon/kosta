package org.kosta.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Front Controller Design Pattern : 모든 클라이언트의 요청을 한 곳으로 집중시켜 일관성있는 정책을 적용
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

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.handleRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		this.handleRequest(request, response);
	}
	/*
	 * 1. 모든 예외는 error.jsp로 응답한다.
	 * 2. 클라이언트가 전송한 command를 리턴받는다.
	 * 3. HandlerMapping에게 command 전달하여 개별 컨트롤러 객체를 리턴 받는다.
	 * 4. 개별 컨트롤러 객체를 실행시킨다.
	 * 5. 실행 후 리턴값에 의해 forward와 redirect 방식으로 각각 응답한다.
	 */
	protected void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		Controller controller = HandlerMapping.getInstance().create(request.getParameter("command").trim());
		try {
			String url = controller.execute(request, response);
			if(url.startsWith("redirect:")) {
				response.sendRedirect(url.substring(url.indexOf(":")+1));
			}else {
				request.getRequestDispatcher(url).forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("error.jsp");
		}
	}

}
