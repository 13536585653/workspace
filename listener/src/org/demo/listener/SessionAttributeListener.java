package org.demo.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

@WebListener
public class SessionAttributeListener implements HttpSessionAttributeListener{
	/**
	 * 当session作用域中添加了数据的时候会调用此方法
	 */
	@Override
	public void attributeAdded(HttpSessionBindingEvent arg0) {
		System.out.println("会话作用域添加了数据");
	}
	
	/**
	 * 当session作用域中移除 了数据的时候会调用此方法
	 */
	@Override
	public void attributeRemoved(HttpSessionBindingEvent arg0) {
		System.out.println("会话作用域移除了数据");
	}
	
	/**
	 * 当session作用域替换了数据的时候会调用此方法
	 */
	@Override
	public void attributeReplaced(HttpSessionBindingEvent arg0) {
		System.out.println("会话作用域替换了数据");
		
	}

}
