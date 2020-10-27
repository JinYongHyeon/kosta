package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.kosta.model.MemberDAO;
import org.kosta.model.MemberVO;

public class LoginController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String id = request.getParameter("userId");
		String password = request.getParameter("userPass");
		MemberVO vo = MemberDAO.getInstance().login(new MemberVO(id, password));
		String url = null;
		if(vo != null) {
			HttpSession session = request.getSession();
			session.setAttribute("user", vo);
			url = "redirect:login-ok.jsp";
		}else {
			url = "redirect:login-fail.jsp";
		}
		return url;
	}

}
