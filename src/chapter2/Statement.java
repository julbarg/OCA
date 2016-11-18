package chapter2;

public class Statement {

	public void ifThenStatement(int hourOfDay) {
		if (hourOfDay < 11) {
			System.out.println("Good morning");
		}
	}

	public void ifThenEsle(int hourOfDay) {
		if (hourOfDay < 11) {
			System.out.println("Good Morning");
		} else if (hourOfDay < 15) {
			System.out.println("Good Afternoon");
		} else {
			System.out.println("Good Evening");
		}
	}

	public void ternaryOperator() {
		int y = 10;
		int x;
		if (y > 5) {
			x = 2 * y;
		} else {
			x = 3 * y;
		}
		x = (y > 5) ? (2 * y) : (3 * y);
		x = y > 5 ? 2 * y : 3 * y; // Without Parentheses

		System.out.println(y > 5 ? 21 : "Zebra");
		// int animal = (y<91)?9:"Horse"; //DOES NOT COMPILE

		int r = 1;
		int f = 1;
		final int g = r > 2 ? r++ : r++;
		System.out.println(g);

	}

	public void switchStatement() {
		int dayOfWeek = 0;
		switch (dayOfWeek) {
		default:
			System.out.println("Weekday");
			break;
		case 0:
			System.out.println("Sunday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		}
	}

	public int getSortOrder(String firstName,
			final String lastName /* It's not a constant expression */) {
		String middleName = "Patricia";
		final String suffix = "JR";
		int id = 0;
		switch (firstName) {
		case "Test":
			return 52;
		/*
		 * case middleName: //DOES NOT COMPILE case expression must be constant
		 * expressions id = 5; break;
		 */
		case suffix: // COMPILE becase the suffix is defined as final
			id = 0;
			break;
		/*
		 * case lastName: //DOES NOT COMPILE case expression must be constant
		 * expressions id = 8; //Despite lastName being final, it is not
		 * constant as it is passed to the function break;
		 */
		/*
		 * case 5: //DOES NOT COMPILE This switch works with String not int id =
		 * 7; break;
		 */
		/*
		 * case 'J': //DOES NOT COMPILE This switch works with String not char
		 * id = 10; break;
		 */
		/*
		 * case java.time.DayOfWeek.SUNDAY: //DOES NOT COMPILE This switch works
		 * with String not enums id = 15; break;
		 */
		}
		return id;
	}

	public void whileStatement(int bitesOfCheese) {
		int roomInBelly = 5;
		while (bitesOfCheese > 0 && roomInBelly > 0) {
			bitesOfCheese--;
			roomInBelly--;
		}
		System.out.println(bitesOfCheese + " pieces of cheese left");
	}

	public void forStatemnt(){
		for(int i = 0; i <10; i++){
			System.out.print(i + " ");
		}
		System.out.println();
		
		int x = 0;
		for(long y = 0, z = 4; x < 5 && y < 10; x++, y++){
			System.out.print(y + " ");
		}
		System.out.println(x);
		
		int r = 0;
		/*for (long y = 0, int r = 4; x < 5 && y< 10; x++, y++) { //DOES NOT COMPILE
			//Redeclaring a Variable in the Initialization Block
		}*/
		
		int x1 = 0;
		long y = 10;
		for(y = 0, x1 = 4; x1 < 5 && y < 10; x1++, y++) {
			System.out.print(x + " ");
		}
		
		/*for(long y = 0, int x = 4; x < 5 && y<10; x++, y++) { // DOES NOT COMPILE
			//Using Incompatible Data Types
			System.out.print(x + " ");
		}*/
		
		for(long s = 0, p = 4; p < 5 && s < 10; p++, s++) {
			System.out.print(s + " ");
		}
		// System.out.print(p); // DOES NOT COMPILE Using Loop Variables Outside the Loop
	}
	
	public void forEachStatement(){
		String[] arg = new String[2];
		for(String data:arg){
			
		}
		
		Short[] integers = new Short[2];
		for(int i:integers){
			
		}
	}

	public static void main(String[] args) {
		int r = 1;
		int f = 1;
		int g = r < 10 ? r++ : f++;
		System.out.println(g);
		System.out.println(r);
		System.out.println(f);

		Statement statement = new Statement();
		System.out.println("SWITCH");
		statement.switchStatement();

		statement.forStatemnt();
	}

}
