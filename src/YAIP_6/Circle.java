package YAIP_6;

public class Circle implements GeometricObject{
	private double radius;
	public Circle(double radius) {
		this.radius = radius;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	@Override
	public double getArea() {
		return 3.14*(radius*radius);
	}
	
	@Override
	public double getPerimeter() {
		return 2*3.14*radius;
	}
	
	public void main(String[] args) {
		Circle c1 = new Circle(2.5);
		System.out.println(c1.toString());
		System.out.println("Area :" + c1.getArea());
		System.out.println("Perimeter :" + c1.getPerimeter());
	}
}
