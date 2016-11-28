package chapter5;

public class ExtendAbstractClass {

}

abstract class AnimalE {
	public abstract String getName();
}

abstract class Eagle extends AnimalE {
	public abstract String getSpecie();
}

abstract class Rabbit extends Eagle {
	public abstract void Fly();
}

class Test extends Rabbit {

	public void Fly() {
	}

	public String getSpecie() {
		return null;
	}

	public String getName() {
		return null;
	}
	
}

abstract class AnimalE2 {
	public abstract String getName();
}

abstract class BigCat extends AnimalE2 {
	public abstract void roar();
}

class LionE extends BigCat {
	public String getName() {
		return "Lion";
	}
	public void roar() {
		System.out.println("The Lion lets out a loud ROAR!");
	}
	
}

abstract class AnimalE3 {
	public abstract String getName();
}

abstract class BigCatE3 extends AnimalE3 {
	public String getName() {
		return "BigCat";
	}
	
	public abstract void roar();
}

class LionE3 extends BigCatE3 {
	public void roar() {
		System.out.println("The Lion lts out a loud ROAR!");
	}
}
