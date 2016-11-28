package chapter5;

public class ConcreteClass {
	/*
	 * A concrete class is the first nonabstract subclass that
	 *  extends an abstract class and is required to implement
	 *  all inherited abstract methods
	 */

}

abstract class Eel {
	public static void main(String[] args) {
		// Abstract class cannot be instanced
		// final Eel eel = new Eel(); // DOES NOT COMPILE
	}
}

abstract class AnimalC {
	public abstract String getName();
}

class Walrus extends AnimalC {
	public String getName() {
		return "Walrus";
	}
}

class Flamingo extends Walrus {
	public String getName() {
		return "Flamingo";
	}
}
