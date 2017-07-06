

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Application Lifecycle Listener implementation class MyListener
 *
 */
public class MyListener implements ServletContextListener, ServletContextAttributeListener {

    /**
     * Default constructor. 
     */
    public MyListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    
    //����servletContext�Ĵ���
    public void contextInitialized(ServletContextEvent arg0) {
        
    	System.out.println("servletContext������.....");
    }

	/**
     * @see ServletContextAttributeListener#attributeAdded(ServletContextAttributeEvent)
     */
    //������servletContext���������
    public void attributeAdded(ServletContextAttributeEvent arg0) {
       
    	System.out.println("������servletContext����Ӷ�����.....");
    	
    }

	/**
     * @see ServletContextAttributeListener#attributeReplaced(ServletContextAttributeEvent)
     */
    //������servletContext���滻����
    public void attributeReplaced(ServletContextAttributeEvent arg0) {
    	System.out.println("������servletContext���滻������.....");
    }

	/**
     * @see ServletContextAttributeListener#attributeRemoved(ServletContextAttributeEvent)
     */
    
    //������servletContext���Ƴ�����
    public void attributeRemoved(ServletContextAttributeEvent arg0) {
    	System.out.println("������servletContext���Ƴ�������.....");
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    
    //������servletContext������
    public void contextDestroyed(ServletContextEvent arg0) {
        // TODO Auto-generated method stub
    }
	
}
