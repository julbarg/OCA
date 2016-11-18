package chapter1;

public class InitializationVariables {
	
	public int notValid() {
		int y = 10;
		int x;
		//int reply = x + y; //DOES NOT COMPILE
		
		//return reply;
		boolean r;
		//System.out.println(r); //DOES NOT COMPILE
		
		return y;
	}
	
	public int valid() {
		int y = 10;
		int x;
		x = 3;
		int reply = x + y;
		
		return reply;
	}
	
	public void findAnswer(boolean check){
		int answer;
		int onlyOneBranch;
		if(check){
			onlyOneBranch = 1;
			answer = 1;
		} else{
			answer = 2;
		}
		System.out.println(answer);
		//System.out.println(onlyOneBranch); //DOES NOT COMPILE
	}
	
	public static void main(String[] args) {
		
	}
	
	/*
	 * INSTANCE VARIABLES - CLASS VARIABLES
	 */
	
	//Default initialization value 
	boolean b; //false
	int i; //0 (byte, short, int, long)
	double d; //0.0 (float, double)
	char c; // u000 (NUL)

}
