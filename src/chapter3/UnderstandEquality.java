package chapter3;

public class UnderstandEquality {
	
	public void equality() {
		StringBuilder one = new StringBuilder();
		StringBuilder two = new StringBuilder();
		StringBuilder three = one.append("a");
		System.out.println(one == two); // false
		System.out.println(one == three); // true
		
		String x = "Hello World";
		String y = "Hello World";
		System.out.println(x == y);  // true 
		
		String x1 = "Hello Hello";
		String z = " Hello Hello ".trim();
		System.out.println(x1 == z); // false 
		
		String x2 = new String("Hello World");
		String y2 = "Hello World";
		System.out.println(x2 == y2); // false
		
	}
	
	public void equals() {
		String x = "Hello World";
		String y = " Hello World ".trim();
		System.out.println(x.equals(y)); // true
	}
	
	public static void main(String[] args) {
		UnderstandEquality ue = new UnderstandEquality();
		ue.equality();
		ue.equals();
	}

}
