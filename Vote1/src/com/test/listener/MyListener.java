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
        
    	//����ͶƱ�����map,�����ctx��
    	Map<String,Integer> map=new TreeMap<String,Integer>();
    	
    	map.put("��ѧ��",0);
    	map.put("���»�",0);
    	map.put("����", 0);
    	map.put("������", 0);
    	
    	//����һ����ͶƱ�ߵ�list
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
