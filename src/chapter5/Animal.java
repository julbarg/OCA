package chapter5;

public class Animal extends java.lang.Object {
	
	private int age;
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public Animal(int age) {
		super();
		this.age = age;
		// super(); // DOES NOT COMPILE 
		//super debe ser definido en la primera linea del constructor
	}

}
