package org.demo.filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UserFileter implements Filter{
	//这个集合存放所有需要预先放行的请求url
	List<String> chainList=new ArrayList<String>();
	
	public UserFileter(){
		chainList.add("/loginServlet");
		chainList.add("login.jsp");
	}
	@Override
	//这是filter在销毁之前会执行的方法
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
	//过滤器的核心执行方法，此方法可以执行多次，在这里用于拦截请求操作
	//所有的请求可以先经过此方法，在这个方法中决定是否将请求放行
	//放行请求通过FilterChain对象来执行
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		//将父类ServletRequest的request强转为子类HttpServletRequest型
		//将父类ServletResponse的response强转为子类的HttpServletResponse型
		HttpServletRequest req=(HttpServletRequest)request;
		HttpServletResponse resp=(HttpServletResponse)response;
		
		//定义一个path去获取Servlet路径
		String path=req.getServletPath();
		//如果有上面chainList添加的两个路径（根据下标），不为-1的话就表示有这些路径，那么就不拦截 直接放行。
		if(chainList.indexOf(path)!=-1){
			chain.doFilter(req, resp);
		}else{
			//否则就创建一个会话，在会话里面获取用户的信息，如果没有用户信息，就表示没有登入
			HttpSession session=req.getSession();
			//如果session不为空，就表示用户已登入，会话作用域是有user这个对象的，所以就直接放行，交由后续的Servlet处理
			if(session.getAttribute("user")!=null){
				chain.doFilter(req, resp);
			}else{
				//否则就重定向登入页面
				resp.sendRedirect("login.jsp");
			}
		}
	}
		//过滤器会在初始化的时候调用此方法，仅调用一次
	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}
	
}
