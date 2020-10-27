package org.kosta.controller;

import java.util.LinkedHashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.kosta.model.ItemDTO;

public class CartDeleteController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession(false);
		String key = request.getParameter("itemNo");
		if(session != null) {
			LinkedHashMap<String,ItemDTO> cart =(LinkedHashMap<String,ItemDTO>) session.getAttribute("cart");
			if(cart.containsKey(key)) {
				cart.remove(key);
			}
		}
		return "redirect:front?command=home";
	}

}
