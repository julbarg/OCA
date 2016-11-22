package chapter3;

import java.util.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListUsing {
	
	public void create(){
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList(10);
		ArrayList list3 = new ArrayList(list2);
		
		//genrics
		ArrayList<String> list4 = new ArrayList<String>();
		ArrayList<String> list5 = new ArrayList<>();
		
		//Using interface
		List<String> list6 = new ArrayList<>();
		// ArrayList<String> list7 = new List<>(); // DOES NOT COMPILE
	}
	
	public void add() {
		/*
		 * Add: Insert a new value in the ArrayList
		 * boolean add(E element)
		 * void add(int index, E element)
		 */
		ArrayList list = new ArrayList();
		list.add("hawk");
		list.add(Boolean.TRUE);
		System.out.println(list);
		
		ArrayList<String> safer = new ArrayList<>();
		safer.add("sparrow");
		// safer.add(Boolean.TRUE); // DOES NOT COMPILE
		
		List<String> birds = new ArrayList<>();
		birds.add("hawk"); // hawk
		birds.add(1, "robin"); // hawk, robin
		birds.add(0, "blue jay"); // blue jay, hawk, robin
		birds.add(1, "cardinal"); // blue jay, carinal, hawk, robin
		birds.add(4, "error");
		System.out.println(birds);
	}
	
	public void remove() {
		/*
		 * Remove the firs matching value in the ArrayList or
		 * remove the element at a specified index
		 * boolean remove(Object object)
		 * E remove(int index)
		 */
		
		List<String> birds = new ArrayList<>();
		birds.add("hawk");
		birds.add("hawk");
		System.out.println(birds.remove("cardinal"));
		System.out.println(birds.remove("hawk"));
		System.out.println(birds.remove(0));
		System.out.println(birds);
		
	}
	
	public void set(){
		/*
		 * Changes one of the elements of the ArrayList
		 * without changing the size
		 * E set(int index, E newElement)
		 */
		List<String> birds = new ArrayList<>();
		birds.add("hawk");
		System.out.println(birds.size());
		birds.set(0, "robin");
		System.out.println(birds.size());
		// birds.set(1, "robin"); //IndexOutOfBoundsException
	}
	
	public void isEmptyAndSize(){
		/*
		 * boolean isEmpty()
		 * int size()
		 */
		List<String> birds = new ArrayList<>();
		System.out.println(birds.isEmpty());
		System.out.println(birds.size());
		birds.add("hawk");
		birds.add("hawk");
		System.out.println(birds.isEmpty());
		System.out.println(birds.size());
		
	}
	
	public void clear() {
		/*
		 * Discard all elements of the ArrayList
		 */
		List<String> birds = new ArrayList<>();
		birds.add("hawk");
		birds.add("hawk");
		System.out.println(birds.isEmpty());
		System.out.println(birds.size());
		birds.clear();
		System.out.println(birds.isEmpty());
		System.out.println(birds.size());
	}
	
	public void contains() {
		/*
		 * Checks whether a certain value is in the ArrayList
		 */
		List<String> birds = new ArrayList<>();
		birds.add("hawk"); // [hawk]
		System.out.println(birds.contains("hawk")); // true
		System.out.println(birds.contains("robin")); // false
	}
	
	public void equals() {
		/*
		 * Compare two list to see if they contain the same elements
		 * in the same order
		 * boolean equals(Object object)
		 */
		List<String> one = new ArrayList<>();
		List<String> two = new ArrayList<>();
		System.out.println(one.equals(two)); // true
		one.add("a");
		System.out.println(one.equals(two)); // false
		two.add("a");
		System.out.println(one.equals(two)); // true
		one.add("b");
		System.out.println(one.equals(two)); // false
		two.add(1, "b");
		System.out.println(one.equals(two)); // true
		
	}
	
	public void wrapperClasses(){
		/*
		 * parseInt return a primitive
		 * valueOf return a wrapper class
		 */
		int primitive = Integer.parseInt("123"); // Primitive
		Integer wrapper = Integer.valueOf("123"); // Wrapper
		
		int bad1 = Integer.parseInt("a"); // throws NumberFormatException
		Integer bad2 = Integer.parseInt("123.45"); // throws NumberFormatException
		
		/*
		 * Boolean 
		 * 		Boolean.parseBoolean("true"); 
		 * 		Boolean.valueOf("TRUE");
		 * Byte 
		 * 		Byte.parseByte("1"); 
		 * 		Byte.valueOf("2");
		 * Short 
		 * 		Short.parseShort("1"); 
		 * 		Short.valueOf("2");
		 * Integer 
		 * 		Integer.parseInt("1"); 
		 * 		Integer.valueOf("2");
		 * Long 
		 * 		Long.parseLong("1"); 
		 * 		Long.valueOf("2");
		 * Float 
		 * 		Float.parseFloat("1"); 
		 * 		Float.valueOf("2.2");
		 * Double 
		 * 		Double.parseDouble("1"); 
		 * 		Double.valueOf("2.2");
		 * Character None None
		 */
		
	}
	
	public void autoBoxing() {
		List<Double> weights = new ArrayList<>();
		//Autoboxes the double primitive into a Double 
		weights.add(50.0);
		//Shows that you can still write code the long way 
		//And pass in a wrapper object
		weights.add(new Double(60));
		// Autoboxes into the wrapper object and passes it to remove
		weights.remove(50.5);
		double first = weights.get(0); // 60.0
		
		List<Integer> height = new ArrayList<>();
		height.add(null);
		// int h = height.get(0); // NullPointerException
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.remove(1); // Remove value in index 1 
		numbers.remove(new Integer(1));
		System.out.println(numbers);
	} 
	
	public void toArray() {
		List<String> list = new ArrayList<>();
		list.add("hawk");
		list.add("robin");
		Object[] array = list.toArray();
		System.out.println(array.length);
		String[] stringArray = list.toArray(new String[0]);
		System.out.println(stringArray.length);
		System.out.println(stringArray);
		
		String[] array2 = {"hawk", "robin"};
		// It is a fixed-size list and is also know a backed
		// Line 220 throws an exception because we are 
		// not allowed to change the size of the list
		List<String> list2 = Arrays.asList(array2);
		System.out.println(list2.size());
		list2.set(1, "test");
		array2[0] = "new";
		for (String b : array2){
			System.out.println(b + " "); // new test
		}
		// list2.remove(1); // throws UnsupportedOperation Exception
		
		/*
		 * Varargs
		 */
		List<String> listV = Arrays.asList("one", "two", "three");
	}
	
	public void sorting() {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(99);
		numbers.add(5);
		numbers.add(81);
		Collections.sort(numbers);
		System.out.println(numbers);
		
		List<String> strings = new ArrayList<>();
		strings.add("99");
		strings.add("25");
		strings.add("181");
		Collections.sort(strings);
		System.out.println(strings);
	}
	
	public static void main(String[] args) {
		ArrayListUsing al = new ArrayListUsing();
		al.add();
		al.remove();
		al.set();
		al.isEmptyAndSize();
		al.clear();
		al.equals();
		
		System.out.println(Boolean.parseBoolean("true"));
		System.out.println(Boolean.parseBoolean("TRUE"));
		System.out.println(Boolean.parseBoolean("TrUe"));
		System.out.println(Boolean.parseBoolean("truetgf")); //false
		
		al.autoBoxing();
		al.toArray();
		al.sorting();
		
		
		int n = 0;
		
		
		
	}

}
