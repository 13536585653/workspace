package staff;

public class Employee {
	private String number;
	private String name;
	private int age;
	private String position;
	
	public Employee(){
		
	}
	public Employee(String string, String string2, String string3, String string4) {
		// TODO Auto-generated constructor stub
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
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
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	

	@Override
	public String toString() {
		return "Employee [number=" + number + ", name=" + name + ", age=" + age + ", position=" + position + "]";
	}
}
