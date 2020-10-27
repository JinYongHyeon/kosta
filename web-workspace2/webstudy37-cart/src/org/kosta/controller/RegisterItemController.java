package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.ItemDAO;
import org.kosta.model.ItemDTO;

public class RegisterItemController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ItemDTO dto = new ItemDTO();
		dto.setName(request.getParameter("name"));
		dto.setMaker(request.getParameter("maker"));
		dto.setPirce(Integer.parseInt(request.getParameter("price")));
		dto.setDetail(request.getParameter("detail"));
		ItemDAO.getInstance().registerItem(dto);
		return "redirect:item/item-register-result.jsp";
	}

}
