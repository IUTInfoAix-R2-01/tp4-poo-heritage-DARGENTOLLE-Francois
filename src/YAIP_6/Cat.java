package YAIP_6;

public class Cat extends Animal{
	public Cat(String name) {
		super(name);
	}
	@Override
	public void greets() {
		System.out.println("Meow");
	}
	
	public static void main(String[] main) {
		Cat d3 = new Cat("Baal");
		Cat d4 = new Cat("Belphegor");
		
		d3.greets();
		d4.greets();
		
	}
}
