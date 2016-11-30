package chapter5.polymorphism;

public class PolymorphisMethodOverriding {
	public static void main(String[] args) {
		AnimalPO animalPO = new GorillaPO();
		System.out.println(animalPO.getName());

		System.out.println(5 < 5);

		Integer t = 8;
		Long.parseLong("2");
		Long.valueOf(2580);
		Long.valueOf("25");
		long longer4 = Long.valueOf("2580");
		long longert = new Long(258);
		long m = Long.valueOf(848).longValue();

		String t1 = null;
		t1 = t1 + "2";
		System.out.println(t1);
		System.out.println(0 < 0);

		int i;
		int j;
		for (i = 0, j = 0; j < i; ++j, i++) {
			System.out.println(i + " " + j);
		}
		System.out.println(i + " " + j);

	}
}

class AnimalPO {
	public String getName() {
		return "Animal";
	}
}

class GorillaPO extends AnimalPO {
	/*
	 * protected String getName() { // DOES NOT COMPILE return "Gorilla"; }
	 */
}
