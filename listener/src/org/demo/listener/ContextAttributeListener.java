package org.demo.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ContextAttributeListener implements ServletContextAttributeListener{
	/**
	 * 当ServletContext添加数据的时候会调用此方法
	 */
	@Override
	public void attributeAdded(ServletContextAttributeEvent arg0) {
		System.out.println("上下文作用域添加了数据");
		
	}
	/**
	 * 当ServletContext移除数据的时候会调用此方法
	 */
	@Override
	public void attributeRemoved(ServletContextAttributeEvent arg0) {
		System.out.println("上下文作用域移除了数据");
		
	}
	/**
	 * 当ServletContext替换数据的时候会调用此方法
	 */
	@Override
	public void attributeReplaced(ServletContextAttributeEvent arg0) {
		System.out.println("上下文作用域替换了数据");
		
	}

}
