package org.kosta.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.BoardDAO;
import org.kosta.model.ListVO;
import org.kosta.model.PagingBeanEX;
import org.kosta.model.PostVO;


public class ListController  implements Controller {
	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {	
		int totalPostCount = BoardDAO.getInstance().getTotalPostCount(); //총 게시물 수 가져오기
		String pageNo = request.getParameter("pageNo");
		PagingBeanEX paginBean = null;
		if(pageNo == null)
			paginBean = new PagingBeanEX(totalPostCount);
		else
			paginBean = new PagingBeanEX(totalPostCount,Integer.parseInt(pageNo));
		ArrayList<PostVO> list
		=BoardDAO.getInstance().getPostingList(paginBean);	
		ListVO listVO = new ListVO(list,paginBean);
		request.setAttribute("lvo", listVO);
		request.setAttribute("url", "/board/list.jsp");		
		return "/template/layout.jsp";
	}
}







