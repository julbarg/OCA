package chapter4.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import static java.util.Collections.*;
import static java.util.Collections.sort;

public class PredicateSearch {
	
	private PredicateSearch() {
		System.out.println("Constructor");
	}
	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<>();
		animals.add(new Animal("fish", false, true));
		animals.add(new Animal("kangaroo", true, false));
		animals.add(new Animal("rabbit", true, false));
		animals.add(new Animal("turtle", false, true));
		
		print(animals, a -> a.canHop());
	}

	private static void print(List<Animal> animals, Predicate<Animal> checker) {
		for(Animal animal: animals){
			if(checker.test(animal)){
				System.out.println(animal + " ");
			}
			System.out.println();
		}
		
		howMany(true, new boolean[]{true});
		
		PredicateSearch p = new PredicateSearch();
	}
	
	public static int howMany(boolean b, boolean... b2) {
		return b2.length;
	}

}
