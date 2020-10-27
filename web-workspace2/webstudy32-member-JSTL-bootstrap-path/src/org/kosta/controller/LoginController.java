package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.kosta.model.MemberDAO;
import org.kosta.model.MemberVO;

public class LoginController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String url=null;
		String id=request.getParameter("id");
		String password = request.getParameter("password");
		MemberVO vo = MemberDAO.getInstance().login(id, password);
		if(vo != null) {
			HttpSession session = request.getSession(); 
			session.setAttribute("user", vo);
			url="redirect:index.jsp";
		}else {
			url="member/login-fail.jsp";
		}
		return url;
	}

}
