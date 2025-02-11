package YAIP_4;

public class Cat extends Mammal{
	public Cat(String name) {
		super(name);
	}
	
	public void greets() {
		System.out.println("Meow");
	}

	@Override
	public String toString() {
		return "Cat ["+ super.toString() +"]";
	}
	
	public static void main(String[] main) {
		Cat d1 = new Cat("Belphegor");
		
		d1.greets();
		System.out.println(d1);
		
	}
	
}
