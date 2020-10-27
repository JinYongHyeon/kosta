package step1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ServletConfig을 분석하는 예제
 */
public class ConfigServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int serviceCount;
	private String savePath;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConfigServlet() {
        super();
        System.out.println(getClass().getName()+" 생성");
    }
    /*
     * init(ServletConfig con) 메소드에 의해 호출이 된다. --> init()
     */
    @Override
    public void init() throws ServletException {
    	//System.out.println(getServletConfig()); 
    	//servletConfig 객체에 저장된 경로에 반환받는다.
    	savePath = this.getServletConfig().getInitParameter("savePath");
    	BufferedReader br = null;
    	try {
    		File countFile = new File(savePath);
    		if(countFile.isFile()) {
    	  	br = new BufferedReader(new FileReader(countFile));
			while(br.ready()) { 
				serviceCount = Integer.parseInt(br.readLine());
			}
			System.out.println("init()..서비스 수, 인스턴스 변수에 할당"+serviceCount);
    		}else {
    		System.out.println("init() 실행");
    		}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    @Override
    public void destroy() {
    	try {
			PrintWriter out = new PrintWriter(new FileWriter(savePath));
			out.println(serviceCount);
			System.out.println("destory() 실행" +serviceCount+" 서비스수 파일에 저장");
			out.close();
    	} catch (IOException e) {
			e.printStackTrace();
		}
    	
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("서비스 count:");
		out.println(++serviceCount);
		out.close();
	}

}
