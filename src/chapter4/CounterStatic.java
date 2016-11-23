package chapter4;

public class CounterStatic {
	public static int count;
	
	public CounterStatic() {
		count++;
	}
	
	public static void main(String[] args) {
		CounterStatic c1 = new CounterStatic();
		CounterStatic c2 = new CounterStatic();
		CounterStatic c3 = new CounterStatic();
		
		System.out.println(count); //3
	}

}

