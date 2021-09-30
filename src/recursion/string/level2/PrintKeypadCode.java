package recursion.string.level2;

/**CORRECT...
 * Given an integer n, using phone keypad find out and print all the possible
 * strings that can be made using digits of input n. Note : The order of strings
 * are not important. Just print different strings in new lines.
 * 
 * @author Durgesh
 *
 *         INPUT: 23 OUTPUT: ad ae af bd be bf cd ce cf
 */
public class PrintKeypadCode {

	public static void main(String[] args) {
		int n = 234;
		test(n);
	}

	private static void test(int n) {
		System.out.println("Possible keypad combinations of "+n+": ");
		printKeypad(n);

	}
	public static void printKeypad(int input) {//23
		printKeypad(input, "");
	}

	/**
	 * here length of individual keypad code will atleast same as the
	 * total number of digits in the original input integer 
	 * @param input
	 * @param soFar
	 */
	private static void printKeypad(int input, String soFar) {
		if(input <= 1) {
			System.out.println(soFar);
			return;
		}
		String codes[] = keypad_helper(input % 10);//3{ghi}
		//now rest digits of input number will go with each character present in codes[]
		for(int i =0; i< codes.length; i++) {
			printKeypad(input/10, codes[i] + soFar);
		}
	}
	
	/**
	 * method provides the String[] for the integer n
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

/**
 * Example: input = 23
 *1. now, just a convention to obtain the last digit of input, input %10, gives 3
 *2. Obtain the code for 3 from helper method, {d,e,f}
 *3. Now make a separate call of input/10, that is 2 with each character of step 2, that is {d,e,f}
 *	appending each character at start with soFar variable
 *4. Base case is reached, when input length is 0, or less than equal to 1, when base condition met
 *print the soFar variable on the console.
 *
 *Program simulation using Recursive call:
 *printKeypad(23)
 *printKeypad(23, "")
 *	printKeypad(23/10, d+"") -> printKeypad(2/10, a+"d") -> "ad"
 *							 -> printKeypad(2/10, b+"e") -> "ad"
 *							 -> printKeypad(2/10, c+"f") -> "ad"
 *	printKeypad(23/10, e+"") -> printKeypad(2/10, a+"e") -> "ae"
 *							 -> printKeypad(2/10, b+"e") -> "be"
 *							 -> printKeypad(2/10, c+"e") -> "ce"
 *printKeypad(23/10, f+"") 	 -> printKeypad(2/10, a+"f") -> "af"
 *							 -> printKeypad(2/10, b+"f") -> "bf"
 *							 -> printKeypad(2/10, c+"f") -> "cf"
 *
 */
