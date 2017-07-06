package 数据库连接测试;

public class Student {
	
	
	private int t_id;
	private String t_name;
	private String t_address;
	
	public int getT_id() {
		return t_id;
	}
	public void setT_id(int t_id) {
		this.t_id = t_id;
	}
	public String getT_name() {
		return t_name;
	}
	public void setT_name(String t_name) {
		this.t_name = t_name;
	}
	public String getT_address() {
		return t_address;
	}
	public void setT_address(String t_address) {
		this.t_address = t_address;
	}
	public Student(int t_id, String t_name, String t_address) {
		super();
		this.t_id = t_id;
		this.t_name = t_name;
		this.t_address = t_address;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [t_id=" + t_id + ", t_name=" + t_name + ", t_address="
				+ t_address + "]";
	}
	
	

}
