package com.test.service;

import java.util.List;

import com.test.bean.Bulletin_board;
import com.test.dao.BbDao;

/*
 * ��������ҵ�����
 * */
public class BbService {

	
	
	//��ӹ���ķ���
	public void addBb(Bulletin_board bb) {
		
		//ʵ����һ��bbdao���󣬲�ִ�в������ݵķ���
		BbDao bbdao=new BbDao();
		bbdao.insertBb(bb);
	}

	//��ѯ����ķ���
	public Bulletin_board checkBb(Bulletin_board bb) {

		//ʵ����һ��bbdao���󣬲�ִ�в�ѯ���ݵķ���
		BbDao bbdao=new BbDao();
		Bulletin_board newbb=bbdao.selectBb(bb);
		
		return newbb;
	}

	//��ѯ���й�������
	public List checkBb1() {
		//ʵ����һ��bbdao���󣬲�ִ�в�ѯ�������ݵķ���
		BbDao bbdao=new BbDao();
		List bblist=bbdao.selectBb1();
				
		return bblist;
	}

	//����bb_id��ѯ��ϸ����
	public String checkBb2(int bb_id) {
		BbDao bbdao=new BbDao();
		String message=bbdao.selectBb2(bb_id);
						
		return message;
	}

	//ɾ��ָ���Ĺ���
	public void deleteBb(int bb_id) {
		BbDao bbdao=new BbDao();
		bbdao.deleteBb(bb_id);
		
	}

}
