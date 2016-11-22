package chapter4;

public class Varargs {
	
	/*
	 * A vararg parameter must be the last element in a method’s parameter list. 
	 * This implies you are only allowed to have one vararg parameter per method.
	 */
	
	public void walk1(int...nums){}
	public void walk2(int start, int...nums){}
	// public void walk3(int...nums, int start){} // DOES NOT COMPILE Because they have a vararg parameter 
	// in a position that is not the last one.
	// public void walk4(int... start, int... nums) { } // DOES NOT COMPILE
	
	public static void walk10 (int start, int...nums){
		System.out.println(nums.length);
	}

	public static void main(String[] args) {
		walk10(1);
		walk10(1, 2);
		walk10(1,  2, 3);
		walk10(1,  new int[] {4,5});
		// walk10(1, null); // throws a NullPointerException
		
		System.out.println();
		run(11, 22); // 22

	}
	
	public static void run(int... nums) {
		System.out.println(nums[1]);
	}

}
