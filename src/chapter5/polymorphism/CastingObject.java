package chapter5.polymorphism;

public class CastingObject {
	/*
	 * - Casting an object from a subclass to a superclass
	 *   don't require an explicit cast
	 * - Casting an object from a superclass to a subclass requires
	 *   an explicit cast
	 * - The compiler will not allow cast to unrelated types
	 * - Even when the code compiles without issue, an exception may be
	 *   thrown at runtime if the object being cast is not actually an 
	 *   instance of that class
	 */
	public static void main(String[] args) {
		Lemur lemur = new Lemur();
		Primate primate = lemur;
		
		// Lemur lemur2 = primate; // DOES NOT COMPILE
		Lemur lemur3 = (Lemur) primate;
		System.out.println(lemur3.age);
		
		Rodent rodent = new Capybara();
		Capybara capybara = (Capybara) rodent;
		
	}

}

class Bird {}

class Fish {
	public static void main(String[] args) {
		Fish fish = new Fish();
		// Bird bird = (Bird) fish; // DOES NOT COMPILE
	}
}

class Rodent {
	public void getName(){}
}

class Capybara extends Rodent {
	public int age = 9;
	
	@Override
	public void getName() {
		// TODO Auto-generated method stub
		super.getName();
	}
	
}
