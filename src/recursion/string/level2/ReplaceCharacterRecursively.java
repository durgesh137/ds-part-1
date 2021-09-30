package recursion.string.level2;

/**
 * Given an input string S and two characters c1 and c2, you need to replace
 * every occurrence of character c1 with character c2 in the given string. Do
 * this recursively.
 * 
 * Input Format : Line 1 : Input String S Line 2 : Character c1 and c2
 * (separated by space) INPUT: abacd a x
 * 
 * @author Durgesh
 *
 */
public class ReplaceCharacterRecursively {

	public static void main(String[] args) {
		String input = "abacd";
		char c1 = 'a', c2 = 'x';
//		String input = "aaaa";
//		String input = "xxyy";
		System.out.println("Original string: " + input);
		System.out.println("Output string: " + replaceCharacter(input, c1, c2));

	}

	/**
	 * 
	 * @param input
	 * @param c1
	 * @param c2
	 * @return
	 */
	public static String replaceCharacter(String input, char c1, char c2) {
		//validate input
		if (input == null || input.length() < 1) {
			return input;
		}
		// input contains atleast one character now
		String firstChar = "";
		// element matched with c1 character
		if (input.charAt(0) == c1)
			firstChar = c2 + "";
		else// first character did not match
			firstChar = input.substring(0, 1);

		return firstChar + replaceCharacter(input.substring(1), c1, c2);
	}
}

/**
ALGO to replace character c1 if exists in input string with c2 character
1. check if input is null or input length is less than 1, return input
2. check if 0th index character is c1, then it is replaced by adding c2
  else, character at index 0 is stored in firstChar string
 3. the firstchar string is append with the string returned by the
 recursive call made by passing substring of input starting from index 1
 having parameters as c1 and c2.
 */
