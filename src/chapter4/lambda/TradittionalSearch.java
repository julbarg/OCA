package chapter4.lambda;

import java.util.ArrayList;
import java.util.List;

public class TradittionalSearch {
	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<>();
		animals.add(new Animal("fish", false, true));
		animals.add(new Animal("kangaroo", true, false));
		animals.add(new Animal("rabbit", true, false));
		animals.add(new Animal("turtle", false, true));

		print(animals, new CheckIfHopper());
		System.out.println();
		print(animals, a -> a.canHop());
		print(animals, a -> a.canSwim());
		print(animals, a -> !a.canSwim());

		print(animals, new CheckTrait() {
			@Override
			public boolean test(Animal a) {
				return a.canHop();
			}
		});
		print(animals, (Animal a) -> {return a.canHop();});
		print(animals, a -> a.canHop());
		
		/*
		 * Valid Lambdas
		 */
		print(animals, a -> a.toString().startsWith("test"));
		
		/*
		 * Invalid Syntax
		 */
		// print(a, b -> a.startsWith("test")); // DOES NOT COMPILE
		// print(a -> { a.startsWith("test"); }); // DOES NOT COMPILE
		// print(a -> { return a.startsWith("test") }); // DOES NOT COMPILE
		
		boolean wantWhetherCanHop = true;
		print(animals, a -> a.canHop() == wantWhetherCanHop);
		
		/*
		 * - Java doesn’t allow us to redeclare a local variable
		 * (a, b) -> { int a = 0; return 5;} // DOES NOT COMPILE
		 * - The following line is okay  because it uses a different variable name:
		 * (a, b) -> { int c = 0; return 5;}
		 */

	}

	private static void print(List<Animal> animals, CheckTrait checker) {
		for (Animal animal : animals) {
			if (checker.test(animal))
				System.out.println(animal + " ");
		}
		System.out.println();

	}

}
