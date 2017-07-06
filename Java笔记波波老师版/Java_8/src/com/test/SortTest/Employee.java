package com.test.SortTest;

public class Employee  implements Comparable<Employee>{
	
	private String name;
	private int age;
	private  String sex;
	private  double salaxy;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public double getSalaxy() {
		return salaxy;
	}
	public void setSalaxy(double salaxy) {
		this.salaxy = salaxy;
	}
	
	public Employee(String name, int age, String sex, double salaxy) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.salaxy = salaxy;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", sex=" + sex
				+ ", salaxy=" + salaxy + "]";
	}
	
	
	/*
	 * 重写 可比较的方法
	 * 按员工的年龄比较
	 * 
	 */
	public int compareTo(Employee e) {
		if(this.age > e.age)
			 return 1;
		 else if(this.age <e.age)
			 return -1;
		 else
			 return 0;
	}
	
	
	

}
