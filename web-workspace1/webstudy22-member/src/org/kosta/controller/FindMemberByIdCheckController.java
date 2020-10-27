package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.MemberDAO;
import org.kosta.model.MemberVO;

public class FindMemberByIdCheckController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String id =request.getParameter("id");
		MemberVO vo = MemberDAO.getInstance().findMemberById(id);
		String url = null;
		request.setAttribute("id", id);
		if(vo != null) {
			url = "register-idCheck-fail.jsp";
		}else {
			url = "register-idCheck-ok.jsp";
		}
		
		return url;
	}

}
