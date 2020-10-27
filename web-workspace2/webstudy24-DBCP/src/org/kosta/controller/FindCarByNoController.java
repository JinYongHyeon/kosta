package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.CarDAO2;
import org.kosta.model.CarDTO;

public class FindCarByNoController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String no = request.getParameter("carNo");
		CarDTO car = CarDAO2.getInstance().findCarByNo(no);
		String url = "redirect:findcar_fail.jsp";
		if(car != null) {
			request.setAttribute("car", car);
			url="find-ok.jsp";
		}
		return url;
	}

}
