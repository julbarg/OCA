package chapter4;

public class OverloadingMethods {
	
	/*
	 * Method overloading occurs when there are different method signatures
	 * with the same name but different type parameters
	 */
	
	public void fly(int numMiles){}
	public void fly(short numFeet){}
	public int fly(String f){return 8;}
	public boolean fly(){ return false; }
	void fly(int numMiles, short numFeet) {}
	public void fly (short numFeet, int numMiles) throws Exception {}
	
	public void fly2(int numMiles) { }
	// public int fly2(int numMiles) { } // DOES NOT COMPILE
	
	public void fly3(int numMiles) {}
	// public static void fly3(int numMiles) {} // DOES NOT COMPILE
	
	public static void fly4 (int numMiles) {
		System.out.println("int");
	}
	
	public static void fly4 (short numFeet) {
		System.out.println("short");
	}
	
	public static void flyInt(Integer numMiles) {
		System.out.println("Integer");
	}
	
	public static void flyInt(int numMiles){
		System.out.println("Int");
	}
	
	public static void fly(int... lengths) {}
	// public static void fly(int[] lengths) {} // DOES NOT COMPILE
	
	
	public static void main(String[] args) {
		fly4(1);
		short num = 1;
		fly4(num);
		fly4((short) 2);
		
		fly(1,2,3,4,5);
		fly(new int[] {1,2,3,4,5});
		
		/*
		 * Autoboxing
		 * Java tries to use the most specific parameter
		 */
		flyInt(2);
		flyInt(new Integer(2));
		flyInt(Integer.parseInt("2")); //int
		// flyInt(Integer.parseInt(2)); //int DOES NOT COMPILE
		flyInt(Integer.valueOf("2")); //Integer
		flyInt(Integer.valueOf(2)); //Integer
	}
	

}
