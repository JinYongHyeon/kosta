package step1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class SetCookieServlet
 */
@WebServlet("/SetCookieServlet")
public class SetCookieServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<h1>"+getServletName()+"에서 쿠키를 클라이언트에게 전달</h1>");
		Date time = new Date();
		String timeStr = time.toString().replace(" ","-");
		out.println("<h1>"+timeStr+"</h1>"); //replace 공란을 -으로 대체한다.
		Cookie cookie = new Cookie("time",timeStr);
		cookie.setMaxAge(20); //유효시간 설정
		//client에게 쿠키를 전송 (response)
		response.addCookie(cookie);
		out.println("<br><br><a href=GetCookieServlet>step2.GetCookieServlet에서 쿠기 정보확인</a>");
		out.close();
	}

}
