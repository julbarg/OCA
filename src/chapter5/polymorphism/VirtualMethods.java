package chapter5.polymorphism;

public class VirtualMethods {
	/*
	 * A method in which the specific implementation is not determined
	 * until runtime.
	 */
	
	public static void main(String[] args) {
		BirdV birdV = new Peacock();
		birdV.displayInformation();
	}
}

class BirdV {
	public String getName() {
		return "Unknown";
	}
	
	public void displayInformation() {
		System.out.println("The bird name is: "+ getName());
	}
}

class Peacock extends BirdV {
	public String getName() {
		return "Peacock";
	}
}