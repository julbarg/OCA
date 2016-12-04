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
		
		Integer.valueOf(85);
		boolean h = Boolean.parseBoolean("TrUe");
		System.out.println("h: "+h);
		
		Long long1 = Long.valueOf(127);
		Long long2 = Long.valueOf(127);
		System.out.println(long1 == long2);
		
		int i = 0;
		float p = 0f;
		System.out.println(1);
		double iii = 0;
		long fd = 1234567890;
		double a5 = 10;
		byte ssi = -0;

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
		ClassB b = new ClassB();
		System.out.println(a.name);
		float dou = b.getDouble();
	}
	
	int getDouble(){
		return 5;
	}
	
	void kk(){
		String baby;
		String baby2 = new String("d");
		return;
	}
}
