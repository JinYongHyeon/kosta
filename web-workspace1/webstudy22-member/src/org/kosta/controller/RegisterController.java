package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.MemberDAO;
import org.kosta.model.MemberVO;

public class RegisterController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String id = request.getParameter("id");
		String pass = request.getParameter("password");
		System.out.println(pass);
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		
		MemberDAO.getInstance().register(new MemberVO(id, pass,name,address));
		return "redirect:register-result.jsp";
	}

}
