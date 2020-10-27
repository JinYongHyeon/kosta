package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.NoticeDAO;
import model.NoticeVO;

public class NoticeInsertController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		NoticeDAO dao = NoticeDAO.getInstance();
		String title = request.getParameter("noticeTitle");
		String content = request.getParameter("noticeContent");

		System.out.println(title + content);
		
		dao.noticeInsert(new NoticeVO(title, content, "admin"));
		
		return "FrontController?command=ListNotice";
	}

}
