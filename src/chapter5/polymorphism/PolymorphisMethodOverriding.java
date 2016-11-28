package chapter5.polymorphism;

public class PolymorphisMethodOverriding {
	public static void main(String[] args) {
		AnimalPO animalPO = new GorillaPO();
		System.out.println(animalPO.getName());
	}
}

class AnimalPO {
	public String getName() {
		return "Animal";
	}
}

class GorillaPO extends AnimalPO {
	/*protected String getName() { // DOES NOT COMPILE
		return "Gorilla";
	}*/
}
