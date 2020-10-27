package org.kosta.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.MemberDAO;

public class GetAddressKindController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ArrayList<String> list = MemberDAO.getInstance().getAddressKind();
		request.setAttribute("list", list);
		return "address-list.jsp";
	}

}
