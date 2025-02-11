package YAIP_5;

public class Cylinder {
	private Circle base;
	private double height;
	
	public Cylinder() {
		this.base = new Circle();
		this.height = 1.0;
	}

	@Override
	public String toString() {
		return "Cylinder [" + base + ", height=" + height + "]";
	}
	
	public static void main(String[] args) {
		Cylinder c1 = new Cylinder();
		
		System.out.println(c1);
	}
	
}
