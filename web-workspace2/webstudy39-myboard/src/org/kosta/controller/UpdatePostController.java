package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.kosta.model.BoardDAO;
import org.kosta.model.PostVO;

public class UpdatePostController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession(false);
		if(session == null || session.getAttribute("member") ==null)
			return "redirect:front?command=getAllPostList";
		PostVO pvo =new PostVO();
		pvo.setTitle(request.getParameter("title"));
		pvo.setContent(request.getParameter("content"));
		pvo.setNo(request.getParameter("no"));
		BoardDAO.getInstance().updatePost(pvo);
		
		return "redirect:front?command=getPostDetail&no="+request.getParameter("no")+"&token=1";
	}

}
