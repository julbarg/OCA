package chapter4;

public class StaticInitialization {
	
	/*
	 * final variables aren’t allowed to be reassigned.
	 */
	
	private static final int NUM_SECODNS_PER_HOUR;
	static {
		int numSecondsPerMinute = 60;
		int nummMinutesPerHour = 60;
		NUM_SECODNS_PER_HOUR = nummMinutesPerHour * numSecondsPerMinute;
	}
	
	private static int one;
	private static final int two;
	private static final int three = 3;
	// private static final int four; // DOES NOT COMPILE
	static {
		one = 1;
		two = 2;
		// three = 3; // DOES NOT COMPILE
		// two = 4; // DOES NOT COMPILE
		one = 7;
	}
	

}
