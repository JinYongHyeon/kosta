package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.kosta.model.MemberDTO;

public class DeleteCartController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session =request.getSession(false);
		String itemNo = request.getParameter("itemNo");
		String url="redirect:front?command=home";
		if(session != null && session.getAttribute("userDTO")!=null)	{	
		MemberDTO userDTO = (MemberDTO) session.getAttribute("userDTO");
		System.out.println("controller: "+itemNo);
		userDTO.getCart().removeItem(itemNo);
		url="redirect:front?command=cartview";
		}
		return url;
	}

}
