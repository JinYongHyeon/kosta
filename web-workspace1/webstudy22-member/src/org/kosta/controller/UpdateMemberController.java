package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.kosta.model.MemberDAO;
import org.kosta.model.MemberVO;

public class UpdateMemberController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		HttpSession session = request.getSession(false);
		if (session != null && session.getAttribute("user") != null) {
			MemberDAO.getInstance().MemberUpdate(new MemberVO(id, password, name, address));

			session.setAttribute("user", new MemberVO(id, password, name, address));

		} else {
			return "redirect:index.jsp";
		}
		return "redirect:update-result.jsp";
	}
	
	public static void main(String[] args) {
		String tel2 = "010-1234-4564";
		System.out.println(tel2.replaceAll("-",""));
	}
}
