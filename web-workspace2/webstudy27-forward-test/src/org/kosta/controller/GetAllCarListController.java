package org.kosta.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.CarDAO2;
import org.kosta.model.CarDTO;

public class GetAllCarListController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ArrayList<CarDTO> list = CarDAO2.getInstance().getAllCarList();
		request.setAttribute("list", list);
		return "car-list.jsp";
	}

}
