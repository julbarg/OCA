package chapter4;

import chapter4.Rabbit.Rabbit1;
import chapter4.Rabbit.Rabbit2;

public class RabbitDefaultContructor {
	
	/*
	 * Remember that a default constructor is only supplied 
	 * if there are no constructors present.
	 */
	
	/*
	public RabbitDefaultContructor(int t){
		If this method exists the code doesn't compile
	} */
	
	public static void main(String[] args) {
		RabbitDefaultContructor r = new RabbitDefaultContructor(); // Calls default constructor

	}

}
