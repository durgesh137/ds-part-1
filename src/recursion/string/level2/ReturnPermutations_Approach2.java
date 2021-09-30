package recursion.string.level2;

import java.util.Arrays;

/**
 * Return Permutations - String Given a string S, find and return all the
 * possible permutations of the input string. 
 * 
 * Note 1 : The order of permutations is not important. 
 * Note 2 : If original string contains duplicate characters,
 * permutations will also be duplicates.
 * 
 * @author Durgesh
 *
 */
public class ReturnPermutations_Approach2 {

	public static void main(String[] args) {
		testCase("asd");
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
		return permute(input, 0);
	}

	private static String[] permute(String input, int i) {
		if(i == input.length())
			return new String[] {""};
		char firstChar = input.charAt(0);
		String subAns[] = permute(input.substring(1), i);
		
		return null;
	}
}
