package org.kosta.controller;

import java.util.LinkedHashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.kosta.model.ItemDAO;
import org.kosta.model.ItemDTO;

public class CartAddController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String itemNo = request.getParameter("itemNo");
		ItemDTO dto = ItemDAO.getInstance().getDetailItem(itemNo);
		String url = null;
		LinkedHashMap<String, ItemDTO> cart = null;
		HttpSession session = request.getSession(false);
		if (session != null) {
			if (session.getAttribute("cart") == null) {
				cart = new LinkedHashMap<String, ItemDTO>();
				session.setAttribute("cart", cart);
			} else {
				cart = (LinkedHashMap<String, ItemDTO>) session.getAttribute("cart");
			}

			if (cart.containsKey(dto.getItemNo())) {
				url = "redirect:item/cartCheck-fail.jsp"; // alert( 장바구니 중복 아이템입니다); location ---> home
			} else {
				cart.put(dto.getItemNo(), dto);
				
				url = "redirect:item/cartCheck-ok.jsp";
			}
		} else {
			url = "redirect:front?command=home";
		}

		return url;
	}

}
