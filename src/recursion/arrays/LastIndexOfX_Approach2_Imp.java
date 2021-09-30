package recursion.arrays;

/**
 * Given an array of length N and an integer x, you need to find and return the
 * last index of integer x present in the array. Return -1 if it is not present
 * in the array.
 *
 * Last index means - if x is present multiple times in the array, return the
 * index at which x comes last in the array.
 * 
 * You should start traversing your array from 0, not from (N - 1).
 * 
 * @author Durgesh
 *
 */
public class LastIndexOfX_Approach2_Imp {

	public static void main(String[] args) {
		// integer[] containing duplicate elements
		int arr[] = { 10, 20, 50,30, 10, 20, 40, 50, 30 };
		System.out.println("Array length: " + arr.length);

		int x = 50;// element to search
		System.out.println("last index of " + x + " in int[]: " + lastIndex(arr, x));
	}

	/**
	 * method find the element X in int[] starting with index 0
	 * 
	 * @param arr
	 * @param x
	 * @return
	 */
	private static int lastIndex(int[] arr, int x) {
		if (arr == null || arr.length == 0)
			return -1;
		// last index of occurrence of x in int[]
		int index = lastIndex(arr, x, 0);
		return index;
	}

	/**
	 * helper method to find the last index of occurrence of x in int[]
	 * 
	 * @param arr
	 * @param x
	 * @param i
	 * @return
	 */
	private static int lastIndex(int[] arr, int x, int i) {
		int index = -1;

		// invalid index condition
		if (i == arr.length)
			return index;

		// x found in int[]
		if (arr[i] == x) {// 1
			index = i;
		}

		// search x in next index int[]
		int subIndex = lastIndex(arr, x, i + 1);
		if (subIndex != -1 && subIndex > index)
			index = subIndex;
		return index;

	}

}
