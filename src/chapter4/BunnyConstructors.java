package chapter4;

public class BunnyConstructors {
	
	private String color;
	private int height;
	private int length;
	
	public BunnyConstructors(int length, int theHeight) {
		length = this.length; // backwards - no good!
		height = theHeight; // fine because a different name
		this.color = "white";
	}
	
	public static void main(String[] args) {
		BunnyConstructors b = new BunnyConstructors(1, 2);
		System.out.println(b.length + " " + b.height + " " + b.color ); // 0 2 white
	}

}
