package recursion;

public class NthFibonacciNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println("Nth Fibonacci: " + fibonacci(n));
	}

	/**
	 * method computes nth fibonacci number
	 * sequence is 0,1,1,2,3,4,5
	 * 2 is the 3rd fibonacci number in the series.
	 * this series follows 0-based indexing
	 * @param n
	 * @return
	 */
	private static int fibonacci(int n) {
		if (n == 0 || n == 1)
			return n;
		
		// n-1 fibonacci
		int n_1 = fibonacci(n - 1);
		// n-2th fibonacci
		int n_2 = fibonacci(n - 2);
		
		// sum of both previous fibonacci numbers
		return n_1 + n_2;
	}

}
