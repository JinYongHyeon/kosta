package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.kosta.model.MemberDAO;
import org.kosta.model.MemberVO;

public class LoginController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		
		MemberVO mvo =MemberDAO.getInstance().login(id, pass);
		String url=null;
		if(mvo != null) {
			HttpSession session = request.getSession();
			session.setAttribute("member", mvo);
			url ="redirect:front?command=getAllPostList";
		}else {
			url ="redirect:member/login-fail.jsp";
		}
		return url;
	}

}
