package chapter6;

public class CatchVariousExceptions {
	/*
	 * A rule exists for the order of the catch blocks.
	 * Java looks at them in the order they appear.
	 * If it is impossible for one of the catch blocks to be executed, a compiler
	 * error about unreachable code occurs
	 * This happens when a superclass is caught before a sub class
	 */
	
	public void visitPorcupine() throws ExhibitClosedForLunch {
		try{
			seeAnimal();	
		} catch (AnimalsOutForAWalk e) {
			System.out.println("try bck late");
		} catch (ExhibitClosedForLunch e) {
			System.out.println("Not today");
		} catch (ExhibitClosed e) {
			System.out.println("Not today");
		}
		
	}

	void seeAnimal() {
		System.out.println("See Animal");
	}
	
	public void visitMonkeys() {
		try {
			seeAnimal();
		} catch (ExhibitClosedForLunch e) { //subclass exception
			System.out.println("try back later");
		} catch (ExhibitClosed e) { // superclass exception
			System.out.println("not today");
		}
	}
	
	public void visitMonkeysE() {
		try{
			seeAnimal();
		} catch (ExhibitClosed e) {
			System.out.println("Not today");
		} /*catch (ExhibitClosedForLunch e) { // DOES NOT COMPILE
			System.out.println("try back later");
		}*/
	}
	
	public void visitSnakes() {
		try{
			seeAnimal();
		} catch (RuntimeException e) {
			System.out.println("Runtime exception");
		} /*catch (ExhibitClosed e) { // DOES NOT COMPILE
			System.out.println("not today");
		} */catch (Exception e) {
			System.out.println("Exception");
		}
	}

}

class AnimalsOutForAWalk extends RuntimeException {}
class ExhibitClosed extends RuntimeException {}
class ExhibitClosedForLunch extends ExhibitClosed {}


