package chapter1;

public class VariableScope {
	
	/*
	 * SOCPE
	 * Local variables - in scope from declaration to end of block
	 * Instance variables - in scope from declaration until object garbage collected
	 * Class variables - in scope from declaration until program ends
	 */
	
	static int MAX_LENGHT = 5; // class variable
	int length; // instance variable
	
	// inches and newSize local variables
	public void grow(int inches){
		if(length < MAX_LENGHT){
			int newSize = length + inches;
			length = newSize;
		}
	}
	
	public void eatIfHungry(boolean hungry){
		if(hungry){
			int bitesOfCheese = 1;
		}
		// bitesOfCheese goes out of scope here
		//System.out.println(bitesOfCheese); // DOES NOT COMPILE
	}

}
