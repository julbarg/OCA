package chapter5.interfaces;

public class InherateInterface {

	/*
	 * - An interface that extends another interface, as well as an abstract 
	 *   class that implements an interface, inherits all of the abstract methods
	 *   as its own abstract methods
	 * - The first concrete class that implements an interface, or extends an
	 *   abstract class that implements an interface, must provide an implementation
	 *   for all inherited abstract methods
	 */
}

/*
 * An interface may extend multiple interfaces
 */
interface HasTail {
	public int getTailLength();
}

interface HasWhiskers {
	public int getNumberOfWhiskers();
}

interface Seal extends HasTail, HasWhiskers {
	
}

abstract class HarbolSeal implements HasTail, HasWhiskers {
}

class LeopardSeal implements HasTail, HasWhiskers{
	public int getNumberOfWhiskers() {
		return 0;
	}

	public int getTailLength() {
		return 0;
	}
}

interface CanRun {}

interface CanHop {}

class Hyena {}

// Una clase no puede extender una interface
//class Cheetah extends CanRun {} // DOES NOT COMPILE

// Una interface no puede extender una clase concreta
// interface HasFur extends Hyena {} // DOES NOT COMPILE

interface GoatI extends CanRun {}

// Una interface no puede implementar otra interface
// interface GoatOne implements CanRun{} // DOES NOT COMPILE

// Una interface puede extender multiples interfaces
interface GiantGoat extends CanRun, CanHop {}

// Una clase abstracta no puede extender una interface
// abstract class LittleGoat extends CanRun {} // DOES NOT COMPILE

// Una clase abstracta puede implementar una interface
abstract class LittleBunny implements CanRun {}

interface Herbivore {
	public void eatPlants();
}

interface Omnivore {
	public int eatPlants(int t);
}

class Bear implements Herbivore, Omnivore {
	
	public void eatPlants() {
	}

	public int eatPlants(int t) {
		return 0;
	}
	
}

// CONFLICTS 
interface HerbivoreC {
	public int eatPlants();
}

interface OmnivoreC {
	public void eatPlants();
}

// interface Supervore extends HerbivoreC, OmnivoreC {} // DOES NOT COMPILE
// abstract class AbstractBear implements HerbivoreC, OmnivoreC {} // DOES NOT COMPILE






