package listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class NoticeListener
 *
 */
@WebListener
public class NoticeListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public NoticeListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent event)  { 
    	String drivce = event.getServletContext().getInitParameter("driver");
    	
    	try {
			Class.forName(drivce);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
    }
	
}
