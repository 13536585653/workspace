package staff;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class test {
	public static void main(String[] args) {
		Employee ey1=new Employee("000001","张三","15","总经理");
		Employee ey2=new Employee("000002","王五","38","组长");
		Employee ey3=new Employee("000003","小贤","33","责编");
		Employee ey4=new Employee("000004","阿龙","31","班长");
		Employee ey5=new Employee("000005","李华","24","董事长");
		
		Map<String,Employee>map=new HashMap<String,Employee>();
		map.put(ey1.getNumber(), ey1);
		map.put(ey2.getNumber(), ey2);
		map.put(ey3.getNumber(), ey3);
		map.put(ey4.getNumber(), ey4);
		map.put(ey5.getNumber(), ey5);
		
		Employee ey=map.get(000005);
		System.out.println(ey);
		System.out.println("&&&&&&&&&&&&&&");
		
		Set<String> keys=map.keySet();
	}

}
