package recursion.string;

/**
 * Given a string S, compute recursively a new string where identical chars that
 * are adjacent in the original string are separated from each other by a "*".
 * 
 * @author Durgesh
 *
 */
public class PairStar {

	public static void main(String[] args) {
//		String input = "hello";
//		String input = "aaaa";
		String input = "xxyy";
		System.out.println("Original string: " + input);
		System.out.println("Output string: " + addStars(input));

	}

	/**
	 * method adds "*" in string, where identical chars occur consecutively
	 * 
	 * @param s
	 * @return
	 */
	public static String addStars(String s) {
		// null string or length is 0 or 1
		if (s == null || s.length() <= 1)
			return s;
		// minimum length of string s would be 2 now

		// consecutive characters if found would be appended later
		String firstCharString = s.substring(0, 1);

		String rest = "";
		// check if consecutive chars are identical
		if (s.charAt(0) == s.charAt(1)) {
			// separate identical chars with "*"
			firstCharString = firstCharString + "*";
			// check if next char matches with its adjacent char via recursive call
			rest = addStars(s.substring(1));
			return firstCharString + rest;
		}

		// identical chars not found, look at next position
		rest = addStars(s.substring(1));
		return firstCharString + rest;
	}
}