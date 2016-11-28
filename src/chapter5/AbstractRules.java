package chapter5;

public class AbstractRules {
	/*
	 * Abstract Class
	 * - Abstract classes cannot be instantiated directly
	 * - Abstract classes may be defined with any number, including zero,
	 * 	 of abstract and non-abstract methods
	 * - Abstract classes may not be marked as private or final
	 * - An abstract class that extends another abstract class inherits all
	 *   of its abstract methods as its own abstract methods
	 * - The first concrete class that extends an abstract class must provide
	 *   an implementation for all of the inherited abstract methods
	 */
	
	/*
	 * Abstract Method
	 * - Abstract methods may only be defined in abstract classes
	 * - Abstract methods may not be declared private or final
	 * - Abstract methods must not provide a method body/implementation
	 *   in the abstract class for which is it declared
	 * - Implementing an abstract method in a subclass follows the same
	 *   rules for overriding a method. For example, the name and signature
	 *   must be the same, and the visibility of the method in the subclass 
	 *   must be at least as accessible as the method in the parent class
	 */

}
