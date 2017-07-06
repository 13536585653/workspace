

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
    
    //监听servletContext的创建
    public void contextInitialized(ServletContextEvent arg0) {
        
    	System.out.println("servletContext创建啦.....");
    }

	/**
     * @see ServletContextAttributeListener#attributeAdded(ServletContextAttributeEvent)
     */
    //监听往servletContext里添加属性
    public void attributeAdded(ServletContextAttributeEvent arg0) {
       
    	System.out.println("有人向servletContext里添加东西啦.....");
    	
    }

	/**
     * @see ServletContextAttributeListener#attributeReplaced(ServletContextAttributeEvent)
     */
    //监听往servletContext里替换属性
    public void attributeReplaced(ServletContextAttributeEvent arg0) {
    	System.out.println("有人向servletContext里替换东西啦.....");
    }

	/**
     * @see ServletContextAttributeListener#attributeRemoved(ServletContextAttributeEvent)
     */
    
    //监听往servletContext里移除属性
    public void attributeRemoved(ServletContextAttributeEvent arg0) {
    	System.out.println("有人向servletContext里移除东西啦.....");
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    
    //监听往servletContext的销毁
    public void contextDestroyed(ServletContextEvent arg0) {
        // TODO Auto-generated method stub
    }
	
}
