package step3;

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
 * Servlet implementation class findMemberByIdServlet
 */
@WebServlet("/findMemberByIdServlet")
public class findMemberByIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private String dbUrl;
    private String userName;
    private String password;
    
	@Override
	public void init() throws ServletException {
		dbUrl = getServletContext().getInitParameter("dbUrl");
		userName = getServletContext().getInitParameter("userName");
		password = getServletContext().getInitParameter("password");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		String memberId = request.getParameter("memberId");
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = DriverManager.getConnection(dbUrl,userName,password);
			StringBuilder sb = new StringBuilder();
			sb.append("SELECT ID,NAME,ADDRESS FROM WEB_MEMBER");
			sb.append(" WHERE ID=?");
			pstmt = con.prepareStatement(sb.toString());
			pstmt.setString(1, memberId);
			rs = pstmt.executeQuery();
			out.println("<style>");
			out.println("div{position: absolute;	top:50%;	left:50%;	transform:translate(-50%,-50%); box-shadow:4px 4px 4px #000; padding:100px; border:2px solid #ff0000;}");
			out.println("span{width:100%; float:left; text-align:center;}");
			out.println("</style>");
			out.println("<div>");
			if(rs.next()) {
				out.println("<h1>회원의 정보</h1>");
				out.println("<span>아이디 : "+rs.getString("ID")+"</span><br>");
				out.println("<span>이름 :"+rs.getString("NAME")+"</span><br>");
				out.println("<span>주소 : "+rs.getNString("ADDRESS")+"</span><br>");
			}else {
				out.println(memberId + " 아이디에 해당하는 회원정보가  없습니다.");
			}
			out.println("</div>");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
				try {
					if(rs!=null)
					rs.close();
					if(pstmt!=null) pstmt.close();
					if(con!=null) con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
		out.close();
	}

	

}
