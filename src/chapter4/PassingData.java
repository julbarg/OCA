package chapter4;

public class PassingData {
	
	/*
	 * Java Pass-by-value
	 * That means that a copy of the variable is made 
	 * and the method receives the copy
	 * Assignments made in the method do not affect the caller
	 */
	
	public static void newNumber(int num){
		num = 8;
	}
	
	public static void main(String[] args) {
		int num = 4;
		newNumber(5);
		System.out.println(num);
		
		String name = "Webby";
		speak(name);
		System.out.println(name);
		
		StringBuilder nameBuilder = new StringBuilder("Webby");
		speakBuilder(nameBuilder);
		System.out.println(nameBuilder);
		
		int original1 = 1;
		int original2 = 2;
		swap(original1, original2);
		System.out.println(original1);
		System.out.println(original2);
		
		int number = 1;
		String letters = "abc";
		number(number);
		letters = letters(letters);
		System.out.println(number + letters);
	}
	
	public static void speak(String name) {
		name = "Sparky";
	}
	
	public static void speakBuilder(StringBuilder s) {
		s.append("Sparky");
	}
	
	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}
	
	public static int number(int number) {
		number++;
		return number;
	}
	
	public static String letters(String letters) {
		letters += "d";
		return letters;
	}

}
