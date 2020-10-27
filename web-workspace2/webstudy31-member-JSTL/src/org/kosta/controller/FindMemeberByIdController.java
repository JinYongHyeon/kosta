package org.kosta.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.MemberDAO;
import org.kosta.model.MemberVO;

public class FindMemeberByIdController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String id = request.getParameter("id");
		MemberVO vo = MemberDAO.getInstance().findMemberById(id);
		String url =null;
		if(vo != null) {
			request.setAttribute("vo", vo);
			url = "findMemberById-ok.jsp";
		}else {
			url = "findMemberById-fail.jsp";
		}
			return url;
	}

}
