package org.demo.map;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("key1", "ѧ��");
		map.put("key2", "����");
		map.put("key3", "����");
		
		int s=map.size();
		System.out.println(s);
		
		//�Ƴ�
		//map.remove("key1");
		
		map.putAll(map);
		
		//���key1��ֵ
		String m=(String)map.get("key1");
		System.out.println(m);
		
		System.out.println();
		for (String a : args) {
			System.out.println(a);
		}
	}
}
