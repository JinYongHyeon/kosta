package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.MemberDAO;

public class CountController implements Controller {

	@Override
	public String execute(HttpServletRequest requestm, HttpServletResponse response) throws Exception {
		int count = MemberDAO.getInstance().userCount();
		requestm.setAttribute("count", count);
		return "welcome.jsp";
	}

}
