package org.demo.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
	public static void main(String args[]){
		List<String> list = new ArrayList<String>();
		list.add("wangzai");
		list.add("夏天");
		list.add("beautiful");
		
		String s = list.get(0);
		list.get(1);
		list.get(2);
		
		//显示list的长度
		int a=list.size();
		System.out.println(a);
//		//移除元素
//		list.remove(0);
//		list.remove("夏天");
		
		
		
		//将下标为0的东西输出来
		System.out.println(s);
		System.out.println();
		//将list全部输出
		for (String l : list) {
			System.out.println(l);
		}
		System.out.println();
		//将list全部输出
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}
}
