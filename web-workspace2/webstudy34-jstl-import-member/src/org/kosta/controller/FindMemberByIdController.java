package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.MemberDAO;
import org.kosta.model.MemberVO;

public class FindMemberByIdController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String id = request.getParameter("id");
		MemberVO vo = MemberDAO.getInstance().findMemberById(id);
		String url=null;
		if(vo!=null) {
			request.setAttribute("memberVO", vo);
			request.setAttribute("url", "member/findbyid-ok.jsp");
			url ="template/login-layout.jsp";
		}else {
			url="member/findbyid-fail.jsp";
		}
		return url;
	}

}
