package org.demo.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
	public static void main(String args[]){
		List<String> list = new ArrayList<String>();
		list.add("wangzai");
		list.add("����");
		list.add("beautiful");
		
		String s = list.get(0);
		list.get(1);
		list.get(2);
		
		//��ʾlist�ĳ���
		int a=list.size();
		System.out.println(a);
//		//�Ƴ�Ԫ��
//		list.remove(0);
//		list.remove("����");
		
		
		
		//���±�Ϊ0�Ķ��������
		System.out.println(s);
		System.out.println();
		//��listȫ�����
		for (String l : list) {
			System.out.println(l);
		}
		System.out.println();
		//��listȫ�����
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}
}
