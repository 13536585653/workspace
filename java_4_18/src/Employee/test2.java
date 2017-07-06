package Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class test2 {
	public static void main(String[] args) {
		List<Employee> list=new ArrayList<Employee>();
		Employee emp1=new Employee("张三", 27, 1400);
		Employee emp2=new Employee("李四", 23, 2200);
		Employee emp3=new Employee("王五", 18, 2000);
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		//Employee[] emps={emp1,emp2,emp3};
		//Arrays.sort(emps);//按照工资来排序
		System.out.println("反转前"+"\n");
		System.out.println(list);
		Collections.sort(list);//将工资由底到高排序
		System.out.println();
		
		
		System.out.println("反转后"+"\n");
		Collections.reverse(list);//将工资由高到底排序
		System.out.println(list);
		
	}
}	
