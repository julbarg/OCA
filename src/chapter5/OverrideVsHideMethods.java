package chapter5;

public class OverrideVsHideMethods {
	
	/*
	 * Overriding a method, in which child method replaces parent methods
	 * in calls defined in both the parent and child
	 * Hidden methods only replace parent methods in the calls defined in the child 
	 * 
	 */
	public static void main(String[] args) {
		Kangaroo joey = new Kangaroo();
		joey.getMarsupialDescription();
		joey.getKangarooDescription();
		
	}
}

class Marsupial {
	
	public String name = "Marsupial";
	//Hidden Methods
	public static boolean isBiped() {
		return false;
	}

	public void getMarsupialDescription() {
		System.out.println("Marsupial walks on two legs: " + isBiped());
		System.out.println(isRight());
		System.out.println(name);
	}
	
	public void print() {
		System.out.println("Parent");
	}
	
	//Overriding Methods
	public String isRight() {
		return "isRight Padre";
	}
}

class Kangaroo extends Marsupial {
	public String name = "Kangaroo";
	//Hidden Methods
	public static boolean isBiped() {
		return true;
	}

	public void getKangarooDescription() {
		System.out.println("Kangaroo hops on two legs: " + isBiped());
		System.out.println(isRight());
		System.out.println(name);
	}
	
	public void print() {
		System.out.println("Son");
	}
	
	//Overriding Methods
	public String isRight() {
		return "isRight Hijo";
	}
}
