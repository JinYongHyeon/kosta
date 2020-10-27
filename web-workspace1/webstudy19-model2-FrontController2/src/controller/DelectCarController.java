package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MockDAO;

public class DelectCarController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		MockDAO.getInstance().deleteCar(request.getParameter("id").trim());
		return "redirect:delete-car-result.jsp";
	}

}
