package chapter5;

public class FinalMethods {
	/*
	 * You cannot hide a static method in a parent class if it is marked as final
	 * 
	 */

}

class Bird {
	
	public final boolean hasFeathers() {
		return true;
	}
}

class Penguin extends Bird {
	/* DOES NOT COMPILE
	 * You cannot overriding a final method
	public final boolean hasFeathers() {
		return false;
	}*/
}
