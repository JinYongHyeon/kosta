package step3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Servlet implementation class JSONServlet
 */
@WebServlet("/JSONServlet")
public class JSONServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int age;
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();		
		//JSON 
		String command = request.getParameter("command");
		if(command.contentEquals("getMemberInfo")) {
			JSONObject json = new JSONObject();
			json.put("name","홍길동");
			json.put("age", age++);
			out.println(json.toString());
		}else if(command.contentEquals("getMemberList")) {
			JSONArray ja = new JSONArray();
			ja.put("홍길동");
			ja.put("Faker");
			ja.put("ShowMaker");
			out.println(ja.toString());
		}
		out.close();
	}	
}







