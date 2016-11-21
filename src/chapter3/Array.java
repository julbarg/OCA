package chapter3;

import java.util.*;
import java.util.Arrays;

public class Array {
	
	public void arrays() {
		// When using this form to instantiate an array, set all the elements 
		// to the default value for the type 
		int[] numbers = new int[3];
		System.out.println(numbers[0]);
		
		int[] numbers2 = new int[]{42, 55, 99};
		int[] numbers3 = {42, 55, 99};
		
		int[] numAnimals;
		int [] numAnimals2;
		int numAnimals3[];
		int numAnimals4 [];
		
		int[] ids, types; //both array int 
		int ids2[], types2; // only ids2 is an array
	}
	
	public void arrayReferenceVariables() {
		String [] bugs = {"cricket", "beetle", "ladybug"};
		String [] alias = bugs;
		
		//It return because of reference equality. The 
		//The equs method on arrays does not look at the elements of the array
		System.out.println(bugs.equals(alias));
		System.out.println(bugs.toString());
		
		String [] str1 = {"1", "2", "3"};
		String [] str2 = {"1", "2", "3"};
		System.out.println(str1.equals(str2));
		
		String[] strings = { "stringValue" };
		Object[] objects = strings;
		String[] againStrings = (String[]) objects;
		//againStrings[0] = new StringBuilder(); 	
		//objects[0] = new StringBuilder(); //throw an ArrayStoreException
	}
	
	public void usiingArray() {
		String[] mammals = {"monkey", "chimp", "donkey"};
		System.out.println(mammals.length);
		System.out.println(mammals[0]);
		System.out.println(mammals[1]);
		System.out.println(mammals[2]);
		
		String[] birds = new String[6];
		System.out.println(birds.length);
		// birds[birds.length] = "Stro"  // ArrayIndexOutOfBoundsException;
	}
	
	public void sorting() {
		int[] numbers = {6, 9, 1};
		Arrays.sort(numbers);
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		
		System.out.println();
		
		/*
		 * String sorts in alphabetic order.
		 */
		String[] strings = {"6", "9", "11", "2", "100"};
		Arrays.sort(strings);
		for(String string: strings){
			System.out.print(string + "-");
		}
	}
	
	public void searchBinarySearch() {
		/*
		 * BynariSearch: Way to search but only if the array is already sorted
		 * Target element found in sorted array
		 * 	Index of match
		 * Target element not found in sorted array 
		 * 	Negative value showing one smaller than the negative of index,
		 * 	where a match needs to be inserted to preserve sorted order
		 * Unsorted array
		 * 	A supresi - this result isn't predictable
		 */
		int[] numbers = {2, 4, 6, 8};
		System.out.println(Arrays.binarySearch(numbers, 2)); // 0
		System.out.println(Arrays.binarySearch(numbers, 4)); // 1
		/*
		 * The search can determine that it should be inserted at element 0 to preserve the sorted order.
		 * Since 0 already means something for array indexes,
		 * Java needs to substract 1 to give us the answer of -1
		 */
		System.out.println(Arrays.binarySearch(numbers, 1)); // -1 []
		System.out.println(Arrays.binarySearch(numbers, 3)); // -2
		System.out.println(Arrays.binarySearch(numbers, 9)); // -5
		
		System.out.println();
		
		int[] numbers2 = new int[] {3, 2, 1};
		System.out.println(Arrays.binarySearch(numbers2, 2));
		System.out.println(Arrays.binarySearch(numbers2, 3));
		
	}

	public static void main(String[] args) {
		Array a = new Array();
		a.arrays();
		a.arrayReferenceVariables();
		a.usiingArray();
		a.sorting();
		a.searchBinarySearch();

	}

}
