package chapter4;

public class GorillaStatic {
	
	public static int count;
	public static void addGorilla() { count++; }
	public void babyGorilla() { count++; }
	public void announceBabies() {
		addGorilla();
		babyGorilla();
	}
	
	public static void announceBabiesToEveryone() {
		addGorilla();
		/*
		 * Because a static method cannot call an instance method.
		 */
		// babyGorilla(); // DOES NOT COMPILE
	}
	
	public int total;
	/*
	 * Because a static variable is trying to use an instance variable
	 */
	// public static average = total / count; // DOES NOT COMPILE

}
