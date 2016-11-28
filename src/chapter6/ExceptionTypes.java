package chapter6;

public class ExceptionTypes {
	
	int numberEggs;
	String name;
	
	/*
	 * Runtime Exceptions
	 * Runtime exceptions extend RuntimeException. The don't have to be handled or declared
	 * They can be thrown by the programmer or by the JVM.
	 * Common runtime exceptions are:
	 * 
	 * ArithmeticException
	 * 		Thrown by the JVM when code attempts to divide by zero
	 * 
	 * ArrayIndexOutOfBoundsException 
	 * 		Thrown by the JVM when code uses an ilegal index to access an array
	 * 
	 * ClassCastException
	 * 		Thrown by the JVM when an attempt is made to cast an exception to a subclass of which it is not an instance
	 * 
	 * IllegalArgumentException
	 * 		Thrown by the PROGRAMMER PROGRAMMER to indicate that a method has been passed an illegal or inappropriate argument
	 * 
	 * NullPointerException 
	 * 		Thrown by the JVM when there is a null reference where an object is required
	 * 
	 * NumberFormatException
	 * 		Thrown by the PROGRAMER PROGRAMER when an attempt is made to convert a string to a numeric type but the string doesn't have
	 * 		an appropriate format
	 */
	
	public void ArithmeticException() {
		int answer = 11 / 0;
	}
	
	public void ArrayIndexOutOfBoundsException() {
		int[] countOfMoose = new int[3];
		System.out.println(countOfMoose[-1]);
	}
	
	public void ClassCastException() {
		String type = "moose";
		Object obj = type;
		Integer number = (Integer) obj;
	}
	
	public void IllegalArgumentException(int numberEggs) {
		if(numberEggs < 0)
			throw new IllegalArgumentException("# eggs must not be negative");
		this.numberEggs = numberEggs;
	}
	
	public void NullPointerException() throws NullPointerException {
		System.out.println(name.length());
	}
	
	public void NumberFormatException() {
		Integer.parseInt("abc");
	}
	
	/*
	 * Checked Exceptions
	 * Checked exceptions have Exception in their hierarchy but nt RuntimeException
	 * They must be handled or declared
	 * They can be thrown by the programmer or by the JVM
	 * Common runtime exceptions include the following
	 * 
	 * FileNotFoundException
	 * 		Thrown programmatically when code tries to reference a file that does not exist
	 * 
	 * IOException
	 * 		Thrown programmatically when there's a problem reading or writting a file
	 * 
	 */
	
	
}



