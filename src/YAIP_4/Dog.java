package YAIP_4;

public class Dog extends Mammal{
	public Dog(String name) {
		super(name);
	}
	
	public void greets() {
		System.out.println("Woof");
	}
	
	public void greets(Dog another) {
		System.out.println("Woooof");
	}

	@Override
	public String toString() {
		return "Dog ["+ super.toString() +"]";
	}
	
	public static void main(String[] main) {
		Dog d1 = new Dog("princess");
		Dog d2 = new Dog("chouchou");
		
		d1.greets();
		d1.greets(d2);
		System.out.println(d1);
		
	}
	
}
