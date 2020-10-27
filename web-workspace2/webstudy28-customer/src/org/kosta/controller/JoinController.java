package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.MemberDAO;
import org.kosta.model.MemberDTO;

public class JoinController implements Controller {

	@Override
	public String execute(HttpServletRequest requestm, HttpServletResponse response) throws Exception {
		String id =requestm.getParameter("id");
		String password =requestm.getParameter("password");
		String name =requestm.getParameter("name");
		String address =requestm.getParameter("address");
		String birthday =requestm.getParameter("birthday");
		MemberDTO vo = new MemberDTO(id,password,name,address,birthday);
		MemberDAO.getInstance().userJoin(vo);
		return "redirect:index.jsp";
	}

}
