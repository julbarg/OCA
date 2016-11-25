package chapter5;

public class Mammal {
	
	public Mammal(int age){
		
	}

}

class Elephant extends Mammal {
	public Elephant() {
		/*
		 * The code doesn't compile, the compiler insert super()
		 * but the parent doesn't have no-argument constructor
		 */
		super(5);
		
	}
	
	public Elephant(int age) {
		super(age);
	}
	
}
