package org.demo.service;

import org.demo.dao.MessageDao;

public class MessageService {
	public int[] removeMessage(String[] mid){
		int[] mids=new int[mid.length];
		for (int j = 0; j < mids.length; j++) {
			mids[j]=Integer.parseInt(mid[j]);
		}
		//业务处理完成后调用dao层进行操作。
		MessageDao md=new MessageDao();
		int[] rows=md.removeMassage(mids);
		return rows;
	}
}
