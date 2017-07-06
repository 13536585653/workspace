package org.demo.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ContextAttributeListener implements ServletContextAttributeListener{
	/**
	 * ��ServletContext������ݵ�ʱ�����ô˷���
	 */
	@Override
	public void attributeAdded(ServletContextAttributeEvent arg0) {
		System.out.println("���������������������");
		
	}
	/**
	 * ��ServletContext�Ƴ����ݵ�ʱ�����ô˷���
	 */
	@Override
	public void attributeRemoved(ServletContextAttributeEvent arg0) {
		System.out.println("�������������Ƴ�������");
		
	}
	/**
	 * ��ServletContext�滻���ݵ�ʱ�����ô˷���
	 */
	@Override
	public void attributeReplaced(ServletContextAttributeEvent arg0) {
		System.out.println("�������������滻������");
		
	}

}
