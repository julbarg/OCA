package pond.duck;

public class MotherDuck {
	
	String noise = "quak";
	
	void quack() {
		System.out.println(noise); // default access is ok
	}
	
	private void makeNoise() {
		quack(); // default access is ok
	}

}
