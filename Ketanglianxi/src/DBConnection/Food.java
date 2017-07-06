package DBConnection;

public class Food {
	private int id;
	private String food;
	private double price;
	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Food(int id, String food, float price) {
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
	public float getPrice() {
		return (float) price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Food [id=" + id + ", food=" + food + ", price=" + price + "]";
	}
	
	
	
}
