package chapter6;

public class CallMethodsThrowException {
	public static void main(String[] args) throws NoMoreCarrotsException {
		// eatCaarrot(); // DOES NOT COMPILE
		
		/*
		 * NoMoreCarrotsException is a checked exception
		 * Checekd exception must be habdled or declared
		 */
		
		eatCaarrot();
		try {
			eatCaarrot();
		} catch (NoMoreCarrotsException e) {
			System.out.println("sad rabbit");
		}
		
	}
	
	public void bad() {
		/*try {  // DOES NOT COMPILE
			eatCaarrotW();
		} catch (NoMoreCarrotsException e) {
			
		}*/
	}
	
	private static void eatCaarrot() throws NoMoreCarrotsException {
		
	}
	
	private static void eatCaarrotW() {
		
	}
}

class NoMoreCarrotsException extends Exception {}


