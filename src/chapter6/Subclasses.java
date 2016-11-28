package chapter6;

public class Subclasses {
	/*
	 * When a class overrides a method from a superclass or implements a method from an interface, 
	 * it's not allowed to add new checked exceptions to the method signature
	 * 
	 * A subclass is allowed to decalre fewer exception than the superclass or interface
	 * 
	 * A class is allowed to decalre a subclass of an exception type
	 */
}

class CanNotHopException extends Exception {}

class Hopper {
	public void hop() {
		
	}
}

class Bunny extends Hopper {
	/*// DOES NOT COMPILE
	public void hop() throws CanNotHopException{
	
	}*/
}

class Hopper2 {
	public void hop() throws CanNotHopException{
		
	}
}

class Bunny2 extends Hopper2 {
	public void hop() {
	}
}

class Hopper3 {
	public void hop() throws Exception {
		
	}
}

class Bunny3 extends Hopper3 {
	public void hop() throws NoMoreCarrotsException {
	}
}

//These rules applies only to checked exceptions
class Hopper4 {
	public void hop() {
		
	}
}

class Bunny4 extends Hopper4 {
	public void hop() throws IllegalArgumentException {
		
	}
}