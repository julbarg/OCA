package chapter5;

class Primate {
	public Primate() {
		System.out.println("Primate");
	}

}

class Ape extends Primate {
	public Ape() {
		System.out.println("Ape");
	}
}

public class CallContructor extends Ape  {
	public CallContructor() {
		System.out.println("CallConstructor");
	}
	
	public static void main(String[] args) {
		new CallContructor();
	}
}


