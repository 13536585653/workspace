package org.demo.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class SessionListener implements HttpSessionListener{
	/**
	 * 当session创建之后会调用此方法
	 */
	@Override
	public void sessionCreated(HttpSessionEvent Event) {
		System.out.println("会话已经创建完成");
		//通过事件对象可以获得当前的session实例
		HttpSession session=Event.getSession();
	}
	/**
	 * 当session销毁之后会调用此方法
	 */
	@Override
	public void sessionDestroyed(HttpSessionEvent Event) {
		System.out.println("会话已经销毁");
		//通过事件对象可以获得当前的session实例
		HttpSession session=Event.getSession();
	}

}
