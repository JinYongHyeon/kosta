package step2;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class FindMemberCountServlet
 */
@WebServlet("/FindMemberCount")
public class FindMemberCountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//드라이버 로딩은 웹어플리케이션에서 한번만 실행되면 되므로 ServletContextListener의 contextInitialized()에서 하도록 한다.
   // private String dbDriver;
    private String dbUrl;
    private String userName;
    private String password;
     
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindMemberCountServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    @Override
    public void init() throws ServletException {
    	//dbDriver = getServletContext().getInitParameter("dbDriver");
    	dbUrl = getServletContext().getInitParameter("dbUrl");
    	userName =getServletContext().getInitParameter("userName");
    	password = getServletContext().getInitParameter("password");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html><body bgcolor=yellow>");
		try {
			//Class.forName(dbDriver); 서블릿컨텍스트 리스너에서 로딩한다.
			Connection con = DriverManager.getConnection(dbUrl,userName,password);
			String sql="SELECT COUNT(*) FROM WEB_MEMBER";
			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				out.println("총 회원 수  :"+rs.getInt(1));
			}
			
				
			
			rs.close();
			pstmt.close();
			con.close();
		}catch(Exception e) {
			
		}
		//out.println(getServletConfig().getServletName());
		out.println("</html></body>");
		out.close();
	}

	
}
