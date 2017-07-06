package p282_5commodity;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class test {
	public static void main(String[] args) {
		Map map=new HashMap();
		Commodity c1=new Commodity(1,"巧克力",120.9);
		Commodity c2=new Commodity(2,"青梅果",229);
		Commodity c3=new Commodity(3,"夏笋",33);
		
		Map<String,Commodity> map1=new HashMap<String,Commodity>();
		map.put(c1.getNumber(), c1);
		map.put(c2.getNumber(), c2);
		map.put(c3.getNumber(), c3);
		
		Commodity c=(Commodity) map.get(1);
		System.out.println(c);
		
		/*
		 使用list或set存数据，查找指定数据时，需要遍历整个集合.
		
		List<Student> list=new ArrayList<Student>();
		list.add(stu1);
		list.add(stu2);
		list.add(stu3);
		list.add(stu4);
		
		
		//找学号为00128002的学员
		for (Student student : list) {
			
			if(student.getNo().equals("00128002"))
				System.out.println(student);
		}
		
		*/
		//输出map里全部的值
		System.out.println("****************");
		
	}
}
