package chapter4;

public class ReferenceTypesOverloading {
	
	public void fly(String s) {
		System.out.println("String");
	}
	
	public void fly(Object o){
		System.out.println("Object");
	}
	
	public void fly(Integer i) {
		System.out.println("Integer");
	}
	
	public void fly(int i) {
		System.out.println("Int");
	}
	
	public void fly(Long l){
		System.out.println("long");
	}
	
	public void fly(short s){
		System.out.println("short");
	}
	/*
	 * Glider
	 */
	public static int glide(String s){
		return 1;
	}
	
	public static int glide(String ... s){
		return 2;
	}
	
	public static int glide(Object o){
		return 3;
	}
	
	public static int glide(String s, String t){
		return 4;
	}
	
	/*
	 * Java is happy to convert the int 4 to a long 4 or an Integer 4.
	 * It cannot handle converting in two steps to a long and then to a Long
	 */
	public static void play(Long l){}
	public static void play(Long... longs){}
	
	public static void main(String[] args) {
		ReferenceTypesOverloading r = new ReferenceTypesOverloading();
		r.fly("test");
		r.fly(4.58);
		r.fly(78L);
		r.fly(56);
		r.fly((short) 2);
		
		System.out.print(glide("a")); // 1
		System.out.print(glide("a", "b")); // 4
		System.out.print(glide("a", "b", "c")); // 2
		
		// play(4); // DOES NOT COMPILE
		play(4L);
	}
	

}
