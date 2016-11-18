package chapter1;

public class Chiken {
	int numEggs = 0; // initialize on line 
	String name;

	public Chiken(){
		name = "Duke"; //initialize in constructor
	}
	
	public static void main(String[] args) {
		DestroyedObjects des = new DestroyedObjects();
		des = null;
		
		System.out.println("End");
	}

}
