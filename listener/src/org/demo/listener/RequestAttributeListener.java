package org.demo.listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class RequestAttributeListener implements ServletRequestAttributeListener{
	/**
	 * 添加到请求作用域时会调用此方法（request.setAttribute()）
	 */
	@Override
	public void attributeAdded(ServletRequestAttributeEvent arg0) {
		System.out.println("在请求作用域中添加了数据");
		
	}
	/**
	 * 从请求作用域中移除数据时会调用此方法（request.removeAttribute()）
	 */
	@Override
	public void attributeRemoved(ServletRequestAttributeEvent arg0) {
		System.out.println("在请求作用域中移除了数据");		
	}
	/**
	 * 从请求作用域中替换数据时会调用此方法
	 */
	@Override
	public void attributeReplaced(ServletRequestAttributeEvent arg0) {
		System.out.println("在请求作用域中替换了数据");
		
	}
	
}
