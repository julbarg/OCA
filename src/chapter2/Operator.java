package chapter2;

public class Operator {

	public static void main(String[] args) {
		int y = 4;
		double x = 3 + 2 * --y; //9.0 double
		
		System.out.println(x);
		
		/*
		 *  Order of operator precedence
		 *  expression++, expression-- //Al mismo nivel que 2
		 *  ++expression, --expression //Al mismo nivel que 1 Se evaluan left-to-right
		 *  + - ! //Unary operators
		 *  (*) / % 
		 *  + -
		 *  << >> >>>
		 *  < > <= >= instanceof
		 *  == !=
		 *  & ^|
		 *  && ||
		 *  Ternary operators boolean expression ? expression1 : expression2
		 *  Assigment operators = += -= *= /= %= &= ^= != <<= >>= >>>=
		 *  
		 */
		
		int g = 2 * 5 + 3 * 4 -8;
		//10 + 12 - 8
		//22 -8
		//14
		System.out.println(g);
		
		double q = 38.21;
		//float w = 2.1; //DOES NOT COMPILE Si float es definido punto flotante se le debe poner f
		float w = 2.1f;
		float i = 2;

	}

}
