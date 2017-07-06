package org.demo.map;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("key1", "学生");
		map.put("key2", "宝妈");
		map.put("key3", "鸟叔");
		
		int s=map.size();
		System.out.println(s);
		
		//移除
		//map.remove("key1");
		
		map.putAll(map);
		
		//输出key1的值
		String m=(String)map.get("key1");
		System.out.println(m);
		
		System.out.println();
		for (String a : args) {
			System.out.println(a);
		}
	}
}
