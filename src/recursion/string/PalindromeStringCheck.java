package recursion.string;

public class PalindromeStringCheck {

	public static void main(String[] args) {
		String s = "racescar";
		System.out.println(s + " is palindrome? " + isStringPalindrome(s));
	}

	/**
	 * racecar
	 * 
	 * @param input
	 * @return
	 */
	public static boolean isStringPalindrome(String input) {
		boolean isPalindrome = true;
		if (input == null || input.length() == 1)
			return isPalindrome;
		isPalindrome = isStringPalindrome(input, 0, input.length() - 1);
		return isPalindrome;
	}

	/**
	 * method incomplete
	 * 
	 * @param input
	 * @param i
	 * @return
	 */
	private static boolean isStringPalindrome(String input, int start, int end) {
		// boolean variable assuming string as palindrome
		boolean isPalindrome = true;
		// start index and end Overlaps
		if (start >= end)
			return true;

		// characters from start and end mismatch
		if (input.charAt(start) != input.charAt(end))
			return false;

		// check substring if palindrome
		boolean restString = isStringPalindrome(input, start + 1, end - 1);
		// restString is not palindrome
		if (!restString)
			isPalindrome = false;// updating isPalindrome with false
		return isPalindrome;
	}
}
