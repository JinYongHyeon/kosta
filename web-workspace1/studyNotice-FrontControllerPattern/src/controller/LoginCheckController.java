package controller;

import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.UserDAO;

public class LoginCheckController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("userId");
		String pass = request.getParameter("userPass");
		UserDAO dao = UserDAO.getInstance();

		boolean check = dao.loginCheck(id, pass);
		if (check) {
			return "FrontController?command=ListNotice";
		} else {
			PrintWriter out = response.getWriter();
			out.println("<script>alert(계정이 존재하지 않습니다)</script>");
			out.close();
			return "redirect:index.jsp";
			
		}

		
	}

}
