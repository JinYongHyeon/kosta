package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoutOutController implements Controller {

	@Override
	public String execute(HttpServletRequest requestm, HttpServletResponse response) throws Exception {
		HttpSession session  = requestm.getSession(false);
		if(session != null) {
			session.invalidate();
		}
		return "redirect:index.jsp";
	}

}
