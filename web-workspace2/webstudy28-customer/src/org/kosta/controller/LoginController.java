package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.kosta.model.MemberDAO;
import org.kosta.model.MemberDTO;

public class LoginController implements Controller {

	@Override
	public String execute(HttpServletRequest requestm, HttpServletResponse response) throws Exception {
		String id = requestm.getParameter("id");
		String password = requestm.getParameter("password");	
		MemberDTO vo = MemberDAO.getInstance().login(id, password);
		String url="index.jsp";
		if(vo != null) {
			HttpSession session = requestm.getSession();
			session.setAttribute("user", vo);
		}else {
			url="redirect:index.jsp?fail=f";
		}
		return url;
	}

}
