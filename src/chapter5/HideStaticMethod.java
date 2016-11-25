package chapter5;

public class HideStaticMethod {
	
	/*
	 * Hiding Static Methods
	 * - Method in child must have same signature as method in parent
	 * - Method in child must be al least as accessible or more accessible than method in parent
	 * - Method in child may no throw a checked exception that is new or broader than class of any exception throw in parent
	 * - If method return a value, it must be same or a subclass of method in parent
	 * - Method defined in child must be marked as static if it is marked as static in parent. Method must not be marked as static 
	 *   in child if it is not marked static in parent
	 */
	
	public static void main(String[] args) {
		Panda.eat();
		Bear.eat();
	}
	
}

class Bear {
	public static void eat() {
		System.out.println("Bear is eating");
	}
	
	public static void sneeze() {
		System.out.println("Bear is sneezing");
	}
	
	public void hibernate() {
		System.out.println("Bear is hibernating");
	}
}

class Panda extends Bear {
	public static void eat() {
		System.out.println("Panda bear is chewing");
	}
	
	/*
	 * DOES NOT COMPILE It must be marked like a static
	public void sneeze() {
		System.out.println("Panda Bear sneezes quietly");
	}*/
	
	/*
	 * DOES NOT COMPILE It may not marked like a static
	public static void hibernate() {
		System.out.println("Panda Bear is going to sleep");
	}*/
	
	
}
