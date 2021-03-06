package org.kosta.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.BoardDAO;
import org.kosta.model.ListVO;
import org.kosta.model.PagingBean;
import org.kosta.model.PostVO;


public class ListController  implements Controller {
	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {						
		//ArrayList<PostVO> list=BoardDAO.getInstance().getPostingList();		
		//request.setAttribute("list", list);
		String nowPage = request.getParameter("nowPage");
		PagingBean pagingBean = null;
		int totalRow = BoardDAO.getInstance().getBoardAllRow();
		if(nowPage == null) {
		pagingBean = new PagingBean(totalRow);
		}else {
		pagingBean = new PagingBean(totalRow,Integer.parseInt(nowPage));
		}
		ArrayList<PostVO> pvoList = BoardDAO.getInstance().getPostingList(pagingBean);
		ListVO lvo = new ListVO(pvoList, pagingBean);
		request.setAttribute("lvo", lvo);
		request.setAttribute("url", "/board/list.jsp");		
		return "/template/layout.jsp";
	}
}







