package YAIP_6;

public class Dog extends Animal{
	public Dog(String name) {
		super(name);
	}
	
	@Override
	public void greets() {
		System.out.println("Woof");
	}
	
	public void greets(Dog another) {
		System.out.println("Woooof");
	}
	
	public static void main(String[] main) {
		Dog d3 = new Dog("prancess");
		Dog d4 = new Dog("chouchou");
		
		d3.greets();
		d3.greets(d4);
		
	}
}
