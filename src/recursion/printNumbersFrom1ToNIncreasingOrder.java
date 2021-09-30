package recursion;

public class printNumbersFrom1ToNIncreasingOrder {

	public static void main(String[] args) {
		printNumbers(6);

	}

	/**
	 * method prints numbers in increasing order from 1 to n
	 * 
	 * @param n
	 */
	public static void printNumbers(int n) {
		//base case
		if (n == 1) {
			System.out.print(n + " ");
			return;// return from method
		}
		printNumbers(n - 1);
		System.out.print(n + " ");
	}
}
