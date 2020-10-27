package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.ProductDAO;
import org.kosta.model.ProductVO;

public class FindProductByIdController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		/*
		 * 클라이언트가 전달한 상품아이디 반환받는다.
		 * 모델과 연동(ProductDAO의 findProductById(id))
		 * 연동 결과에 의해 상품정보가 존재하지 않으면 find-fail.jsp로 이동시킨다.(forward)
		 * 상품정보가 존재하면 request에 공유하고 find-ok.jsp로 이동시킨다(forward)
		 */
		ProductVO vo = ProductDAO.getInstance().findProductById(request.getParameter("productId").trim());
		String url = null;
		if(vo != null) {
		request.setAttribute("vo", vo);
			url = "find-product-ok.jsp";
		}else {
			url = "redirect:find-product-fail.jsp";
		}
		return url;
	}

}
