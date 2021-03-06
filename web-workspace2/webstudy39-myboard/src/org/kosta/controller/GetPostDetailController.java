package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.kosta.model.BoardDAO;
import org.kosta.model.MemberVO;
import org.kosta.model.PostVO;

public class GetPostDetailController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String no = request.getParameter("no");
		HttpSession session = request.getSession(false);
		if(session == null || session.getAttribute("member") ==null) {
			return "redirect:front?command=getAllPostList";
		}else {
		MemberVO mvo = (MemberVO)session.getAttribute("member");
		if (request.getParameter("token") == null && mvo.getHitsBean().boardNoHitsCheck(no) != 1)
			BoardDAO.getInstance().updatePostToken(no); // 2 조회수 증가 +1
			mvo.getHitsBean().boardNoAdd(no);
			PostVO pvo = BoardDAO.getInstance().getPostDetail(no); // 1 상세정보 가져오기
			if(pvo== null)return "redirect:front?command=getAllPostList";
			request.setAttribute("pvo", pvo);
			request.setAttribute("url", "/board/board-detail.jsp");
			return "template/layout.jsp";
		}
		
	}

}
