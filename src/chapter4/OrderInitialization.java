package chapter4;

public class OrderInitialization extends OrderInitializationFather {
	
	/*
	 * 1. If there is a superclass, initialize it first (we’ll cover this rule in the next chapter. For
	 * 		now, just say “no superclass” and go on to the next rule.)
	 * 2. Static variable declarations and static initializers in the order they appear in the file.
	 * 3. Instance variable declarations and instance initializers in the order they appear in the file.
	 * 4. The constructor.
	 */
	private String name = "Torchie";
	
	//Instance initializers
	{
		System.out.println(name);
		System.out.println("Bloque de Codigo");
	}
	
	private static int COUNT = 0;
	
	static {
		System.out.println(COUNT);
		System.out.println("Bloque Static 1");
	}
	static {
		COUNT += 10;
		System.out.println(COUNT);
		System.out.println("Bloque Static 2");
	}
	
	public OrderInitialization() {
		System.out.println("Constructor");
	}
	
	public static void main(String[] args) {
		OrderInitialization o = new OrderInitialization();
		/*
		 * Bloque Static 1 Father
		 * Bloque Static 2 Father
		 * Bloque Static 1
		 * Bloque Static 2
		 * Bloque de Codigo Father
		 * Constructor Father
		 * Bloque de Codigo
		 * Constructor
		 */
	}
	
	

}
