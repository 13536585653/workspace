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
        
    	System.out.println("容器启动啦.....");
    	
    	Product p1=new Product("1001", "小米手机", "手机中战斗机", 1599.00);
    	Product p2=new Product("1002", "华为手机", "手机中轰炸机", 2599.00);
    	Product p3=new Product("1003", "魅族手机", "手机中垃圾", 799.00);
    	Product p4=new Product("1004", "苹果", "手机中装逼机", 4599.00);
    	Product p5=new Product("1005", "三星", "手机", 3599.00);
    	
    	List<Product>  productlist=new ArrayList<Product>();
    	
    	productlist.add(p1);
    	productlist.add(p2);
    	productlist.add(p3);
    	productlist.add(p4);
    	productlist.add(p5);
    	
    	
    	sce.getServletContext().setAttribute("productList", productlist);
    	    
    	System.out.println("商品列表已经存入ctx啦....");
    
    }

    public void contextDestroyed(ServletContextEvent arg0) {
        // TODO Auto-generated method stub
    }
	
}
