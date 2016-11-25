package chapter5;

public class Constructor {
	
	/*
	 * Every class has at least one constructor 
	 * In the case that no constructor is declared, 
	 * the compiler will automatically insert a default no-argument
	 * 
	 * The first statement of every constructor is either a call to 
	 * another constructor within the class, using this(), or a call
	 * to a constructor in direct parent class, using super()
	 */
	
	/*
	 * super() can only be used as the first statement of the constructor.
	 */
	
	/*
	 * CONSTRUCTOR RULES
	 * - The first statement of every constructor is a call to another constructor this() or super()
	 * - The super() not be used after the first statement of the constructor
	 * - If no super() is declared in, Java insert no-argument super() as the first statement of the constructor
	 * - If parent doesn't have a no-argument constructor and child doesn't define constructor, throw error
	 * - If the parent doesn't have no-argument constructor, the compiler requires an explicit call to a parent constructor in each child
	 */

}
