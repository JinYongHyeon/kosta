package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.kosta.model.CartBean;
import org.kosta.model.DuplicateItemException;
import org.kosta.model.ItemDAO;
import org.kosta.model.ItemDTO;
import org.kosta.model.MemberDTO;

public class AddCartController implements Controller {
	/**
	 * 로그인 체크 : 세션이 존재하고 세션내의 인증정보가 존재하는 지 확인 인증정보(회원객체)가 존재하면 로그인 했으므로 상품을 담기 위해
	 * 장바구니 객체를 생성한다. 만약 기존 장바구니가 있으면 기존 장바구니를 이용한다. 장바구니 객체에 아이템 상품 정보를 추가한다.
	 * 상품아이템을 추가한 후 addcart_result.jsp로 이동시킨다.
	 * 
	 * 예외사항) 장바구니에 동일한 상품 아이템이 있을 경우에는 추가시키지 않고 duplicate_cart.jsp로 이동시킨다.
	 */
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// System.out.println("도착 :)::):::)::::):::::)
		// "+request.getParameter("itemNo"));
		HttpSession session = request.getSession(false);
		String url = "redirect:front?command=home";
		if (session != null) {
			MemberDTO userDTO = (MemberDTO) session.getAttribute("userDTO");
			if (userDTO != null) {
				String itemNo = request.getParameter("itemNo");
				ItemDTO itemDTO = ItemDAO.getInstance().getDetailItem(itemNo);
				try {
					userDTO.getCart().addItem(itemDTO);
					url="item/addcart-result.jsp";
				} catch (DuplicateItemException e) {
					e.printStackTrace();
					url="item/duplicate-cart.jsp";
				}
			}
		}
		return url;
	}

}
