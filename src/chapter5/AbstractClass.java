package chapter5;

public class AbstractClass {
	/*
	 * An abstract class may include nonabstract methods and variables
	 * An abstract class is not required to include any abstract methods
	 * An abstract method may only be defined in an abstract class 
	 */

}

abstract class AnimalA {
	protected int age;
	public void eat() {
		System.out.println("Animal is eating");
	}
	public abstract String getName();
}

class SwamA extends AnimalA {

	public String getName() {
		return "Swan";
	}
	
}

abstract class Cow {
	
}

class Chicken {
	// public abstract void peck(); // DOES NOT COMPILE
}

abstract class Turtle {
	// public abstract void sswim() {} // DOES NOT COMPILE
	/*public abstract int getAge() { // DOES NOT COMPILE
		return 10;
	}*/
}

// Class can be either abstract or final, not both
// final abstract class Tortoise {} // DOES NOT COMPILE

abstract class Goat {
	// Once marked as final, method can never be overridden in a subclass
	// public abstract final void chew(); // DOES NOT COMPILE
}

abstract class Whale {
	// How would you define a subclass that implements a required method
	// if method is not accessible by the subclass itself
	// private abstract void sing(); // DOES NOT COMPILE
	
	protected abstract void sing();
}

class HumpbackWhale extends Whale {
	// Subclass cannot reduce visibility of parent method
	/*private void sing() {  // DOES NOT COMPILE
		System.out.println("Humpback whale is singing");
	}*/
	
	protected void sing() {
		
	}
}



