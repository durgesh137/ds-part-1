package recursion.arrays;

import java.util.Arrays;

/** CORRECT ONE..
 * ALGO WRITTEN IN array-note text file
 * Given an array of length N and an integer x, you need to find all the indexes
 * where x is present in the input array.
 *
 * Save all the indexes in an array (in increasing order). Do this recursively.
 * Indexing in the array starts from 0.
 * 
 * This program finds the all the indexes of X in array having duplicates and
 * stores all those indexes in an array.
 * 
 * @author Durgesh
 *
 */
public class AllIndicesOfX_inArray {

	public static void main(String[] args) {
//		int a[] = { 9, 8, 10, 8, 8 };
//		int x = 8;
		int a[] = {15 ,24 ,58 ,61 ,79 ,3 ,97 ,81 ,81 ,45 ,62 ,21 ,72 ,72 ,68 ,45 ,11 ,50 ,87 ,20 ,28 ,77 ,51 ,89 ,58 ,66 };
		int x = 23;

		int indices[] = allIndexes(a, x);
		System.out.println(Arrays.toString(indices));
	}

	/**
	 * 
	 * @param input
	 * @param x
	 * @return
	 */
	public static int[] allIndexes(int input[], int x) {
		if (input == null || input.length == 0) {
			int size_0[] = new int[0];
			return size_0;
		}
		return allIndexes(input, x, 0);
	}
/**
 * 
 * @param input
 * @param x
 * @param i
 * @return
 */
	private static int[] allIndexes(int[] input, int x, int i) {
		// index is equal to array length
		if (i == input.length) {
			int size_0[] = new int[0];
			return size_0;
		}
		// find subindexes[] having index of
		// occurrences of x in input[]
		int subAns[] = allIndexes(input, x, i + 1);
		if (input[i] != x)
			return subAns;
		else {
			// since x is found
			// hence create ans[] having 1 lengtsh 
			//more than subAns
			int ans[] = new int[subAns.length + 1];
			ans[0] = i;
			// copy each element of subans in ans[]
			for (int j = 0; j < subAns.length; j++) {
				ans[j + 1] = subAns[j];
			}
			return ans;
		}

	}
}

class Solution {
	public static int[] allIndexes(int input[], int x, int startIndex) {
		if (startIndex == input.length) {
			int output[] = new int[0];
			return output;
		}
		int smallOutput[] = allIndexes(input, x, startIndex + 1);
		if (input[startIndex] == x) {
			int output[] = new int[smallOutput.length + 1];
			output[0] = startIndex;
			for (int i = 0; i < smallOutput.length; i++) {
				output[i + 1] = smallOutput[i];
			}
			return output;
		} else {
			return smallOutput;
		}
	}

	public static int[] allIndexes(int input[], int x) {
		return allIndexes(input, x, 0);
	}
}