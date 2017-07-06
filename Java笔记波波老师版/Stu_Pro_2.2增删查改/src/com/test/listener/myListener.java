package com.test.listener;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.test.bean.City;
import com.test.dao.CityDao;

/**
 * Application Lifecycle Listener implementation class myListener
 *
 */
public class myListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public myListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0) {
         
    	CityDao dao=new CityDao();
    	//得到全部城市列表
    	List<City> cityList= dao.getList();
    	
    	Map<Integer,String> cityMap=new HashMap<Integer, String>();
    	
    	for (City city : cityList) {
    		cityMap.put(city.getC_id(),city.getC_name());
		}
    	
    	arg0.getServletContext().setAttribute("cityMap", cityMap);
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0) {
        // TODO Auto-generated method stub
    }
	
}
