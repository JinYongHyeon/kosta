package org.kosta.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.ProductDAO;
import org.kosta.model.ProductVO;

public class FindMakerProductListController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ArrayList<ProductVO> list = ProductDAO.getInstance().findMakerProductById(request.getParameter("maker"));
		String url= null;
			request.setAttribute("list", list);
			url ="productbymaker-list.jsp";
		
		return url;
	}

}
