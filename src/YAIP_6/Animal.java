package YAIP_6;

abstract class Animal {
	private String name;

	public Animal(String name) {
		this.name = name;
	}
	
	abstract void greets();
}
