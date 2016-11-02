package chapter1;

import java.lang.System; //Automatically Imported (Redundant Import)
import java.lang.*; //Automatically Imported (Redundant Import)
import java.util.Random;
import java.util.*; //Wildcards
//Another case of redundancy involves importing a class that is in the same package as the 
//class importing it.

public class ImportExample {
	
	public static void main(String...vargs){
		Random r = new Random();
		System.out.println(r.nextInt(10));
	}

}
