package org.demo.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ContextListener implements ServletContextListener{
	/**
	 * ��ServletContext�������ٺ���ô˷���
	 */
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("ServletContext��������");
		
	}
	/**
	 * ��ServletContext�����ʼ����ʱ����ô˷���
	 */
	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("ServletContext������");
		
		
	}

}
