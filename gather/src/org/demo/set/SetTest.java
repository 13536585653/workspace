package org.demo.set;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add(1);
		set.add("���Ӱ�");
		set.add("����");
		
		Set<String> set1 = new HashSet<String>();
		set1.add("����");
		set1.add("2");
		set1.add("ɵ��");
		
		//set����������
		set1.addAll(set);
		System.out.println(set1);
		//�Ƴ�ĳһ��ֵ
		//set.remove("����");
		//���ǰ�����õ�ֵ
		//set.clear();
		
		System.out.println();
		for (Object s : set) {
			System.out.println(s);
		}
	}
}
