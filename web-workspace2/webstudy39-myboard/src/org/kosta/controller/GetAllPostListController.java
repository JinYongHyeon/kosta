package org.kosta.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.BoardDAO;
import org.kosta.model.PostVO;

public class GetAllPostListController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ArrayList<PostVO> boardList = BoardDAO.getInstance().getAllPostList();
		request.setAttribute("min", 1);
		int max = boardList.size()/10;
		request.setAttribute("max",max);
		request.setAttribute("boardList", boardList);
		request.setAttribute("url", "/board/board-list.jsp");
		return "template/layout.jsp";
	}

}
