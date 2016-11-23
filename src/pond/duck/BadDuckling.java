package pond.duck;

public class BadDuckling {
	
	public void makeNoise() {
		FatherDuck duck = new FatherDuck();
		// duck.quack(); // DOES NOT COMPILE It's not visible
		// System.out.println(duck.noise); // DOES NOT COMPILE It's not visible
	}

}
