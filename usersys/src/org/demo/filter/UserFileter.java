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
	//������ϴ��������ҪԤ�ȷ��е�����url
	List<String> chainList=new ArrayList<String>();
	
	public UserFileter(){
		chainList.add("/loginServlet");
		chainList.add("login.jsp");
	}
	@Override
	//����filter������֮ǰ��ִ�еķ���
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
	//�������ĺ���ִ�з������˷�������ִ�ж�Σ����������������������
	//���е���������Ⱦ����˷���������������о����Ƿ��������
	//��������ͨ��FilterChain������ִ��
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		//������ServletRequest��requestǿתΪ����HttpServletRequest��
		//������ServletResponse��responseǿתΪ�����HttpServletResponse��
		HttpServletRequest req=(HttpServletRequest)request;
		HttpServletResponse resp=(HttpServletResponse)response;
		
		//����һ��pathȥ��ȡServlet·��
		String path=req.getServletPath();
		//���������chainList��ӵ�����·���������±꣩����Ϊ-1�Ļ��ͱ�ʾ����Щ·������ô�Ͳ����� ֱ�ӷ��С�
		if(chainList.indexOf(path)!=-1){
			chain.doFilter(req, resp);
		}else{
			//����ʹ���һ���Ự���ڻỰ�����ȡ�û�����Ϣ�����û���û���Ϣ���ͱ�ʾû�е���
			HttpSession session=req.getSession();
			//���session��Ϊ�գ��ͱ�ʾ�û��ѵ��룬�Ự����������user�������ģ����Ծ�ֱ�ӷ��У����ɺ�����Servlet����
			if(session.getAttribute("user")!=null){
				chain.doFilter(req, resp);
			}else{
				//������ض������ҳ��
				resp.sendRedirect("login.jsp");
			}
		}
	}
		//���������ڳ�ʼ����ʱ����ô˷�����������һ��
	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}
	
}
