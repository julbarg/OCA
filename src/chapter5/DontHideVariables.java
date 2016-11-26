package chapter5;

public class DontHideVariables {
	public static void main(String[] args) {
		JellyFish j = new JellyFish();
		AnimalTwo a = new JellyFish();
		System.out.println(j.length);
		System.out.println(a.length);
	}
}

class AnimalTwo {
	public int length = 2;
}

class JellyFish extends AnimalTwo {
	public int length = 5;
	
}
