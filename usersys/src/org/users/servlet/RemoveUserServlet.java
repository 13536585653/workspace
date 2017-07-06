package org.users.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.users.service.RemoveUserService;

@WebServlet("/removeUserServlet")
public class RemoveUserServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		//��ȡҳ�������
		String []u_id=request.getParameterValues("uids");
		
		//newһ��service����
		RemoveUserService service =new RemoveUserService();
		//�������ݽ���ҵ��㴦��
		service.RemoveUser(u_id);
		//���Ƚ�
		//String msg= rows ==null?"ɾ��ʧ��":"ɾ���ɹ�";
		//System.out.println(msg);
		
		//ת����findAllUserҳ��
		request.getRequestDispatcher("findAllUserServlet").forward(request, response);
	}
}
