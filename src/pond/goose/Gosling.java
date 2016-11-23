package pond.goose;

import pond.shore.Bird; // in a different package

public class Gosling extends Bird{
	
	public void swim() {
		floatInWater(); // calling protected meber
		System.out.println(text); // calling protected member
	}

}
