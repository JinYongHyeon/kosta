package step2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.XMLOutputter;

import model.CarDAO;
import model.CarDTO;

/**
 * Servlet implementation class FindCarXMLServlet
 */
@WebServlet("/FindCarXMLServlet")
public class FindCarXMLServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FindCarXMLServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/xml;charset=utf-8");
		PrintWriter out = response.getWriter();
		String maker = request.getParameter("maker");
		CarDTO car = CarDAO.getInstance().getCarInfo("현대");

		Document myDocument = new Document();
		
		//Element root = new Element("car");
		Element root = new Element("carList");
		myDocument.setRootElement(root);
		for(int i=0;i<3;i++) {
		Element c = new Element("car");
		Element m = new Element("model");
		Element p = new Element("price");
		
		m.addContent(car.getModel());
		p.addContent(car.getPrice()+"");
		
		c.addContent(m);
		c.addContent(p);
	
		root.addContent(c);
		}
		

		
		//root.addContent(new Element("model").addContent(car.getModel()));
		//root.addContent(new Element("price").addContent(car.getPrice() + ""));

		
		XMLOutputter xmlOut = new XMLOutputter();
		out.println(xmlOut.outputString(myDocument));
		out.close();

	}

}
