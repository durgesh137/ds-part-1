package recursion;

public class CountDigitsInNumber {

	public static void main(String[] args) {
		System.out.println("Digits: " + count(2320));

	}

	/**
	 * find out and return the number of digits present in a number recursively. 1<=
	 * n <=10^6
	 * 
	 * @param n
	 * @return
	 */
	public static int count(int n) {
		//separately handling case when only 0 is passed
		if (n == 0)
			return 1;
		else {
			return countHelper(n);
		}
	}

	/**
	 * helper method in counting digits in a number
	 * @param n
	 * @return
	 */
	private static int countHelper(int n) {
		if (n == 0)
			return 0;
		int digits = countHelper(n / 10);
		return 1 + digits;
	}
}
