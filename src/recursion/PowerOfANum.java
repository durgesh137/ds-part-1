package recursion;

public class PowerOfANum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" " + power(2, 3));
	}

	/**
	 * method finds x to power n recursively
	 * 
	 * @param base
	 * @param exp
	 * @return
	 */
	public static int power(int base, int exp) {
		if (exp == 0)
			return 1;
		int smallPartAns = power(base, exp - 1);
		int ans = base * smallPartAns;
		return ans;
	}
}
