package org.demo.test;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/test")
public class TestServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void service(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
	/**
	 * �������
	 */
			System.out.println("��������");
			//�����ݴ�������������
			request.setAttribute("name", "yw");
			request.setAttribute("name", "����");
			
			//���������������Ƴ�����
			request.removeAttribute("name");
			System.out.println();
			System.out.println();
	/**
	 * Session����		
	 */
			//��������request.getSession()����ʱ
			//�����ȼ��֮ǰ�Ƿ񴴽���һ��session�����û���򴴽�һ��sessionʵ��
			//����ֱ�ӻ�ȡ֮ǰ�����õ� session������ʹ��
				
			HttpSession session=request.getSession();
			//������
			session.setAttribute("Name", "Yw");
			//�滻session��������keyΪName������
			session.setAttribute("Name", "����");
			//�Ƴ�session�е�����
			session.removeAttribute("Name");
			//������sessionʧЧ
			session.invalidate();
			System.out.println();
			System.out.println();
	/**
	 * �����ļ���
	 */
			ServletContext ct=request.getServletContext();
			//������
			ct.setAttribute("YY", "yw");
			//�滻��������������keyΪYY������
			ct.setAttribute("YY", "��Ұ");
			//�Ƴ��������������е�����
			ct.removeAttribute("YY");
	}
}
