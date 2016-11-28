	package chapter6;

import javax.xml.ws.ServiceMode;

public class ExceptionUse {
	/*
	 * An exception is an event that alters program flow. Java has a Throwable
	 * superclass for all objects that represents these events
	 * 
	 * Error menas something went so horrbly wrong thar you program should not
	 * attempt to recover from it
	 * 
	 * A runtime exception is defined as the RuntimeException class and its
	 * subclasses. Runtime exceptions tend to be unexpected but not necessarily
	 * fatal Runtime exceptions are also known as Unchecked Exceptions
	 * 
	 * A runtime (unchecked) exception is a specific type of exception
	 * 
	 * A checked exception includes Exception and all subclasses that do not
	 * extend RuntimeException For checked exceptions, Java requires the code to
	 * either handle them or declate them in the method signature
	 */
	
	/*
	 * Runtime exception 
	 * 	- (Recognize) Subclass of RuntimeException - Catch - No required to handle
	 * Checked exception 
	 *  - (Recognize) Subclass of Exception but not subclass of RuntimeException - Catch - Yes required to handle
	 * Error
	 *  - (Recognize) Subclass of Error - No Catch - No required
	 */

	void fall() throws Exception {
		throw new Exception();
	}
	
	void exceptions() throws Exception {
		/*
		 * When creating an exception, you can usually pass a String parameter with a message or
		 * you can pass no parameters and use the defaults
		 */
		int i = 0;
		if(i == 0)
			throw new Exception();
		if(i == 1)
			throw new Exception("Ow! I fell.");
		if(i == 2)
			throw new RuntimeException();
		if(i == 3)
			throw new RuntimeException("Ow! I fell.");
	}
	
	void explore() {
		try{
			fallE();
			System.out.println("never get here");
		} catch(RuntimeException e) {
			getUp();
		}
		seeAnimals();
	}
	
	void fallE() {
		throw new RuntimeException();
	}
	void getUp() {
		System.out.println("Get up");
	}
	void seeAnimals() {
		System.out.println("See Animals");
	}
	
	
	public static void main(String[] args) {
		String[] animals = new String[0];
		System.out.println(animals[0]); // ArrayIndexOutOfBoundsException
		
	}
	
	void errorCompile() {
		/* // DOES NOT COMPILE
		try
			fall();
		catch (Exception e)
			System.out.println("get up");
		*/
		
		/*// DOES NOT COMPILE
		try{
			fall();
		}*/
		
		try{
			fall();
		} catch (Exception e) {
			System.out.println("get up");
		}
	}
	
	void exploreF() {
		try{
			seeAnimals();
			fall();
		} catch (Exception e) {
			getHugFromDaddy();
		} finally {
			seeMoreAnimals();
		}
	}

	void seeMoreAnimals() {
		System.out.println("See more animlas");
		
	}

	void getHugFromDaddy() {
		System.out.println("Hugs from Daddy");
		
	}
	
	void errorOrder() {
		/*// DOES NOT COMPILE
		try{
			fallE();
		} finally {
			System.out.println("All better");
		} catch (Exception e) {
			System.out.println("Get Up");
		} */
		
		/*// DOES NOT COMPILE
		try {
			fallE();
		} */
		
		try{
			fallE();
		} finally {
			System.out.println("All Better");
		}
	}
	
	void test() {
		String s = "";
		try {
			s += "t";
		} catch (Exception e) {
			s += "c";
		} finally {
			s += "f";
		}
		s += "a";
		System.out.println(s);
	}
}
