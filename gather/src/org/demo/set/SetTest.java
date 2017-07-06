package org.demo.set;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add(1);
		set.add("王子啊");
		set.add("高中");
		
		Set<String> set1 = new HashSet<String>();
		set1.add("旺仔");
		set1.add("2");
		set1.add("傻宝");
		
		//set具有无序性
		set1.addAll(set);
		System.out.println(set1);
		//移除某一个值
		//set.remove("高中");
		//清空前面设置的值
		//set.clear();
		
		System.out.println();
		for (Object s : set) {
			System.out.println(s);
		}
	}
}
