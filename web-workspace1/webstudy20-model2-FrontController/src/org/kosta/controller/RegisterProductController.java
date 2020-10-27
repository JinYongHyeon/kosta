package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.ProductDAO;
import org.kosta.model.ProductVO;

public class RegisterProductController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String name = request.getParameter("productName");
		String maker= request.getParameter("productMaker");
		int price = Integer.parseInt(request.getParameter("productPrice"));
		ProductDAO.getInstance().registerProduct(new ProductVO(null, name, maker, price));
		return "redirect:register-product-result.jsp";
	}

}
