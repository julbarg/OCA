package chapter5;

public class HideVariables {
	
	/*
	 * Like a Static Methods: Hide
	 * You can’t override a variable;
	 * You can only hide it
	 * If you’re referencing the variable from within parent, variable
	 * defined in parent is used. Alternatively, if you’re referencing variable from
	 * child, variable defined in child is used.
	 */
	
	public static void main(String[] args) {
		Mouse mouse = new Mouse();
		mouse.getRodentDetails();
		mouse.getMouseDetails();
	}

}

class RodentTwo {
	protected int tailLength = 4;
	public void getRodentDetails() {
		System.out.println("{parentTail = "+tailLength +"}");
	}
}

class Mouse extends RodentTwo {
	protected int tailLength = 8;
	public void getMouseDetails() {
		System.out.println("{tail = "+tailLength + ", parenTail ="+ super.tailLength+"}");
	}
}
