package org.kosta.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.MemberDAO;
import org.kosta.model.MemberVO;

public class AddressListController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ArrayList<MemberVO> list = MemberDAO.getInstance().addressList(request.getParameter("address"));
		request.setAttribute("aList", list);
		return "findMemberByAddress.jsp";
	}

}
