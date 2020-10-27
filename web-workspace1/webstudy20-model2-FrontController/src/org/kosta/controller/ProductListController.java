package org.kosta.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.ProductDAO;
import org.kosta.model.ProductVO;

public class ProductListController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ArrayList<ProductVO> list = ProductDAO.getInstance().getAllProductList();
		//product-list에서 볼 수 있도록 request에 공유한다.
		request.setAttribute("list", list);
		return "product-list.jsp";
	}

}
