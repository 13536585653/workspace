package p282_5commodity;

public class Commodity {
	private int number;//���
	private String Commodityname;//��Ʒ����
	private double univalence;//����
	public Commodity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Commodity(int number, String commodityname, double univalence) {
		super();
		this.number = number;
		this.Commodityname = commodityname;
		this.univalence = univalence;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getCommodityname() {
		return Commodityname;
	}
	public void setCommodityname(String commodityname) {
		Commodityname = commodityname;
	}
	public double getUnivalence() {
		return univalence;
	}
	public void setUnivalence(double univalence) {
		this.univalence = univalence;
	}
	@Override
	public String toString() {
		return "Commodity [number=" + number + ", Commodityname=" + Commodityname + ", univalence=" + univalence + "]";
	}
	
	
}
