package step4;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FindMemberListByAddress
 */
@WebServlet("/FindMemberListByAddress")
public class FindMemberListByAddress extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String dbUrl;
	private String userName;
	private String password;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FindMemberListByAddress() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init() throws ServletException {
		dbUrl = getServletContext().getInitParameter("dbUrl");
		userName = getServletContext().getInitParameter("userName");
		password = getServletContext().getInitParameter("password");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String address = request.getParameter("address");

		try {
			con = DriverManager.getConnection(dbUrl, userName, password);
			StringBuilder sb = new StringBuilder();
			sb.append("SELECT ID,NAME FROM WEB_MEMBER");
			sb.append(" WHERE ADDRESS=?");
			pstmt = con.prepareStatement(sb.toString());
			pstmt.setNString(1, address);
			rs = pstmt.executeQuery();
			boolean reuslt = rs.next();
			if (!reuslt) {
				out.println(address + "존재하지 않습니다.");
			} else {
				while (reuslt) {
					out.println("아이디 : " + rs.getString("id"));
					out.println("&nbsp 이름 : " + rs.getString("name") + "<br>");
					reuslt = rs.next();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		out.close();
	}

}
