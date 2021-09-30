package recursion.string.level2;

/**
 * 
 * Return Keypad Code  
 * Given an integer n, using phone keypad find out all the possible strings 
 * that can be made using digits of input n. 
 * Return empty string for numbers 0 and 1. 
 * 
 * Note : 1. The order of strings are not important. 
 * 
 * @author Durgesh
 *
 */
public class ReturnKeyPadCode {

	public static void main(String[] args) {
		test(234);
	}

	private static void test(int n) {
		System.out.println("number: " + n);
		String result[] = keypad(n);
		System.out.println("Output: ");
		for (String s : result)
			System.out.println(s);

		System.out.println("Possible codes: " + result.length);

	}

	/**
	 * method returns the code for number passed in method
	 * @param n
	 * @return
	 */
	public static String[] keypad(int n) {// 23
		// n is 0 or 1, return blank string[]
		if (n <= 1) {
			return new String[] { "" };
		}
		// make recursive call to sub value
		String subAns[] = keypad(n / 10);// 2 0
		
		// get codes in form string[]
		String codes[] = keypad_helper(n % 10);// 3 2{abc}
		//String[] result for appending both string[]
		String result[] = new String[subAns.length * codes.length];

		int k = 0;
		//appending subAns with codes chars
		for (int i = 0; i < subAns.length; i++) {
			for (int j = 0; j < codes.length; j++) {
				//append subAns[] char followed by codes[]
				result[k++] = subAns[i] + codes[j];
			}
		}
		return result;
	}

	/**
	 * Method returns all possible code for given integer
	 * using overloaded another keypad method requiring two parameters
	 * @param n
	 * @return
	 */
	// Return a string array that contains all the possible strings
	public static String[] keypad_approach2(int n) {
		if (n <= 1) {
			return new String[] { "" };
		}
		String result[] = keypad(n, 0);
		return result;
	}

	/**
	 * method provides the possible codes as per given numbers
	 * helper method for approach 2
	 * @param n
	 * @param i
	 * @return
	 */
	private static String[] keypad(int n, int last) {
		if (n <= 1) {
			if (last != 0)
				return keypad_helper(last);
			return new String[] { "" };
		}
		String lastCodes[] = keypad_helper(last);// a,b,c
		String subAns[] = keypad(n / 10, n % 10);// 2,3
		String result[] = new String[subAns.length * lastCodes.length];
		int k = 0;
		for (int i = 0; i < subAns.length; i++) {// ""
			for (int j = 0; j < lastCodes.length; j++) {// d,e,f
				result[k++] = subAns[i] + lastCodes[j];
			}
		}
		return result;

	}

	/**
	 * method provides the code for each keypad number in string[]
	 * 
	 * @param n
	 * @return
	 */
	private static String[] keypad_helper(int n) {
		if (n >= 2 && n <= 9) {
			if (n == 2)
				return new String[] { "a", "b", "c" };
			else if (n == 3)
				return new String[] { "d", "e", "f" };
			else if (n == 4)
				return new String[] { "g", "h", "i" };
			else if (n == 5)
				return new String[] { "j", "k", "l" };
			else if (n == 6)
				return new String[] { "m", "n", "o" };
			else if (n == 7)
				return new String[] { "p", "q", "r", "s" };
			else if (n == 8)
				return new String[] { "t", "u", "v" };
			else
				return new String[] { "w", "x", "y", "z" };

		} else
			return new String[] { "" };

	}
}
