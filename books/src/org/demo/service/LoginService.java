package org.demo.service;

import org.demo.dao.UserDao;
import org.demo.entity.UserBean;

public class LoginService {
	public UserBean checkUser(UserBean user){
		UserDao dao=new UserDao();
		UserBean User=dao.findUser(user);
		if(User!=null){
			if(User.getU_password().equals(user.getU_password())){
				return User;
			}
		}
			return null;
	}
	
	
}	
