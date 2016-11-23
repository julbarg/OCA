package pond.inland;

import pond.shore.Bird; // different package than bird

public class BirdWatcherFromAfar {
	
	public void watchBird() {
		Bird bird = new Bird();
		// bird.floatInWater(); // DOES NOT COMPILE - It's not visible
		// System.out.println(bird.text); // DOES NOT COMPILE - It's not visible
	}

}
