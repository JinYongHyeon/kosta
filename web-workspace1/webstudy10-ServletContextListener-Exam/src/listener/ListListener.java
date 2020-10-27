package listener;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import model.MemberVO;

/**
 * Application Lifecycle Listener implementation class ListListener
 *
 */
public class ListListener implements ServletContextListener {

	/**
	 * Default constructor.
	 */
	public ListListener() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * WAS 종료 전에 호출되는 메서드 filepath에 list를 직렬화해서 저장한다.
	 */
	public void contextDestroyed(ServletContextEvent event) {
		String path = event.getServletContext().getInitParameter("filePath");
		ObjectOutputStream oos = null;
		try {
			//직렬화
			oos = new ObjectOutputStream(new FileOutputStream(path));
			//ArrayList<MemberVO> list = (ArrayList<MemberVO>) event.getServletContext().getAttribute("list");
			oos.writeObject(event.getServletContext().getAttribute("list"));
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (oos != null)
					oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	/**
	 * web application 시작시에 호출되는 메서드 filePath를 확인해서 있으면 list를 역직렬화해서 반환받아
	 * ServletContext에 setAttribute() 하고 없으면 새로 생성해서 ServletContext에 setAttribute()
	 */
	public void contextInitialized(ServletContextEvent event) {
		// C:\\KOSTA\\member.obj
		String path = event.getServletContext().getInitParameter("filePath");
		ArrayList<MemberVO> list = null;
		ObjectInputStream ois = null;
		File file = new File(path);
		try {
			if (!file.isFile() || !file.getParentFile().exists()) {
				file.getParentFile().mkdirs();
				//list = new ArrayList<MemberVO>();
				System.out.println("만들어짐");
				event.getServletContext().setAttribute("list", new ArrayList<MemberVO>());
			} else {
				//역직렬화
				ois = new ObjectInputStream(new FileInputStream(path));
				//list = (ArrayList<MemberVO>) ois.readObject();
				//System.out.println(list.size());
				event.getServletContext().setAttribute("list",ois.readObject());
			}
			//event.getServletContext().setAttribute("list", list);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ois != null)
					ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

}
