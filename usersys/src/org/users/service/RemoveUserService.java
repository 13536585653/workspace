package org.users.service;

import org.users.dao.UserDao;

public class RemoveUserService {
	public int[] RemoveUser(String[] u_id){
		//��String�͵� ����u_idǿתΪint������
		int[] uids=new int[u_id.length];
		for (int i = 0; i < uids.length; i++) {
			uids[i]=Integer.parseInt(u_id[i]);
		}
		//ҵ����������dao�����ɾ������
		UserDao dao=new UserDao();
		int []rows=dao.RemoveUser(uids);
		return rows;
	}
}
