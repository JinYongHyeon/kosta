package step2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;

/**
 * Servlet implementation class JSONArrayServlet
 */
@WebServlet("/JSONArrayServlet")
public class JSONArrayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JSONArrayServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * 
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("손흥민");
		list.add("음바페");
		list.add("네이마르");
		list.add("메시");

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		JSONArray ja = new JSONArray(list);
		out.print(ja.toString());
		out.close();
		
	}

}
