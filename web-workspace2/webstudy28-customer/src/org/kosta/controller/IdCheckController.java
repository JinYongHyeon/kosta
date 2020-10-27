package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.MemberDAO;
import org.kosta.model.MemberDTO;

public class IdCheckController implements Controller {

	@Override
	public String execute(HttpServletRequest requestm, HttpServletResponse response) throws Exception {
		String id = requestm.getParameter("id");
		MemberDTO vo = MemberDAO.getInstance().idCheck(id);
		String url="";
		if(vo == null) {
			requestm.setAttribute("id",id);
			url="idCheck-ok.jsp";
		}else {
			url="redirect:idCheck-fail.jsp";
		}
		return url;
	}

}
