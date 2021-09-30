package recursion;

/**
 * Given an integer N, count and return the number of zeros that are present in
 * the given integer using recursion.
 * 
 * @author Durgesh
 *
 */
public class CountZerosInNumber {

	public static void main(String[] args) {
		int n = 1000;
		System.out.println("Number of zeros in " + n + ": " + countZerosRec(n));
		n = 2320;
		System.out.println("Number of zeros in " + n + ": " + countZerosRec(n));
	}

	/**
	 * method counts all 0s present in number n = 23;
	 * takes whole numbers only
	 * @param input
	 * @return
	 */
	public static int countZerosRec(int n) {
		int zeros = 0;
		if (n == 0) {
			return 1;
		}
		if (n < 10)// n>=1 && n < 10
			return zeros;// 0
		else if (n % 10 == 0) { // n is factor of 10
			zeros++;
			int preZeros = countZerosRec(n / 10);
			return zeros + preZeros;
		}
		// n is more than 10, but not multiple of 10
		return countZerosRec(n / 10);
	}
}
