package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CartListController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("cartlist오심???");
		request.setAttribute("url", "item/cartList.jsp");
		return "template/layout.jsp";
	}

}
