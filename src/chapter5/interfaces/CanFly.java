package chapter5.interfaces;

public interface CanFly {
	void fly(int speed);
	abstract void takeOff();
	public abstract double dive();
}

interface CanFly2 {
	public abstract void fly(int speed);
	public abstract void takeOff();
	public abstract double dive();
}
/*
 * DOES NOT COMPILE
private final interface CanCrawl {
	private void dig(int depth);
	protected abstract double depth();
	public final void surface();
}*/