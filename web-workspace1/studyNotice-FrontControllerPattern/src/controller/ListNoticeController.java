package controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.NoticeDAO;
import model.NoticeVO;

public class ListNoticeController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		NoticeDAO dao = NoticeDAO.getInstance();
		ArrayList<NoticeVO> list = dao.noticeSelect();
		request.setAttribute("noticeList", list);
		return "notice.jsp";
	}

}
