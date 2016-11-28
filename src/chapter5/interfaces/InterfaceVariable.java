package chapter5.interfaces;

public class InterfaceVariable {
	/*
	 * Interface variables are assumed to be public, static and final
	 * - Interface variables are assumed to be public, static and final
	 *   Marking a variables as private or protected will trigger a compile error,
	 *   as will marking any variable as abstract
	 * - The value of an interface variable must be sent it is declared since
	 *   it is marked as final 
	 */
}

/*
 * The compile automatically insert public, static, final to any constant
 * interface variables
 */
interface CanSwimI {
	int MAXIMUN_DEPTH = 100;
	final static boolean UNDERWATER = true;
	public static final String TYPE = "Submersible";
}

interface CanSwimI2 {
	public static final int MAXIMUN_DEPTH = 100;
	public static final boolean UNDERWATER = true;
	public static final String TYPE = "Submersible";
}

interface CanDig {
	// private int MAXIMUM_DEPTH = 100; //DOES NOT COMPILE
	// protected abstract boolean UNDERWATER = false; // DOES NOT COMPILE
	// public static String TYPE; // DOES NOT COMPILE
}
