package chapter3;

public class UsingStringBuilder {
	
	public void usingString(){
		String alpha = "";
		for(char current = 'a'; current <= 'z'; current ++)
			alpha += current;
		System.out.println(alpha);
	}
	
	public void stringBuilderUsing (){
		/*
		 * StringBuilder is not immutable, is mutable
		 */
		StringBuilder alpha = new StringBuilder();
		for(char current = 'a'; current <= 'z'; current ++)
			alpha.append(current);
		System.out.println(alpha);
	}
	
	public void mutabilityAndChaining() {
		StringBuilder sb = new StringBuilder();
		sb.append("+middle");
		StringBuilder same = sb.append("+end");
		System.out.println(same);
		System.out.println(sb);
		
		String s = "+middle";
		s.concat("+end");
		String s2 = s;
		System.out.println(s2);
		
		StringBuilder a = new StringBuilder("abc");
		StringBuilder b = a.append("de");  //Here, both is refereed to the same object
		b = b.append("f").append("g"); //The changes affected both but it is the same object
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
	
	public void create() {
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder("animal");
		StringBuilder sb3 = new StringBuilder(10); // Tells Java that we hace some idea of how big the eventual value will be 
	}
	
	/*
	 * Size vs Capacity
	 * Size is the number of characters currently in the sequencue, and capacity is the number of character that sequencia can
	 * currently hold
	 * String is immutable, the size and capacity are the same
	 */
	
	public void methods() {
		StringBuilder sb = new StringBuilder("animals");
		String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
		int leng = sb.length();
		char ch = sb.charAt(6);
		System.out.println(sub + " " + leng + " " + ch);
		
		StringBuilder sb2 = new StringBuilder(20);
		System.out.println(sb2.length()); // 0
		
	}
	
	public void append() {
		StringBuilder sb = new StringBuilder().append(1).append(2.3).append('c').append("as");
		sb.append("-").append(true);
		System.out.println(sb);
	}
	
	public void insert() {
		/*
		 * Adds characters to the StringBuilder at the requested index and returns
		 * a reference to the current StringBuilder
		 * StringBuilder insert(int offset, String str)
		 */
		
		StringBuilder sb = new StringBuilder("animals");
		sb.insert(7, "-");
		sb.insert(0, "-");
		sb.insert(4, "-");
		System.out.println(sb);
		
	}
	
	public void delete() {
		/*
		 * Is the opposite of insert method. 
		 * It removes characters from the sequence and return a reference to the currento StringBuilder
		 * StringBuilder delete(int start, int end)
		 * StringBuilder deleteCharAt(int index)
		 */
		
		StringBuilder sb = new StringBuilder("abcdef");
		sb.delete(1, 3); // adef
		sb.deleteCharAt(0); // def
		// sb.deleteCharAt(5); // throws an exception 
		
		System.out.println(sb);
	}
	
	public void reverse() {
		/*
		 * Does just what it sounds like:
		 * it reverses the characters in the sequence and returns 
		 * a reference to the cuerrent StringBuilder
		 */
		
		StringBuilder sb = new StringBuilder("ABCDEF");
		sb.reverse();
		System.out.println(sb);
		
		//toString
		String s = sb.toString();
		System.out.println(s);
	}
	
	/*
	 * StringBuilder vs StringBuffer
	 * StringBuffer does the same thing but more slowly because it is thread safe. 
	 */
	
	

	public static void main(String[] args) {
		UsingStringBuilder sb = new UsingStringBuilder();
		sb.usingString();
		sb.stringBuilderUsing();
		sb.mutabilityAndChaining();
		sb.methods();
		sb.append();
		sb.insert();
		sb.delete();
		sb.reverse();

	}

}
