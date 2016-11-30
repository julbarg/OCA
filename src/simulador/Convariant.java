package simulador;

public class Convariant {
	static int g;
	static int y;
	int o;
	
	static void g1(){
		System.out.println(g);
		System.out.println(y);
	}
	
	void getY() {
		System.out.println(g);
	}
	
	public static void main(String[] args) {
		String str1 = "one";
		String str2 = "two";
		System.out.println(str1.equals(str1 = str2));

		Object object = new Object();
		Convariant convariant = new Convariant();
		object = convariant;
		convariant = (Convariant) object;

		Object t = new Integer(107);
		int i2 = (Integer) 780;
		int k = ((Integer) t).intValue() / 9;
		System.out.println(k);
		
		for(int i=0, j=0; j<i; ++j, i++){
			System.out.println("i: "+i+" j: "+j);
		}

	}
}

class ClaseA {
	public Object test() {
		return new Object();
	}
}

class ClaseB extends ClaseA {
	public String test() {
		return "Hola";
	}
}

class Class1 {
	public int getInt() {
		return 2;

	}
}

class Class2 extends Class1 {
	@Override
	public int getInt() {
		return 8;
	}
}

class ClassA {
	String name;
}

class ClassB {
	public static void main(String[] args) {
		ClassA a = new ClassA();
		System.out.println(a.name);
	}
}
