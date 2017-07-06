package org.demo.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

@WebListener
public class SessionAttributeListener implements HttpSessionAttributeListener{
	/**
	 * ��session����������������ݵ�ʱ�����ô˷���
	 */
	@Override
	public void attributeAdded(HttpSessionBindingEvent arg0) {
		System.out.println("�Ự���������������");
	}
	
	/**
	 * ��session���������Ƴ� �����ݵ�ʱ�����ô˷���
	 */
	@Override
	public void attributeRemoved(HttpSessionBindingEvent arg0) {
		System.out.println("�Ự�������Ƴ�������");
	}
	
	/**
	 * ��session�������滻�����ݵ�ʱ�����ô˷���
	 */
	@Override
	public void attributeReplaced(HttpSessionBindingEvent arg0) {
		System.out.println("�Ự�������滻������");
		
	}

}
