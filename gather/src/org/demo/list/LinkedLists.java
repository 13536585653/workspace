package org.demo.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedLists {
	public static void main(String[] args) {
		List list =new LinkedList();
		list.add(1);
		list.add("旺仔");
		list.add("勇敢");
		
		list.get(2);
		list.get(0);
		//移除
		list.remove(0);
		//将下标为1的值替换为“仔多多”
		list.set(1, "仔多多");
		String l=(String) list.get(1);
		System.out.println(l);
		
		
		System.out.println();
		for (Object object : list) {
			System.out.println(object);
		}
	}
}
