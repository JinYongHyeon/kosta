package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.kosta.model.MemberDAO;
import org.kosta.model.MemberVO;

public class LoginController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		MemberVO vo = MemberDAO.getInstance().login(id, password);
		String url=null;
		
		if(vo!=null) {
			HttpSession session = request.getSession();
			session.setAttribute("userVO", vo);
			//request.setAttribute("url", "member/login-ok.jsp");
			url="redirect:front?command=home";
		}else {
			url="/member/login-fail.jsp";
		}
		return url;
	}

}
