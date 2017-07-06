package com.test.listener;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Application Lifecycle Listener implementation class MyListener
 *
 */
public class MyListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public MyListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sct) {
        
    	//创建投票结果的map,存放在ctx中
    	Map<String,Integer> map=new HashMap<String,Integer>();
    	
    	map.put("足球",0);
    	map.put("篮球",0);
    	map.put("排球", 0);
    	map.put("羽毛球", 0);
    	map.put("网球", 0);
    	map.put("乒乓球", 0);
    	
    	sct.getServletContext().setAttribute("resultMap", map);
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0) {
        // TODO Auto-generated method stub
    }
	
}
