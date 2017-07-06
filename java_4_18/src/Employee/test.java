package Employee;

import java.util.Arrays;

public class test {
	public static void main(String[] args) {
		Employee emp1=new Employee("张三",23,2300);
		Employee emp2=new Employee("李四",24,2999);
		Employee emp3=new Employee("王五",22,2000);
		
		System.out.println("按照工资来排序..."+"\n");
		Employee[] emps={emp1,emp2,emp3};
		Arrays.sort(emps);
		for (Employee e : emps) {
			System.out.println(e);
		}
	}

}
