package YAIP_6;

public class BigDog extends Dog{
	public BigDog(String name) {
		super(name);
	}
	@Override
	public void greets() {
		System.out.println("Woow");
	}
	@Override
	public void greets(Dog another) {
		System.out.println("Woooow");
	}
	
	public void greets(BigDog another) {
		System.out.println("Woooooooow");
	}
	
	public static void main(String[] main) {
		Dog d4 = new Dog("chouchou");
		BigDog b1 = new BigDog("Chouquette");
		BigDog b2 = new BigDog("Cookie");
		
		b1.greets();
		b1.greets(d4);
		b1.greets(b2);
		
	}
	
}
