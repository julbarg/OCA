package chapter4;

import java.util.ArrayList;

public class Constants {
	
	/*
	 * Other static variables are meant to never change during the program. 
	 * This type of variable
	 * is known as a constant
	 */
	
	public static final ArrayList<String> values = new ArrayList<>();
	
	public static final int NUM_BUCKTS = 45;
	
	public static void main(String[] args) {
		// NUM_BUCKTS = 5; //DOES NOT COMPILE
		
		values.add("changed");
	}

}
