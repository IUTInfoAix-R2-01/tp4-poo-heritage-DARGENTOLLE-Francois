package YAIP_6;

public class Rectangle implements GeometricObject {
	private double width;
	private double length;
	
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", length=" + length + "]";
	}
	
	@Override
	public double getArea() {
		return length*width;
	}
	
	@Override
	public double getPerimeter() {
		return 2*(length+width);
	}
	
	public void main(String[] args) {
		Rectangle r1 = new Rectangle(5.0, 7.0);
		System.out.println(r1.toString());
		System.out.println("Area :" + r1.getArea());
		System.out.println("Perimeter :" + r1.getPerimeter());
	}
}
