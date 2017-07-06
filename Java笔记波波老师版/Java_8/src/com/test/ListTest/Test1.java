package com.test.ListTest;

import java.util.ArrayList;

public class Test1 {
	
	public static void main(String[] args) {
		
		ArrayList list=new ArrayList();   //创建一个列表
		
		list.add(1);
		list.add("abc");
		
		Dog dog1=new Dog("小白","哈士奇");
		list.add(dog1);
		
		System.out.println("list的大小为:"+list.size());
		
		//将list全部元素输出 
		for(int i=0;i<list.size();i++){
			
			System.out.println(list.get(i));
		}
		
		//从list里移除某个元素
		list.remove(0);   //移除下标为0的元素
		
		//将list全部元素输出 
			for(int i=0;i<list.size();i++){
					
					System.out.println(list.get(i));
			}
		
		
		System.out.println("列表是否为空:"+list.isEmpty());
			
			
		//将list清空
		list.clear();   
		System.out.println("list的大小为:"+list.size());
		System.out.println("列表是否为空:"+list.isEmpty());
		
	}

}
