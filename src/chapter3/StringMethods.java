package chapter3;

public class StringMethods {

	public void lenght() {
		String s = "animals";
		System.out.println(s.length()); // 7
	}

	public void charAt() {
		// ChartAt lets you query the string to fin out what character
		// is at specific index

		String s = "animals";

		System.out.println(s.charAt(0)); // a
		System.out.println(s.charAt(6)); // s
		// System.out.println(s.charAt(7)); // throws exception
	}

	public void indexOf() {
		/*
		 * Looks at the characters in the string and finds the first index that
		 * matches the desired value
		 * 
		 * int indexOf(char ch) 
		 * int indexOf(char ch, index fromIndex) 
		 * int indexOf(String str) 
		 * int indexOf(String str, index fromIndex)
		 * 
		 */
		
		String s = "animals";
		System.out.println(s.indexOf('a')); // 0
		System.out.println(s.indexOf("al")); // 4
		System.out.println(s.indexOf('a', 4)); // 4
		System.out.println(s.indexOf("al", 5)); // -1
		
	}
	
	public void substring(){
		/*
		 * Returns part of the string. 
		 */
		String s = "animals";
		System.out.println(s.substring(3)); // mals
		System.out.println(s.substring(s.indexOf('m'))); // mals
		//To take characters starting with index 3 until, but not
		// including, the character at index 4
		System.out.println(s.substring(3, 4)); // m
		System.out.println(s.substring(3, 7)); // mals 
		
		System.out.println(s.substring(3, 3)); // empty string
		// System.out.println(s.substring(3, 2)); // throws exception
		// System.out.println(s.substring(3, 8)); // throws exception
		
	}
	
	public void toLowerCase(){
		/*
		 * toUpperCase converts any lowercase character to uppercase 
		 * toLowerCase converts any uppercase character to lowercase
		 */
		
		String s = "animals";
		System.out.println(s.toUpperCase());
		System.out.println("AbCd123".toLowerCase());
	}
	
	public void equals(){
		/*
		 * Checks wheter two String objects contain 
		 * exactly the same characters in the same order
		 * 
		 */
		System.out.println("abc".equals("ABC")); // false
		System.out.println("ABC".equals("ABC")); // true
		System.out.println("abc".equalsIgnoreCase("ABC")); //true
	}
	
	public void startsWithAndEndsWith() {
		System.out.println("abc".startsWith("a")); // true
		System.out.println("abc".startsWith("A")); // false
		System.out.println("abc".endsWith("c")); // true
		System.out.println("abc".endsWith("a")); // false
	}
	
	public void contains() {
		System.out.println("abc".contains("b")); // true
		System.out.println("abc".contains("B")); // false
	}
	
	public void replace(){
		/*
		 * does a simple search and replace on the string
		 * There's a version that takes char parameters as 
		 * well as a version that takes a CharSequence parameters
		 * A CharSequence is a general way of representing several classes
		 * include String and StringBuiñder
		 * String replace(char oldChar, char newChar)
		 * String replace(CharSequence oldChar, CharSequence newChar)
		 */
		
		System.out.println("abcabc".replace('a', 'A')); // AbcAbc
		System.out.println("abcabc".replace("a", "A")); // AbcAbc
		System.out.println("abcabc".replace("abc", "Hola")); // HolaHola
	}
	
	public void trim(){
		/*
		 * Removes whitespace from the beginning and end of a String
		 */
		System.out.println("abc".trim());
		System.out.println("\t a b c\n");
		System.out.println("\t a b c\n".trim());
		System.out.println("C");
	}
	
	public void methodChaining(){
		String start = "AniMaL ";
		String trimmed = start.trim(); // "AniMaL"
		String lowercase = trimmed.toLowerCase(); // "animal"
		String result = lowercase.replace('a', 'A'); // "Animal"
		System.out.println(result);
		
		result = "AniMaL ".trim().toLowerCase().replace('a', 'A');
		System.out.println(result);
		
		String a = "abc";
		String b = a.toUpperCase();
		b = b.replace("B", "2").replace('C', '3');
		System.out.println("a=" + a);
		System.out.println("b=" + b);
	}

	public static void main(String[] args) {
		StringMethods sm = new StringMethods();

		sm.lenght();
		sm.charAt();
		sm.indexOf();
		sm.substring();
		sm.toLowerCase();
		sm.equals();
		sm.startsWithAndEndsWith();
		sm.contains();
		sm.replace();
		sm.trim();
		sm.methodChaining();

	}

}
