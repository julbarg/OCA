package chapter4;

public class Method {
	
	public final void nap(int minutes) throws InterruptedException {
		//Take a  nap
		
		/*
		 * Access modifier - public - No Required
		 * Optional specifier - final - No
		 * Return type - void - Yes Required
		 * Method name - nap . Yes
		 * Parameter list (int minutes) - Yes, but can be empty parentheses
		 * Optional exception list - throws InterruptedException - No
		 * Method body - { // take a nap } - Yes, but can be empty braces
		 */
		
		/*
		 * Access Modifiers
		 * 	public - The method can be called from any class
		 * 	private - The method can only be called from within the same class
		 * 	protected - The method can only be called from classes in the same package or subclasses
		 * 	Default (Package Private) The method can only be called from classes in the same package. 
		 * 
		 */
	}
	
	public void walk1() {}
	// default void walk2() {} // DOES NOT COMPILE
	void walk4(){}
	
	public void optionalSpecifiers() {
		/*
		 * static 
		 * abstract
		 * final
		 * synchronized OCP
		 * native Not on the OCP or OCP exam. Used when interacting with code written in another language 
		 * strictfp Not on the OCA or OCP exam. Used for making floating-point calculations portable
		 */
	}
	
	/*
	 * Optional Specifiers 
	 */
	public void walk() {}
	public final void walk2() {}
	public static final void walk3() {}
	public final static void walkF() {}
	// public modifier void walk5() {} // DOES NOT COMPILE
	// public void final walk6() {} // DOES NOT COMPILE Because the optional specifier is after the return type
	final public void walk7() {}  // Java allows the optional specifiers to appear before the access modifier
	final static synchronized public void walk88(){}
	
	/*
	 * Return Type
	 * Remeber taht a method must have a return type.
	 * If no value is returnedm the return type is void
	 */
	public void walk10(){};
	public void walk20(){return;}
	public String walk30() {return "";}
	// public String walk40() {} // DOES NOT COMPILE - Don't return anything
	// String walk60(int a){ if (a == 4) return "";} // DOES NOT COMPILE - It doesn't always return  
	
	int integer() {
		return 9;
	}
	
	/*int long() {  // DOES NOT COMPILE
		return 9L;
	} */
	
	int integerExpanded() {
		int temp = 9;
		return temp;
	}
	
	/* int longExpanded() {
		int temp = 9L; // DOES NOT COMPILE
		return temp;
	} */
	
	/*
	 * Method Names 
	 * An identifier may only contain letters, numbers, $, or _.
	 * Also, the first character is not allowed to be a number, 
	 * and reserved words are not allowed
	 */
	public void walk11(){}
	// public void 2walk(){} // DOES NOT COMPILE
	// public walk31 void(){} // DOES NOT COMPILE Because the method name is before the return type
	public void Walk_$() {}
	public void $_Walk_$() {}
	// public void() { } // DOES NOT COMPILE Because the method name is missing.
	
	/*
	 * Parameter List
	 * Although the parameter list is required, it doesn’t have to contain any parameters.
	 */
	public void walk12() {}
	// public void walk22 {} // DOES NOT COMPILE 
	// public void walk32(int a; int b) {} // DOES NOT COMPILE - Because the parameters are separated by a semicolon rather than a comma
	public void walk52(int a, int b){}
	
	/*
	 * Optional Exception List
	 */
	public void zeroExceptions(){}
	public void oneException() throws IllegalArgumentException {}
	public void twoExceptions() throws IllegalArgumentException, InterruptedException {}
	
	/*
	 * Method Body
	 */
	public void walk14() {}
	//public void walk24; // DOES NOT COMPILE Because it is missing the braces around the empty method body.
	public void walk34(int a){ int name = 5; }
	

}


