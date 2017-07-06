package com.test.service;

import java.util.List;

import com.test.bean.Bulletin_board;
import com.test.dao.BbDao;

/*
 * 公告栏的业务层类
 * */
public class BbService {

	
	
	//添加公告的方法
	public void addBb(Bulletin_board bb) {
		
		//实例化一个bbdao对象，并执行插入数据的方法
		BbDao bbdao=new BbDao();
		bbdao.insertBb(bb);
	}

	//查询公告的方法
	public Bulletin_board checkBb(Bulletin_board bb) {

		//实例化一个bbdao对象，并执行查询数据的方法
		BbDao bbdao=new BbDao();
		Bulletin_board newbb=bbdao.selectBb(bb);
		
		return newbb;
	}

	//查询所有公告数据
	public List checkBb1() {
		//实例化一个bbdao对象，并执行查询所有数据的方法
		BbDao bbdao=new BbDao();
		List bblist=bbdao.selectBb1();
				
		return bblist;
	}

	//根据bb_id查询详细公告
	public String checkBb2(int bb_id) {
		BbDao bbdao=new BbDao();
		String message=bbdao.selectBb2(bb_id);
						
		return message;
	}

	//删除指定的公告
	public void deleteBb(int bb_id) {
		BbDao bbdao=new BbDao();
		bbdao.deleteBb(bb_id);
		
	}

}
