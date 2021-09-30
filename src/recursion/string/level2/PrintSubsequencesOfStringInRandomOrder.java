package recursion.string.level2;

public class PrintSubsequencesOfStringInRandomOrder {

	public static void main(String[] args) {
//		String input = "xyz";
		String input = "hello";
		printSubsequences(input);
	}

	/**
	 * method prints the all the possible subsequences of string
	 * 
	 * @param input
	 */
	public static void printSubsequences(String input) {
		printSubsequences(input, "");
	}

	/**
	 * helper method to extract subsequences and print them
	 * 
	 * @param input
	 * @param string
	 */
	private static void printSubsequences(String input, String soFar) {
		if (input.length() == 0) {
			System.out.println(soFar);
			return;
		}
		//first character of input string
		char firstChar = input.charAt(0);
		
		// not including the first character of input string
		printSubsequences(input.substring(1), soFar);

		// including the first character of input string
		printSubsequences(input.substring(1), soFar + firstChar);

	}

//	/**
//	 * incomplete method
//	 * @param input
//	 */
//	public static void printSubsequencesInOrder(String input) {
//		printSubsequencesInOrder(input, "");
//			
//	}
//	
//	private static void printSubsequencesInOrder(String input, String soFar) {
//		if (input.length() == 0) {
//			System.out.println(soFar);
//			return;
//		}
//		char firstChar = input.charAt(0);
//	}


}

/**
 * ALGO to print subsequences of string
 * =========================================
 * 1. Takes 2 strings one as input string having actual complete string, and other one named 
 * soFar at empty string to hold separate subsequences
 * 	call printSubsequences(input,soFar)
 * 
 * 2. check if input length is 0, then print soFar string and return
 * 
 * 3. Store the first character of input string in firstChar character variable.
 * 
 * 4. Make a recursive call to the same function, passing substring of input string from index 1, along
 * with appending the firstChar variable at end of soFar string as
 * 	printSubsequence(s.substring(1), soFar + firstChar)
 * 
 * 5. Make a recursive call to same function, passing substring of input string from index 1, and other parameter soFar only
 *   printSubsequence(s.substring(1), soFar)
 */


/**
Things to do
1. Generate all possible subsequences of string in order
2. Generate only unique subsequences of string
*/