package chapter5;

public class CallInheritedClass {
	public static void main(String[] args) {
		new Shark(2).displaySharkDetails();
	}

}

class Fish {
	protected int size = 9;
	private int age;
	
	public Fish(int age) {
		this.age = age; 
	}
	
	public int getAge() {
		return age;
	}
}

class Shark extends Fish {
	private int numberOfFins = 8;
	
	public Shark(int age) {
		super(age);
		this.size = 4;
		super.size = 8;
	}
	
	public void displaySharkDetails() {
		System.out.print("Shark with age: "+getAge());
		System.out.print(" and "+ size+" meters long");
		System.out.println(" with "+numberOfFins+" fins");
		
		System.out.print("Shark with age: "+this.getAge());
		System.out.print(" and "+this.size+" meters long");
		System.out.println(" with "+this.numberOfFins+" fins");
		
		System.out.print("Shark with age: "+super.getAge());
		System.out.print(" and "+super.size+" meters long");
		System.out.println(" with "+this.numberOfFins+" fins");
		
		System.out.print("Shark with age: "+super.getAge());
		System.out.println(" and "+super.size+" meters long");
		// System.out.print(" with "+super.numberOfFins+" fins"); // DOES NOT COMPILE
		
		System.out.println(this.size);
		System.out.println(super.size);
	}
	
}
