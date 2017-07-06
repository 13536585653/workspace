package com.test.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class UserCheck
 */
public class UserCheck implements Filter {

    /**
     * Default constructor. 
     */
    public UserCheck() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req=(HttpServletRequest)request;
		HttpServletResponse resp=(HttpServletResponse)response;
		
		
		String name=(String) req.getSession().getAttribute("username");
		String pwd=(String) req.getSession().getAttribute("userpwd");
		if((name==null || name.length()==0) && (pwd==null || pwd.length()==0)){
			req.getSession().setAttribute("error", "ÉÐÎ´µÇÂ½£¡È¥<a href='user_login.html'>µÇÂ½</a>");
			resp.sendRedirect("../error.jsp");
		
		}else{
          chain.doFilter(request, response);
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
