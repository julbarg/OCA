package chapter5.interfaces;

public interface WalksOnTwoLegs {
	

}

/*final interface WalksOnEightLegs {
	// DOES NOT COMPILE
}*/

interface Interviewer {
	int MIN = 10;
	void getTest();
	
	default int getUnion(){
		return 7;
	}
	
	static void staticMethod(){
		
	}
}

interface Programmer {
	String MIN = "MIN";
	int getTest(String g);
	
	static int staticMethod(){
		return 4;
	}
}

class Implementation implements Interviewer, Programmer{

	@Override
	public void getTest() {
		
	}
	
	public int getTest(String g){
		Programmer.staticMethod();
		return 6;
	}
	

	
}
