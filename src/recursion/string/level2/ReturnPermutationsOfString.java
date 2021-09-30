package recursion.string.level2;

import java.util.Arrays;

/**
 * Return Permutations - String
Given a string S, find and return all the possible permutations of the input string.
Note 1 : The order of permutations is not important.
Note 2 : If original string contains duplicate characters, permutations will also be duplicates.

 * @author Durgesh
 *
 */
public class ReturnPermutationsOfString {

	public static void main(String[] args) {
		testCase("wxyz");
	}

	private static void testCase(String input) {
		System.out.println("Possible permutations of " + input + ":");
		System.out.println(Arrays.toString(permutationOfString(input)));
	}

	/**
	 * method provides all possible permutations of input string
	 * 
	 * @param input
	 * @return
	 */
	public static String[] permutationOfString(String input) {
		// check if input length is 0 or 1
		if (input.length() <= 1)
			return new String[] { input };// [0];

		// store the the first char
		char firstChar = input.charAt(0);
		// recursive call from index 1
		String subAns[] = permutationOfString(input.substring(1));

		// compute possible length of String result[]
		int len = 0;
		for (int i = 0; i < subAns.length; i++) {
			len += subAns[i].length() + 1;
		}
		// String[] to store possible permutations
		String result[] = permute_helper(subAns, len, firstChar);

		return result;
	}

	/**
	 * 
	 * @param subAns
	 * @param len
	 * @param firstChar
	 * @return
	 */
	private static String[] permute_helper(String[] subAns, int len, char firstChar) {
		String result[] = new String[len];
		int k = 0;
		for (int i = 0; i < subAns.length; i++) {
			// appending firstChar at all possible places in ith string of subAns[]
			// like append before, append after each character
			for (int j = 0; j < subAns[i].length(); j++) {

				result[k] = subAns[i].substring(0, j) + firstChar + subAns[i].substring(j);
				k++;
			}
			// append firstChar at last end of subAns[i]
			if (k < result.length)
				result[k++] = subAns[i] + firstChar;
		}
		return result;
	}
}

/**
 * algorithm of PERMUTATIONS OF STRING ===================================== 
 * 1.Check if input length <=1, return new String[]{input}; 
 * 
 * 2. Store first character of input variable in firstChar variable 
 * 
 * 3. Make a recursive call,passing substring of input from index 1, and store the result in
 * subAns[] of type String String subAns[] = permute(input.substring(1))
 * 
 * 4.Compute length of result[] by traversing the subAns[] in loop, and adding
 * length of each string in subAns[] + 1 
 * 
 * 5.Make a call permute_helper to compute all the permutations by passing length of result[], subAns[], and firstChar
 * variable. String result[] = permute_helper( subAns, len, firstChar) 6. Return
 * the result[]
 * 
 * Permute_helper function
 * ========================
 * This function simply appends firstChar at all possible positions in each string of subAns[] and stores in result[]
 * This result[] is returned at the end.
 * Possible positions for string "yz" of length 2 will be, _y_z_, that is 3 positions
 * 	
 * 
 * Find all PERMUTATIONS of String input = "xyz", 
 *=========================================================================
 * 1.now store firstchar as x,
 * 2.Take substring in yz, and generate all possible permuations of length 2,
 * {"yz", "zy"}
 * 
 * 3. Append firstChar at all the possible positions of all generate
 * permutations of yz. That is for "yz", for string of length 2, possible
 * placements will be _y_z_, that is 3 possibilities, similarly
 * 4. Return the result[]
 */