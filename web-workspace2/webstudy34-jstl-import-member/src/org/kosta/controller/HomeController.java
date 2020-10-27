package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.kosta.model.MemberDAO;

public class HomeController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int count = MemberDAO.getInstance().getMemberTotalCount();
		request.setAttribute("count", count);
		request.setAttribute("url", "home.jsp");
		
		//로그인한 사용자와 로그인하지 않은 사용자를 구분해서 home화면을 제공한다.
		String url = null;
		HttpSession session = request.getSession(false);
		if(session != null && session.getAttribute("userVO") !=null) {
			url ="template/login-layout.jsp";
		}else {
			url ="template/layout.jsp";
		}
		return url;
	}

}
