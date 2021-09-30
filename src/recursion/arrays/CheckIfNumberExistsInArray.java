package recursion.arrays;

public class CheckIfNumberExistsInArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		int x = 4;
		System.out.println(x + " exists in int[]: " + contains(arr, x));
	}

	/**
	 * method checks if x exists in int[]
	 * 
	 * @param arr
	 * @param x
	 * @return
	 */
	private static boolean contains(int[] arr, int x) {
		boolean found = false;
		if (arr == null || arr.length == 0)
			return found;
		found = contains(arr, x, 0);
		return found;
	}

	/**
	 * Method checks if x exists in int[] or not
	 * 
	 * @param arr
	 * @param x
	 * @param i
	 * @return
	 */
	private static boolean contains(int[] arr, int x, int i) {
		// check if i reaches int[] length
		if (i == arr.length)
			return false;
		// x found in int[]
		if (arr[i] == x)
			return true;
		// searching other indexes if x exists
		boolean result = contains(arr, x, i + 1);
		return result;
	}

}
