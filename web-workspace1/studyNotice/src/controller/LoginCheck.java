package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.User;

import model.UserDAO;

/**
 * Servlet implementation class loginCheck
 */
@WebServlet("/LoginCheck")
public class LoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginCheck() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("userId");
		String pass = request.getParameter("userPass");
		UserDAO dao = UserDAO.getInstance();
		try {
			boolean check = dao.loginCheck(id, pass);
			if (check) {
				response.sendRedirect("ListNotice");
			} else {
				PrintWriter out = response.getWriter();
				out.println("<script>alert(계정이 존재하지 않습니다)</script>");
				response.sendRedirect("index.jsp");
				out.close();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
