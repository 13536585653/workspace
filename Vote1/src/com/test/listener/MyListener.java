package com.test.listener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

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
    	Map<String,Integer> map=new TreeMap<String,Integer>();
    	
    	map.put("张学友",0);
    	map.put("刘德华",0);
    	map.put("黎明", 0);
    	map.put("郭富城", 0);
    	
    	//创建一个已投票者的list
    	List<String> list=new ArrayList<String>();
    	
    	sct.getServletContext().setAttribute("resultMap", map);
    	sct.getServletContext().setAttribute("list", list);
    
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0) {
        // TODO Auto-generated method stub
    }
	
}
