package chapter5.interfaces;

public class DefaultInterface {
	/*
	 * - A default method only be declared within an interface and 
	 *   not within a class abstract class
	 * - A default method must be marked with the default keyword.
	 *   If a method is marked as default, it must provide a method body
	 * - A default method is not assumed to be static, final, or abstract, as 
	 *   it may be used or overridden by a class that implements the interface
	 * - Like all methods in an interface, a default method is assumed to be public
	 *   and will not compile if marked as private or protected
	 */
}

interface IsWarmBlooded {
	boolean hasScales();
	public default double getTemperature() {
		return 10.0;
	}
}

interface Carnivore {
	// public default void eatMeat(); // DOES NOT COMPILE
	/*public int getRequiredFoodAmount() {
		// DOES NOT COMPILE
	}*/
}

interface HasFins {
	public default int getNumberOfFins () {
		return 4;
	}
	
	public default double getLongestFinLength() {
		return 20.0;
	}
	
	public default boolean doFinsHaveScales() {
		return true;
	}
}

interface SharkFamily extends HasFins {
	public default int getNumberOfFins() {
		return 8;
	}
	
	public double getLongestFinLength();
	
	/* 
	public boolean doFinsHaveScales() {
		// DOES NOT COMPILE
		return false;
	}*/
	
}

interface Walk {
	public default int getSpeed() {
		return 5;
	}
}

interface Run {
	public default int getSpeed() {
		return 10;
	}
}

/* DOES NOT COMPILE - If a class imple
 * If a class implement two interfaces that have default methods with
 * the same name and signature, the compiler will throw error
class Cat implements Walk, Run {
	public static void main(String[] args) {
		System.out.println(new Cat().getSpeed());
	}
}*/

class CatFix implements Walk, Run{
	public int getSpeed() {
		return 1;
	}
	
	public static void main(String[] args) {
		System.out.println(new CatFix().getSpeed());
	}
}
