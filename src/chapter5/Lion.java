package chapter5;

public class Lion extends Animal {
	
	public Lion(int age) {
		super(age);
		// TODO Auto-generated constructor stub
	}

	private void roar() {
		System.out.println("The " + getAge() + " year old lion says: Roar!");
		
		
		//System.out.println("The " + age + " year old lion says: Roar!"); // DOES NOT COMPILE
	}

}
