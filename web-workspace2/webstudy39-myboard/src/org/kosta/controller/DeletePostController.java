package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.BoardDAO;

public class DeletePostController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		BoardDAO.getInstance().deletePost(request.getParameter("no"));
		
		return "redirect:front?command=getAllPostList";
	}

}
