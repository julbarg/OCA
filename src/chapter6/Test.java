package chapter6;

public class Test {
	public static void main(String[] args) {
		System.out.print("a");
		try {
			System.out.print("b");
			throw new IllegalArgumentException();
		} catch (IllegalArgumentException e) {
			System.out.print("c");
			throw new RuntimeException("1");
		} catch (RuntimeException e) {
			System.out.print("d");
			throw new RuntimeException("2");
		} finally {
			System.out.print("e");
			throw new RuntimeException("3");
		}
	}

}

class HasSoreThroatException extends Exception {}
class TiredException extends RuntimeException {}
interface Roar {
void roar() throws HasSoreThroatException;
}
class Lion implements Roar {

	// public void roar(){}
	// public void roar() throws HasSoreThroatException{}
	public void roar() throws IllegalArgumentException{}
}

