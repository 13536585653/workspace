package com.test.ListTest;

import java.util.ArrayList;

public class Test1 {
	
	public static void main(String[] args) {
		
		ArrayList list=new ArrayList();   //����һ���б�
		
		list.add(1);
		list.add("abc");
		
		Dog dog1=new Dog("С��","��ʿ��");
		list.add(dog1);
		
		System.out.println("list�Ĵ�СΪ:"+list.size());
		
		//��listȫ��Ԫ����� 
		for(int i=0;i<list.size();i++){
			
			System.out.println(list.get(i));
		}
		
		//��list���Ƴ�ĳ��Ԫ��
		list.remove(0);   //�Ƴ��±�Ϊ0��Ԫ��
		
		//��listȫ��Ԫ����� 
			for(int i=0;i<list.size();i++){
					
					System.out.println(list.get(i));
			}
		
		
		System.out.println("�б��Ƿ�Ϊ��:"+list.isEmpty());
			
			
		//��list���
		list.clear();   
		System.out.println("list�Ĵ�СΪ:"+list.size());
		System.out.println("�б��Ƿ�Ϊ��:"+list.isEmpty());
		
	}

}
