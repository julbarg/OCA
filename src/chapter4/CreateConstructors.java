package chapter4;

public class CreateConstructors {
	
	private String color;

	public CreateConstructors() {
		System.out.println("constructor");
	}

	// public createConstructors() {} // DOES NOT COMPILE

	// Legal but it's not a contructor
	public void CreateConstructors() {}
	
	public CreateConstructors(String color) {
		this.color = color;
	}
	
	
}
