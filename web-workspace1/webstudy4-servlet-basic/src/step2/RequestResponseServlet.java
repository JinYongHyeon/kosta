package step2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestResponseServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset='utf-8'");
		PrintWriter pw = response.getWriter();
		//client가 보낸 정보를 반환받는다
		//http://ip:port/serverProgramUrl?name=value 형태로 전송
		String message = request.getParameter("userName");
		pw.println(message);
		pw.close();
	}
}
