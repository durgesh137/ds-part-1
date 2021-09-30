package recursion.string;

public class RemoveCharXFromString {

	public static void main(String[] args) {
//		String input = "xaxb";
		String input = "xx";
		System.out.println("Original string: " + input);
		System.out.println("Modified string: " + removeX(input));
	}

	/**
	 * Method removes 'x' from input string and returns it 
	 * This method reduces the
	 * input string to work on, with each recursive call and removes char 'x' from
	 * the whole string.
	 * 
	 * @param input
	 * @return
	 */
	public static String removeX(String input) {
		// input length
		if (input == null || input.length() < "x".length())
			return input;

		// character 'x' found in input string
		if (input.charAt(0) == 'x') {
			input = removeX(input.substring(1));
			return input;
		}

		// case when 'x' does not exist at index 0
		input = input.charAt(0) + removeX(input.substring(1));
		return input;
	}

}
