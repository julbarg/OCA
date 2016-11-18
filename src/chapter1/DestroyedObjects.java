package chapter1;

public class DestroyedObjects extends Object {
	
	public void method(){
		System.gc(); // Runs garbage collector !NOPE Java is free to ignore the request 
		
		/*
		 * An object is no longer reachable when one of
		 * two situation occurs:
		 *  - The object no longer has any reference poiting to it
		 *  - All reference to the object have gone out of scope
		 *  
		 *  Run GC
		 */
		
		// A Refence name
		// An Object in The Heap
		
	}
	
	public static void main(String[] args) {
		String one, two;
		one = new String("a");
		two = new String("b"); //GC
		one = two;
		String three = one;
		one = null;
		
		DestroyedObjects f = new DestroyedObjects();
		f = null;
	}
	
	@Override
	public void finalize()
	{
		System.out.println("Calling finalize");
	}
}
