package pond.goose;

import pond.shore.Bird;

public class Goose extends Bird{
	
	public void helpGooseSwim() {
		Goose other = new Goose();
		other.floatInWater();
		System.out.println(other.text);
	}
	
	public void helpOtherGooseSwim() {
		Bird other = new Goose();
		
		/*
		 * The second method is a problem. Although the object happens to be
		 * a Goose, it is stored in a Bird reference.
		 * We are not allowed to refer to members of the Bird
		 * class since we are not in the same package and Bird is 
		 * not a subclass of Bird.
		 */
		// other.floatInWater(); // DOES NOT COMPILE
	}
	

}
