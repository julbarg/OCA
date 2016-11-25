package chapter5;

public class Animal extends java.lang.Object {
	
	private int age;
	
	private String name;

	public Animal(int age) {
		super();
		this.age = age;
		// super(); // Here DOES NOT COMPILE 
		//super debe ser definido en la primera linea del constructor
	}
	
	public Animal(int age, String name){
		super();
		this.age = age;
		this.setName(null);
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
