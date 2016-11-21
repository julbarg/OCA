package chapter3;

public class StringUsing {
	
	public void concatenation(){
		/*
		 * If both operands are numeric, + means numerica addition
		 * If either operan is a String, + menas concatenation
		 * The expression is evaluated left to right
		 */
		System.out.println(1+2); // 3
		System.out.println("a" + "b"); // ab
		System.out.println("a" + "b" + 3); // ab3
		System.out.println(1 + 2 + "c"); // 3c
		
		int three = 3;
		String four = "4";
		System.out.println(1 + 2 + three + four);// 64
		
		String s = "1";
		s += "2";
		s += 3;
		System.out.println(s); // 123
	}
	
	public void inmmutable(){
		String s1 = "1";
		String s2 = s1.concat("2");
		s2.concat("3");
		System.out.println(s2);
	}
	

	public static void main(String[] args) {
		String name = "Fluffy";
		String name2 = new String("Fluffy");
		
		StringUsing su = new StringUsing();
		su.concatenation();
		su.inmmutable();

	}

}
