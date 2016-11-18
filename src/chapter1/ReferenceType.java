package chapter1;

public class ReferenceType {

	public static void main(String[] args) {
		// int value = null; //DOES NOT COMPILE
		String s = null;
		
		String reference = "hello";
		int len = reference.length();
		// int bad = len-length(); //DOES NOT COMPILE
		
		String s1, s2;
		String s3 = "yes", s4 = "no";
		//int num, String value; //DOES NOT COMPILE

		boolean b1, b2;
		String s5 = "1", s6;
		//double d1, double d2; //DOES NOT COMPILE
		int i1; int i2;
		//int i3; i4; //DOES NOT COMPILE
		int i3,
		i4;
		
		String okidentifier;
		String $0K2Identifer;
		String _alsoOK1d3ntifi3r;
		String __SStillOkbutKnotsonice$;
		
		//String 3DPotinClass // IDENTIFIERS CANNOT BEGIN WITH A NUMER
		//String hollywood@vine; //@ is not a letter, digit, $ or _
		//String *$coffee // * is not a letter, digit, $ or _
		//Strign public //public us a reserved word
	}

}
