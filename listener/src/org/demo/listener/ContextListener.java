package org.demo.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ContextListener implements ServletContextListener{
	/**
	 * 当ServletContext对象销毁后调用此方法
	 */
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("ServletContext被销毁了");
		
	}
	/**
	 * 当ServletContext对象初始化的时候调用此方法
	 */
	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("ServletContext创建了");
		
		
	}

}
