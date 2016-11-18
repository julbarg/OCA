package chapter1; //Package declaration - First line in the file (NO Required)

import java.util.*; // Import staments Immediately after the package (NO Required)

public class OrderElements { //Class declation Immediately after import (YES Required)
	
	int value; //Fiedl declaration - Anywhere inside a class (NO Required)
	
	void method(){ //Methid declarations - Anywhere inside a class (NO Required)
		
	}

}

/*
 * Multiple classes can be defined in the sae file,
 * but only one of them is allowed to be public
 */
class OtherClass{
	
	int value;
	
	void method(){
		
	}
	
	//Inner classes
	class Other{
		
	}
}
