package recursion.arrays;

import java.util.Arrays;

public class CheckIfArrayisSorted {

	public static void main(String[] args) {
		//int[] defined
		int a[] = { 10, 20, 30, 40, 50, 60 };
		printDetailsAndCheckSorted(a);
		
		a = new int[]{12,14,22,34,200};
		System.out.println();
		printDetailsAndCheckSorted(a);

		a = new int[]{12,14,22,43,123,1000, 200};
		System.out.println();
		printDetailsAndCheckSorted(a);

	}

	private static void printDetailsAndCheckSorted(int[] a) {
		System.out.println("Array data: " + Arrays.toString(a));
		System.out.println("Size: " + a.length);
		System.out.println("is Array sorted? " + isSorted(a));

	}

	/**
	 * 
	 * @param a
	 * @return
	 */
	public static boolean isSorted(int[] a) {
		if (a == null || a.length == 0)
			return false;
		if (a.length == 1)
			return true;
		return isSorted(a, 0);
	}

	/**
	 * 
	 * @param a
	 * @param i
	 * @return
	 */
	private static boolean isSorted(int[] a, int i) {
		boolean sortedOrNot = true;
		// i less last index of array
		if (i < a.length - 1) {
			// current value more than next value
			if (a[i] > a[i + 1]) {
				return false;
			}
			//check if i+1 array is sorted or not
			boolean preSorted = isSorted(a, i + 1);
			if (!preSorted)
				sortedOrNot = false;
		}
		return sortedOrNot;
	}

}
/**
Algorithm CHECKS IF ARRAY IS SORTED OR NOT
===========================================
1. declare and initialize sortedOrNot boolean variable as true.
2. check if index value i is less than last valid index of array arr. that is i < arr.length -1
	check if the ith value of arr is more than i+1th value of arr, then false is returned
	Recursive call to same function is made by passing array with i+1, and returned value is stored in 
	boolean preSorted variable.
	if value of preSorted is false, then sortedOrNot variable is modified with false value.
3. the sortedOrNot variable is returned at the end.
*/