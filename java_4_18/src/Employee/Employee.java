package Employee;

public class Employee implements Comparable<Employee>{
	private String name;
	private int ege;
	private int wages;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEge() {
		return ege;
	}
	public void setEge(int ege) {
		this.ege = ege;
	}
	public int getWages() {
		return wages;
	}
	public void setWages(int wages) {
		this.wages = wages;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", ege=" + ege + ", wages=" + wages + "]";
	}
	public Employee(String name, int ege, int wages) {
		super();
		this.name = name;
		this.ege = ege;
		this.wages = wages;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int compareTo(Employee e) {
		//Employee e=(Employee)o;
		if(this.wages>e.wages){
			return 1;
		}
		else if(this.wages<e.wages){
			return -1;
		}
		else{
		return 0;
		}
	}
	
}
