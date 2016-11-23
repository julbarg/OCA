package pond.swan;

import pond.duck.MotherDuck;

public class BadCygnet {
	
	public void makeNoise() {
		MotherDuck duck = new MotherDuck();
		// duck.quack(); // DOES NOT COMPILE - 
		//It's trying to access a default method but it's in another package
		
		// System.out.println(duck.noise); // DOES NOT COMPILE
	}

}
