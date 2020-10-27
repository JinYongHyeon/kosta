package controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.NoticeDAO;
import model.NoticeVO;

public class FindNoticeController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String no = request.getParameter("No");
		NoticeDAO dao = NoticeDAO.getInstance();
		NoticeVO vo = dao.noticeFindSelect(no);
		dao.noticeFindeSelectPointPlus(no);
		request.setAttribute("vo", vo);

		return "noticeFind.jsp";

	}

}
