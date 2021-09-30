package recursion.string;

/**
 * Given a string, compute recursively a new string where all appearances of
 * "pi" have been replaced by "3.14".
 *
 * input: xpix output: x3.14x 2 APPROACHES ARE DISCUSSED...
 * 
 * @author Durgesh
 *
 */
public class ReplacePI_inString {

	public static void main(String[] args) {
//		String pattern = "xpix";
		String pattern = "pipi";
		System.out.println("Original String: " + pattern);
//		System.out.println("Replaced string: " + replacePi_StringApproach(pattern));
		System.out.println("Replaced string: " + replacePi_IndexApproach(pattern, 0));
	}

	/**
	 * This approach replaces each occurrence of pi with 3.14 In each recursive
	 * call, the effective input string to work on is reduced, thus eventually it
	 * stops when length of input string to be replaced is less than "pi" length
	 * 
	 * @param input
	 * @return
	 */
	private static String replacePi_StringApproach(String input) {
		// validating string if workable
		if (input == null || input.length() < "pi".length())
			return input;

		// check if initial string is "pi"
		if (input.startsWith("pi")) {
			input = "3.14" + replacePi_StringApproach(input.substring("pi".length()));
			return input;
		}
		// handling case when input does not start with pi
		char firstChar = input.charAt(0);
		// checking rest subString to replace pi
		String replacedString = replacePi_StringApproach(input.substring(1));
		// concatenating firstChar and replacedString
		input = firstChar + replacedString;

		return input;
	}

	/**
	 * This approach modifies index to look for occurence of "pi" in input string if
	 * found, replaced by "3.14".
	 * This process is repeated till "pi" is not replaced from
	 * complete input string
	 * 
	 * @param input
	 * @param index
	 * @return
	 */
	private static String replacePi_IndexApproach(String input, int index) {
		// validating string workable
		if (input == null || index >= input.length() - 1)
			return input;

		// check if "pi" found
		if (input.substring(index, index + 2).equals("pi")) {
			// replacing "pi" with "3.14
			input = input.substring(0, index) + "3.14" + input.substring(index + 2);
			// incrementing index by 3
			index = index + 3;//now index points at character '4' in input

		}
		input = replacePi_IndexApproach(input, index + 1);
		return input;
	}
}

