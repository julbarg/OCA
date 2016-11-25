package chapter5;


public class InheritateMethods {
	
	/*
	 * Overriding
	 * - Method in child must have same signature as method in parent
	 * - Method in child must be at least as accessible or more accessible than method in parent
	 * - Method in child may not throw a exception that is new or broader than the class of any exception thrown in the parent class method
	 * - If method return a value, it must be the same or a subclass of the method in the parent class, know as covariant return types
	 */
	
	public static void main(String[] args) {
		try {
			System.out.println(new Canine().getAverageWeight());
			System.out.println(new Wolf().getAverageWeight());
		} catch (Exception e) {
		}
		
	}

}

class Canine {
	public double getAverageWeight() throws Exception  {
		return 50;
	}
}

class Wolf extends Canine {
	public double getAverageWeight() throws Exception {
		return super.getAverageWeight() + 20;
	}
}

class Camel {
	protected String getNumberOfHumps() {
		return "Undefined";
	}
	
	private String getNumber() {
		return "Came";
	}
}

class BactrianCamel extends Camel {
	
	/*
	private String getNumberOfHumps() {  // DOES NOT COMPILE
		// TODO Auto-generated method stub
		return super.getNumberOfHumps();
	}*/
	
	private int getNumber() {
		return 0;
	}
}

class InsufficientDataException extends Exception {}

class Reptile {
	protected boolean hasLegs() throws InsufficientDataException {
		throw new InsufficientDataException();
	}
	
	protected double getWeight() throws Exception {
		return 2;
	}
}

class Snake extends Reptile {
	protected boolean hasLegs() {
		return false;
	}
	
	protected double getWeight() throws InsufficientDataException{
		return 2;
	}
}
