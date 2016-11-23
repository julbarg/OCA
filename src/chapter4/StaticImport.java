package chapter4;

import java.util.ArrayList;
import java.util.*;
// import static java.util.Arrays.asList;
// import static java.util.Arrays; // DOES NOT COMPILE
import static java.util.Arrays.*;
// static import java.util.Arrays.*; // DOES NOT COMPILE


public class StaticImport {
	 /*
	  * Static imports are for importing static members of classes.
	  * 
	  * Remember that static imports are only for importing static members.
	  */
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("one", "two");
		List<String> list2 = asList("one", "two");
		
		Arrays.asList("one");
	}

}
