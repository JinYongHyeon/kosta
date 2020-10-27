package org.kosta.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.CompanyDAO;
import org.kosta.model.EmployeeDTO;

public class EmployeeListController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// getAllEmployeeList()호출해서 리스트를 반환한다.
		ArrayList<EmployeeDTO> empList = CompanyDAO.getInstance().getAllEmployeeList();
		request.setAttribute("empList", empList);
		
		return "employeee-list.jsp";
	}

}
