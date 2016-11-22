package chapter3;

public class MultidimensionalArrays {

	public void create() {
		int[][] var1; // 2D array
		int vars[][]; // 2D array
		int[] vars3[]; // 2D array
		int[] vars4[], space[][]; // a 2D a 3D array[]

		String[][] rectangle = new String[3][2];
		rectangle[0][1] = "set";

		// An asymetric multidensional array
		int[][] differentSize = { { 1, 4 }, { 3 }, { 9, 8, 7 } };

		/*
		 * Another way to create an asymetric array is to initializa just an
		 * array's first dimension, and define the size of each array component
		 * in a separate statement
		 */
		int[][] args = new int[4][];
		args[0] = new int[5];
		args[1] = new int[3];

		int[][] twoD = new int[3][2];
		for (int i = 0; i < twoD.length; i++) {
			for (int j = 0; j < twoD[i].length; j++)
				System.out.print(twoD[i][j] + " "); // print element
			System.out.println(); // time for a new row
		}
		
		System.out.println();
		
		for (int i = 0; i < twoD.length; i++) {
			for (int j = 0; j < twoD[i].length; j++)
				System.out.print(twoD[i][j] + " "); // print element
			System.out.println(); // time for a new row
		}

	}

	public static void main(String[] args) {
		MultidimensionalArrays ma = new MultidimensionalArrays();
		ma.create();

	}

}
