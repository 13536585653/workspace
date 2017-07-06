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
        
    	//����ͶƱ�����map,�����ctx��
    	Map<String,Integer> map=new HashMap<String,Integer>();
    	
    	map.put("����",0);
    	map.put("����",0);
    	map.put("����", 0);
    	map.put("��ë��", 0);
    	map.put("����", 0);
    	map.put("ƹ����", 0);
    	
    	sct.getServletContext().setAttribute("resultMap", map);
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0) {
        // TODO Auto-generated method stub
    }
	
}
