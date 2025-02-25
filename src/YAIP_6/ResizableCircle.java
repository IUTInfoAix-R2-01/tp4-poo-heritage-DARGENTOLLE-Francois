package YAIP_6;

public class ResizableCircle extends CircleDeux implements Resizable{
	
	public ResizableCircle(double radius) {
		super(radius);
	}
	
	@Override
	public String toString() {
		return "ResizableCircle=[ "+ super.toString() + "]"; 
	}
	
	@Override
	public void resize(int percent) {
		this.radius *= percent/100.0;
	}
	
	public void main(String[] args) {
		ResizableCircle rc1 = new ResizableCircle(3.5);
		System.out.println(rc1.toString());
		rc1.resize(15);
		System.out.println(rc1.toString());
	}
}
