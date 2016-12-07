package exam;

import java.io.IOException;
import java.util.ArrayList;

public class Excepcionss {
	
	static {
		try {
			
			throw new NullPointerException();
		} catch(ExceptionInInitializerError s){
			System.out.println("Error");
		}
	}
	
	public static void main(String[] args) {
		
		String[] g = args;
		
		try {
			method();
		} catch(ExceptionInInitializerError s){
			for(int i = 0; i<2; ++i){
				System.out.println(i);
			}
		}
		
		Long var1 = Long.valueOf(128);
		Long var2 = Long.valueOf(128);
		
		System.out.println(var1 == var2);
		
		var1 = Long.valueOf(123);
		var2 = Long.valueOf(123);
		
		System.out.println(var1 == var2);
		
		ArrayList<String> listString = new ArrayList<>();
		listString.add("Uno");
		listString.add("Dos");
		
		//listString.get(6);
		
		String[] array = {"Uno"};
		//String str = array[6];
		
		FatherE f = new SonE();
		
		System.out.println(70/0.0);
		System.out.println(-70/0.0);
		System.out.println(0.0/0.0);
		System.out.println(20.0/0);
		
		int y = Integer.parseInt("123ABCD", 16);
		System.out.println(y);
		
		try {
			
		} catch (RuntimeException e) {
			// TODO: handle exception
		}
		
		
	}
	
	public static void method() {
		//System.out.println("Method");
		method();
	}

}

class FatherE{
	
	void methodOne() {
		throw new Throwable();
	}
	
}

class SonE extends FatherE{
	
}
