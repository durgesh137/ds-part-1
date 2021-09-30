package recursion.arrays;

/**
 * This class finds the first index of the element X in integer[] having
 * duplicates
 * 
 * @author Durgesh
 *
 */
public class FirstIndexOfX_inArray {

	public static void main(String[] args) {
		int a[] = { 10, 20, 10, 100, 30, 10, 40, 100, 50 };
		PrintArray.printArray(a);
		int x = 10;
		System.out.println("First Occurrence of " + x + ": " + firstIndex(a, x));
	}

	private static int firstIndex(int[] a, int x) {
		if (a == null || a.length == 0)
			return -1;
		int index = firstIndexOfXInArray(a, x, 0);
		return index;
	}

	/**
	 * Method finds and returns the first occurrence index of x in array
	 * 
	 * @param a
	 * @param x
	 * @param index
	 * @return
	 */
	private static int firstIndexOfXInArray(int[] a, int x, int index) {
		if (index == a.length)
			return -1;
		// x found
		if (a[index] == x)
			return index;
		// find x in next indexes of int[]
		index = firstIndexOfXInArray(a, x, index + 1);
		return index;
	}
}
