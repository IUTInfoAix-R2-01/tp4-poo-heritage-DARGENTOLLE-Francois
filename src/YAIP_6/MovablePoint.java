package YAIP_6;

public class MovablePoint implements Movable{
	int x;
	int y;
	int xSpeed;
	int ySpeed;
	
	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	@Override
	public String toString() {
		return "(" + x + ", " + y + ") , speed= (" + xSpeed + ", " + ySpeed + ")";
	}
	
	@Override
	public void moveUp() {
		this.y -= ySpeed;
	}
	
	@Override
	public void moveDown() {
		this.y += ySpeed;
	}
	
	@Override
	public void moveLeft() {
		this.x -= xSpeed;
	}
	
	@Override
	public void moveRight() {
		this.x += xSpeed;
	}
	
	public void main(String[] args) {
		MovablePoint m1 = new MovablePoint(8, 9, 20, 10);
		
		System.out.println(m1.toString());
		m1.moveDown();
		m1.moveRight();
		System.out.println(m1.toString());
		m1.moveUp();
		m1.moveLeft();
		System.out.println(m1.toString());
	}
}
