package org.demo.listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class RequestAttributeListener implements ServletRequestAttributeListener{
	/**
	 * ��ӵ�����������ʱ����ô˷�����request.setAttribute()��
	 */
	@Override
	public void attributeAdded(ServletRequestAttributeEvent arg0) {
		System.out.println("�����������������������");
		
	}
	/**
	 * ���������������Ƴ�����ʱ����ô˷�����request.removeAttribute()��
	 */
	@Override
	public void attributeRemoved(ServletRequestAttributeEvent arg0) {
		System.out.println("���������������Ƴ�������");		
	}
	/**
	 * ���������������滻����ʱ����ô˷���
	 */
	@Override
	public void attributeReplaced(ServletRequestAttributeEvent arg0) {
		System.out.println("���������������滻������");
		
	}
	
}
