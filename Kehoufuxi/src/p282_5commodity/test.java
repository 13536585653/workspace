package p282_5commodity;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class test {
	public static void main(String[] args) {
		Map map=new HashMap();
		Commodity c1=new Commodity(1,"�ɿ���",120.9);
		Commodity c2=new Commodity(2,"��÷��",229);
		Commodity c3=new Commodity(3,"����",33);
		
		Map<String,Commodity> map1=new HashMap<String,Commodity>();
		map.put(c1.getNumber(), c1);
		map.put(c2.getNumber(), c2);
		map.put(c3.getNumber(), c3);
		
		Commodity c=(Commodity) map.get(1);
		System.out.println(c);
		
		/*
		 ʹ��list��set�����ݣ�����ָ������ʱ����Ҫ������������.
		
		List<Student> list=new ArrayList<Student>();
		list.add(stu1);
		list.add(stu2);
		list.add(stu3);
		list.add(stu4);
		
		
		//��ѧ��Ϊ00128002��ѧԱ
		for (Student student : list) {
			
			if(student.getNo().equals("00128002"))
				System.out.println(student);
		}
		
		*/
		//���map��ȫ����ֵ
		System.out.println("****************");
		
	}
}
