package Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class test2 {
	public static void main(String[] args) {
		List<Employee> list=new ArrayList<Employee>();
		Employee emp1=new Employee("����", 27, 1400);
		Employee emp2=new Employee("����", 23, 2200);
		Employee emp3=new Employee("����", 18, 2000);
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		//Employee[] emps={emp1,emp2,emp3};
		//Arrays.sort(emps);//���չ���������
		System.out.println("��תǰ"+"\n");
		System.out.println(list);
		Collections.sort(list);//�������ɵ׵�������
		System.out.println();
		
		
		System.out.println("��ת��"+"\n");
		Collections.reverse(list);//�������ɸߵ�������
		System.out.println(list);
		
	}
}	
