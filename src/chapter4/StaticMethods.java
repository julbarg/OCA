package chapter4;

public class StaticMethods {
	
	/*
	 * Static methods don't require an instance of the class
	 */
	
	private String name = "Static class";
	public static void first() {}
	public static void second() {}
	public void third() { System.out.println(name); }
	
	public static void getKoala(){
		
	}
	
	public static int count = 0; // static variable
	
	public static void main(String[] args) {
		System.out.println(StaticMethods.count);
		
		StaticMethods sm = new StaticMethods();
		System.out.println(sm.count);
		sm = null;
		System.out.println(sm.count);
		
		System.out.println();
		
		StaticMethods.count = 4;
		StaticMethods s1 = new StaticMethods();
		StaticMethods s2 = new StaticMethods();
		
		s1.count = 6;
		s2.count = 5;
		System.out.println(StaticMethods.count);
		System.out.println(s1.count);
		System.out.println(s2.count);
		
		first();
		second();
		// third(); // DOES NOT COMPILE
		new StaticMethods().third();
	}

}
