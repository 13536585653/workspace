package org.users.service;

import org.users.dao.UserDao;
import org.users.entity.UserBean;

public class LoginService {
	//����û���service����
	public UserBean checkUser(UserBean user){//�����user�ǿͻ��˵��û�
		UserDao dao =new UserDao();
		//����dao�����findUserByName()�����������user�Ǵ����ݿ��������ģ����ظ�User����
		UserBean User=dao.findUserByName(user);
		//�����ݿ�������User�Ƿ���ڣ�������ڣ��ͷ���������û�����������ڣ��ͷ���null��
		if(User!=null){
			if(User.getU_password().equals(user.getU_password())){
				return User;
			}
		}
		return null;
	}
}
