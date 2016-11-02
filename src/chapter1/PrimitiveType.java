package chapter1;

public class PrimitiveType {

	public static void main(String[] args) {
		//((2^N)/2)-1
		System.out.println(Byte.MAX_VALUE);//2^8 
		System.out.println(Short.MAX_VALUE);//2^16
		System.out.println(Integer.MAX_VALUE);//2^32
		System.out.println(Long.MAX_VALUE);//2^64
		System.out.println(Float.MAX_VALUE);//2^32
		System.out.println(Double.MAX_VALUE);//2^64
		
		byte b = 127;
		//byte b1 = 128; DOESN'T COMPILE
		short s = 32767;
		//short s1 = 32768; DOESN'T COMPILE
		int i = 2147483647;
		// int i1 = 2147483648; DOESN'T COMPILE
		long l = 9223372036854775807L;
		// long l1 = 9223372036854775808L; DOESN'T COMPILE
		float f = 3.4028235E38F;
		double d = 1.7976931348623157E308;
		
		//Octal 017
		//Hexadecimal 0xFF
		//Binary 0b10
		
		System.out.println(56); // 56
		System.out.println(0b11); // 3
		System.out.println(017); // 15
		System.out.println(0x1F); // 31
		
		int million1 = 1000000;
		int million2 = 1_000_000;
		

	}

}
