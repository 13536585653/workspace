package org.demo.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class RequestListener implements ServletRequestListener{
	/**
	 * 当请求对象销毁之后会调用这个方法
	 */
	@Override
	public void requestDestroyed(ServletRequestEvent arg0) {
		System.out.println("请求对象被销毁了！");
		
	}
	
	/**
	 * 当请求对象创建的时候会调用这个方法
	 */
	@Override
	public void requestInitialized(ServletRequestEvent arg0) {
		System.out.println("请求对象被创建了！");
		
	}

}
