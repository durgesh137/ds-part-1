package recursion.arrays;

/**
 * This class finds the last index of element X present in the array having the
 * duplicates recursively
 * 
 * @author Durgesh
 *
 */
public class LastIndexOfX_inArray {

	public static void main(String[] args) {
		// integer[] containing duplicate elements
		int arr[] = { 10, 20, 30, 10, 20, 40, 50, 30 };
		System.out.println("Array length: " + arr.length);

		int x = 20;// element to search
		System.out.println("last index of " + x + " in int[]: " + lastIndex(arr, x));
	}

	/**
	 * method finds the last index of x in int[] and returns it
	 * 
	 * @param arr
	 * @param x
	 * @return
	 */
	private static int lastIndex(int[] arr, int x) {
		int index = -1;
		// check if int[] is null || is empty
		if (arr == null || arr.length == 0)
			return index;

		// array contains atleast 1 element
		// search x in array from last
		index = lastIndex(arr, x, arr.length - 1);
		return index;
	}

	/**
	 * helper method to find last index of occurrence of x in int[]
	 * here searching element from last
	 * @param arr
	 * @param x
	 * @param i
	 * @return
	 */
	private static int lastIndex(int[] arr, int x, int endIndex) {
		// endIndex is negative, hence x does not exist
		if (endIndex == -1)
			return -1;

		// check if x found
		if (arr[endIndex] == x) {
			return endIndex;
		}
		// x not found yet, search in subsequent index
		int index = lastIndex(arr, x, endIndex - 1);

		// return the index value
		return index;
	}

}
