package chapter5.polymorphism;

public class Polymorphism {
	/*
	 * Java supports polymorphism
	 * The property of an object to take on many different forms.
	 * A Java object may be accessed using a reference with 
	 * - The same object
	 * - A reference that is a superclass of the object
	 * - A reference that defines an interface the object implements
	 * - Either directly or through a superclass 
	 */
	
	public static void main(String[] args) {
		Lemur lemur = new Lemur();
		System.out.println(lemur.age);
		
		HasTail hasTail = lemur;
		System.out.println(hasTail.isTailStriped());
		
		Primate primate = lemur;
		System.out.println(primate.hasHair());
		
		/*
		 * Once the object has been assigned a new reference type, 
		 * only the methods and variables available to that reference 
		 * type are callable on the object without an explicit class
		 */
		// System.out.println(hasTail.age); // DOES NOT COMPILE
		// System.out.println(primate.isTailStriped()); // DOES NOT COMPILE
		
		Lemur lemur2 = new Lemur();
		Object lemurAsObject = lemur2;
		
		/*
		 * - The type of the object determines which properties exist within the 
		 *   object in memory
		 * - The type of the reference to the object determines which methods and
		 *   variables are accessible to the Java program
		 */
		
		
		
	}
}

class Primate {
	public boolean hasHair() {
		return true;
	}
}

interface HasTail {
	public boolean isTailStriped();
}

class Lemur extends Primate implements HasTail {
	public boolean isTailStriped() {
		return false;
	}
	
	public int age = 10;
}