package com.test.listener;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.test.bean.Product;

/**
 * Application Lifecycle Listener implementation class ShopListener
 *
 */
public class ShopListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public ShopListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce) {
        
    	System.out.println("����������.....");
    	
    	Product p1=new Product("1001", "С���ֻ�", "�ֻ���ս����", 1599.00);
    	Product p2=new Product("1002", "��Ϊ�ֻ�", "�ֻ��к�ը��", 2599.00);
    	Product p3=new Product("1003", "�����ֻ�", "�ֻ�������", 799.00);
    	Product p4=new Product("1004", "ƻ��", "�ֻ���װ�ƻ�", 4599.00);
    	Product p5=new Product("1005", "����", "�ֻ�", 3599.00);
    	
    	List<Product>  productlist=new ArrayList<Product>();
    	
    	productlist.add(p1);
    	productlist.add(p2);
    	productlist.add(p3);
    	productlist.add(p4);
    	productlist.add(p5);
    	
    	
    	sce.getServletContext().setAttribute("productList", productlist);
    	    
    	System.out.println("��Ʒ�б��Ѿ�����ctx��....");
    
    }

    public void contextDestroyed(ServletContextEvent arg0) {
        // TODO Auto-generated method stub
    }
	
}
