package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class WritePostFromController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession(false);
		if(session == null || session.getAttribute("member") ==null)
			return "redirect:front?command=getAllPostList";
		request.setAttribute("url", "/board/board-WriteForm.jsp");
		return "template/layout.jsp";
	}

}
