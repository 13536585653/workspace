package org.demo.service;

import org.demo.dao.UserDao;
import org.demo.entity.User;

public class LoginService {
	/*
	 * У���û��ĺϷ���
	 */
	public User checkUser(User user){
		UserDao dao=new UserDao();
		User newUser=dao.findUser(user);
		if(newUser!=null){
			//У���û�������
			if(newUser.getPassword().equals(user.getPassword())){
				return user;
			}
		}
		return null;
	}
}
