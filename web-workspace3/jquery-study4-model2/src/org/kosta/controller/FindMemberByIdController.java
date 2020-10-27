package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.MemberDAO;
import org.kosta.model.MemberVO;

/*
 * Ajax 방식으로 회원 검색 결과를 응답한다.
 */

public class FindMemberByIdController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String id=request.getParameter("id");
		MemberVO mvo = MemberDAO.getInstance().findMemberById(id);
		String result=null;
		if(mvo==null) {
			result="회원 정보가 없습니다.";
		}else {
			result="이름:"+mvo.getName()+" 주소:"+mvo.getAddress();
		}
		
		//client에게 응답할 데이터를 AjaxView에 공유한다. 
		request.setAttribute("responsebody", result);
		return "AjaxView";
	}
}






