package pond.shore;

public class Bird {
	
	protected String text = "floating"; // protected access
	
	protected void floatInWater() {
		System.out.println(text); // protected access
	}
	
	public void watchBird(){
		Bird bird = new Bird();
		bird.floatInWater(); // calling protected member
		System.out.println(bird.text); // calling protected member
	}

}
