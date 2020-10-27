package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.NoticeDAO;
import model.NoticeVO;

/**
 * Servlet implementation class ListNotice
 */
@WebServlet("/ListNotice")
public class ListNotice extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListNotice() {
        super();
        // TODO Auto-generated constructor stub
    }
 
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			NoticeDAO dao = NoticeDAO.getInstance();
			try {
				ArrayList<NoticeVO> list = dao.noticeSelect();
				request.setAttribute("noticeList", list);
				request.getRequestDispatcher("notice.jsp").forward(request, response);
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}

}
