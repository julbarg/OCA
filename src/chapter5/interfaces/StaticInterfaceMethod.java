package chapter5.interfaces;

public class StaticInterfaceMethod {
	/*
	 * There is really only distinction between a static method
	 * in a class and an interface. 
	 * A static method defined in an interface not inherited in any
	 * class that implement the interface
	 * - Like all methods in an interface, a static method is assumed
	 *   to be public and will not compile if marked as private or protected
	 * - To reference the static method, a reference to the name of the 
	 *   interface must be used
	 */
}

interface Hop {
	static int getJumpHeight() {
		return 8;
	}
}

class BunnyC implements Hop {
	public static void main(String[] args) {
		// System.out.println(getJumpHeight()); // DOES NOT COMPILE
		System.out.println(Hop.getJumpHeight());
	}
}