package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.ItemDAO;
import org.kosta.model.ItemDTO;

public class DetailItemController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ItemDTO dto = ItemDAO.getInstance().getDetailItem(request.getParameter("itemNo"));
		request.setAttribute("item", dto);
		request.setAttribute("url", "item/item-detail.jsp");
		return "template/layout.jsp";
	}

}
