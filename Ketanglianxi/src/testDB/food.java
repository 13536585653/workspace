package testDB;

public class food {
	private int id;
	private String food;
	private double price;
	public food() {
		super();
		// TODO Auto-generated constructor stub
	}
	public food(int id, String food, double price) {
		super();
		this.id = id;
		this.food = food;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "food [id=" + id + ", food=" + food + ", price=" + price + "]";
	}
	
	
}
