package pond.swan;

import pond.shore.Bird;

public class Swan extends Bird {
	
	public void swim(){
		floatInWater();  // package access to superclass
		System.out.println(text);
	}
	
	public void helpOtherSwanSwim() {
		Swan other = new Swan(); 
		other.floatInWater(); // package access to superclass
		System.out.println(other.text); // package access to superclass 
	}
	
	public void helpOtherBirdSwim() {
		/*
		 * This time a Bird reference is used. It is created
		 * on line 14. Bird is in a different package, and this code isn’t inheriting from Bird, 
		 * so itdoesn’t get to use protected members. Say what now? We just got through saying repeatedly
		 * that Swan inherits from Bird. And it does. However, the variable reference isn’t a Swan.
		 * The code just happens to be in the Swan class.
		 */
		
		Bird other = new Bird();
		// other.floatInWater();  // DOES NOT COMPILE
		// System.out.println(other.text); // DOES NOT COMPILE
	}

}
