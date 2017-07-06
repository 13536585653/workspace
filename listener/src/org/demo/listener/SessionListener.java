package org.demo.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class SessionListener implements HttpSessionListener{
	/**
	 * ��session����֮�����ô˷���
	 */
	@Override
	public void sessionCreated(HttpSessionEvent Event) {
		System.out.println("�Ự�Ѿ��������");
		//ͨ���¼�������Ի�õ�ǰ��sessionʵ��
		HttpSession session=Event.getSession();
	}
	/**
	 * ��session����֮�����ô˷���
	 */
	@Override
	public void sessionDestroyed(HttpSessionEvent Event) {
		System.out.println("�Ự�Ѿ�����");
		//ͨ���¼�������Ի�õ�ǰ��sessionʵ��
		HttpSession session=Event.getSession();
	}

}
