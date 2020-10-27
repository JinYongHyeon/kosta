package step3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PostServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	//HttpServlet <-- javaSE없음 lib(aptch tomcat)에서 사용하는거임
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//응답시 컨텐트 타입 및 한글 처리를 설정		
		resp.setContentType("text/html; charset=utf-8");
	
		/*post 방식은 url로 데이터가 전달되는 것이 아니라 http request body 
		영역에 저장되어 전달되므로 한글처리를 한다.*/	
		req.setCharacterEncoding("utf-8");
		PrintWriter pw = resp.getWriter();
		String message = req.getParameter("message");
		pw.println(message);
		pw.close();
	}

}
