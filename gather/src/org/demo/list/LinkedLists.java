package org.demo.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedLists {
	public static void main(String[] args) {
		List list =new LinkedList();
		list.add(1);
		list.add("����");
		list.add("�¸�");
		
		list.get(2);
		list.get(0);
		//�Ƴ�
		list.remove(0);
		//���±�Ϊ1��ֵ�滻Ϊ���ж�ࡱ
		list.set(1, "�ж��");
		String l=(String) list.get(1);
		System.out.println(l);
		
		
		System.out.println();
		for (Object object : list) {
			System.out.println(object);
		}
	}
}
