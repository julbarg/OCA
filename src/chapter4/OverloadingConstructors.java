package chapter4;

public class OverloadingConstructors {
	
	private String color;
	private int weight;
	
	public OverloadingConstructors (int weight) { // first constructor 
		this(weight, "blue");
		this.weight = weight+10;
		//color = "white";
		// OverloadingConstructors(weight, "brown");
		new OverloadingConstructors(weight, "brown"); // Compile but it doesn't do what we want
		
	}
	
	public OverloadingConstructors (int weight, String color) {
		this.weight = weight;
		this.color = color;
	}
	
	public static void main(String[] args) {
		OverloadingConstructors over = new OverloadingConstructors(7);
		System.out.println(over.color); // blue
		System.out.println(over.weight);
	}

}
