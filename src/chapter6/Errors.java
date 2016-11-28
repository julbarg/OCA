package chapter6;

public class Errors {
	/*
	 * Error extends the Error class
	 * They are thrown by the JVM and should not be handled or declared
	 * Error are rare, but you might see these
	 * 
	 * ExceptionInInitializerError
	 * 		Thrown by the JVM when a static initializer throws an exception and doesn't handle it
	 * 
	 * StackOverflowError 
	 * 		Thrown by the JVM when a method calls itself too many times 
	 * 		(this is called infinite recursion beacuse the method typically calls itself without end)
	 * 
	 * NoClassDefFoundError
	 * 		Thrown by the JVM when a class thar the code uses is available at compile time but not runtime 
	 */
	
	// ExceptionInInitializerError
	static {
		int[] countOfMoose = new int[3];
		int num = countOfMoose[-1];
	}
	
	public void StackOverflowError(int num) {
		StackOverflowError(1);
	}
	
	public static void main(String[] args) {
		
	}

}
